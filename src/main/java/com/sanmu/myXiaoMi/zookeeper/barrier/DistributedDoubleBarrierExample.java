package com.sanmu.myXiaoMi.zookeeper.barrier;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.barriers.DistributedDoubleBarrier;
import org.apache.curator.retry.ExponentialBackoffRetry;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * $双屏障
 *到enter阻塞，所有的线程enter后开始执行，到leave阻塞，所有leave后跳出
 *
 * @author yansen
 * @create 2018-08-09 17:40
 **/
public class DistributedDoubleBarrierExample {
    private static final int QTY = 5;
    private static final String PATH = "/examples/barrier";

    public static void main(String[] args) throws Exception {
        try{
            CuratorFramework client = CuratorFrameworkFactory.newClient("192.168.181.127:2181,192.168.181.128:2181,192.168.181.129:2181", new ExponentialBackoffRetry(1000, 3));
            client.start();

            ExecutorService service = Executors.newFixedThreadPool(QTY);
            for (int i = 0; i < QTY; ++i) {
                final DistributedDoubleBarrier barrier = new DistributedDoubleBarrier(client, PATH, QTY);
                final int index = i;
                Callable<Void> task = new Callable<Void>() {
                    @Override
                    public Void call() throws Exception {

                        Thread.sleep((long) (3 * Math.random()));
                        System.out.println("Client #" + index + " enters");
                        barrier.enter();
                        System.out.println("Client #" + index + " begins");
                        Thread.sleep((long) (3000 * Math.random()));
                        barrier.leave();
                        System.out.println("Client #" + index + " left");
                        return null;
                    }
                };
                service.submit(task);
            }


            service.shutdown();
            service.awaitTermination(10, TimeUnit.MINUTES);

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
