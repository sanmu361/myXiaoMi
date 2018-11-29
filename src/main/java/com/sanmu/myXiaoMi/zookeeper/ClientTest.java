package com.sanmu.myXiaoMi.zookeeper;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.api.BackgroundCallback;
import org.apache.curator.framework.api.CuratorEvent;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.curator.retry.RetryNTimes;
import org.apache.zookeeper.CreateMode;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-07-09 18:17
 **/
public class ClientTest {

    public static void main(String[] args) throws Exception {
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 10);
        CuratorFramework client = CuratorFrameworkFactory.builder()
                .connectString("192.168.181.127:2181,192.168.181.128:2181,192.168.181.129:2181")
                .sessionTimeoutMs(1000 * 6)
                .retryPolicy(retryPolicy).build();
        client.start();
//        try {
//            client.create().creatingParentsIfNeeded().withMode(CreateMode.PERSISTENT).forPath("/super","c1内容".getBytes());
//            client.delete().guaranteed().deletingChildrenIfNeeded().forPath("/super");
//            String ret1 = new String(client.getData().forPath("/super"));
//
//            System.out.println(ret1);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }


//        // 新加、删除
//
//         //4 建立节点 指定节点类型（不加withMode默认为持久类型节点）、路径、数据内容
        //client.create().creatingParentsIfNeeded().withMode(CreateMode.PERSISTENT).forPath("/super/c1","c1内容".getBytes());
//         //5 删除节点
//        client.delete().guaranteed().deletingChildrenIfNeeded().forPath("/super");
//
//
//        // 读取、修改
//         //创建节点
//        client.create().creatingParentsIfNeeded().withMode(CreateMode.PERSISTENT).forPath("/super/c1","c1内容".getBytes());
//        client.create().creatingParentsIfNeeded().withMode(CreateMode.PERSISTENT).forPath("/super/c2","c2内容".getBytes());
//         //读取节点
//                 String ret1 = new String(client.getData().forPath("/super/c2"));
//                 System.out.println(ret1);
//         //修改节点
//        client.setData().forPath("/super/c2", "修改c2内容".getBytes());
//        String ret2 = new String(client.getData().forPath("/super/c2"));
//        System.out.println(ret2);
//
//
//        // 绑定回调函数
//
//        ExecutorService pool = Executors.newCachedThreadPool();
//        client.create().creatingParentsIfNeeded().withMode(CreateMode.PERSISTENT)
//                .inBackground(new BackgroundCallback() {
//                    @Override
//                    public void processResult(CuratorFramework cf, CuratorEvent ce) throws Exception {
//                        System.out.println("code:" + ce.getResultCode());
//                        System.out.println("type:" + ce.getType());
//                        System.out.println("线程为:" + Thread.currentThread().getName());
//                    }
//                }, pool)
//                .forPath("/super/c3", "c3内容".getBytes());
//        Thread.sleep(Integer.MAX_VALUE);


        // 读取子节点getChildren方法 和 判断节点是否存在checkExists方法
        /**
         List<String> list = cf.getChildren().forPath("/super");
         for(String p : list){
         System.out.println(p);
         }

         Stat stat = cf.checkExists().forPath("/super/c3");
         System.out.println(stat);

         Thread.sleep(2000);
         cf.delete().guaranteed().deletingChildrenIfNeeded().forPath("/super");
         */


        //cf.delete().guaranteed().deletingChildrenIfNeeded().forPath("/super");


        String ret1 = new String(client.getData().forPath("/super/c1"));
        System.out.println(ret1);
        System.out.println("zk operation");
        client.close();

    }

}
