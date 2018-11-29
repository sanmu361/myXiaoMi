package com.sanmu.myXiaoMi.zookeeper.barrier;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.barriers.DistributedBarrier;
import org.apache.curator.retry.ExponentialBackoffRetry;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * $屏障
 * 阻塞所有节点上的等待进程直到某一个被满足，所有节点继续进行
 *
 * @author yansen
 * @create 2018-08-09 17:38
 **/
public class DistributedBarrierExample {
    private static final int QTY = 5;
    private static final String PATH = "/examples/barrier";

    public static void main(String[] args) throws Exception {
        try {
            CuratorFramework client = CuratorFrameworkFactory.newClient("192.168.181.127:2181,192.168.181.128:2181,192.168.181.129:2181", new ExponentialBackoffRetry(1000, 3));
            client.start();

            ExecutorService service = Executors.newFixedThreadPool(QTY);
            DistributedBarrier controlBarrier = new DistributedBarrier(client, PATH);
            controlBarrier.setBarrier();

            for (int i = 0; i < QTY; ++i) {
                final DistributedBarrier barrier = new DistributedBarrier(client, PATH);
                final int index = i;
                Callable<Void> task = new Callable<Void>() {
                    @Override
                    public Void call() throws Exception {

                        Thread.sleep((long) (3 * Math.random()));
                        System.out.println("Client #" + index + " waits on Barrier");
                        barrier.waitOnBarrier();
                        System.out.println("Client #" + index + " begins");
                        return null;
                    }
                };
                service.submit(task);
            }

            Thread.sleep(10000);
            System.out.println("all Barrier instances should wait the condition");


            controlBarrier.removeBarrier();


            service.shutdown();
            service.awaitTermination(10, TimeUnit.MINUTES);

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
