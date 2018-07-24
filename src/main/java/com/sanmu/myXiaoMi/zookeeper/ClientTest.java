package com.sanmu.myXiaoMi.zookeeper;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.curator.retry.RetryNTimes;
import org.apache.zookeeper.CreateMode;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-07-09 18:17
 **/
public class ClientTest {

    public static void main(String[] args){
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);
        CuratorFramework client = CuratorFrameworkFactory.builder().connectString("node1:2181")
                .retryPolicy(retryPolicy).sessionTimeoutMs(1000 * 6).connectionTimeoutMs(1000 * 6).build();
        client.start();
        try {
            client.create().creatingParentsIfNeeded().withMode(CreateMode.PERSISTENT).forPath("/super","c1内容".getBytes());
            String ret1 = new String(client.getData().forPath("/super"));

            System.out.println(ret1);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("zk operation");
        client.close();

    }

}
