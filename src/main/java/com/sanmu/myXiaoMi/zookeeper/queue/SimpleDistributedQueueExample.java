package com.sanmu.myXiaoMi.zookeeper.queue;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.api.CuratorEvent;
import org.apache.curator.framework.api.CuratorListener;
import org.apache.curator.framework.recipes.queue.*;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.curator.utils.CloseableUtils;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-08-09 17:24
 **/
public class SimpleDistributedQueueExample {

    private static final String PATH = "/example/queue";

    public static void main(String[] args) throws Exception {

        CuratorFramework client = null;
        SimpleDistributedQueue queue = null;
        try {
            client = CuratorFrameworkFactory.newClient("192.168.181.127:2181,192.168.181.128:2181,192.168.181.129:2181", new ExponentialBackoffRetry(1000, 3));
            client.getCuratorListenable().addListener(new CuratorListener() {
                @Override
                public void eventReceived(CuratorFramework client, CuratorEvent event) throws Exception {
                    System.out.println("CuratorEvent: " + event.getType().name());
                }
            });

            client.start();

            queue = new SimpleDistributedQueue(client,PATH);

            for (int i = 0; i < 10; i++) {
                queue.offer((" test-" + i).getBytes("UTF-8"));
                Thread.sleep((long)(3 * Math.random()));
            }

            Thread.sleep(20000);

        } catch (Exception ex) {

        } finally {
            CloseableUtils.closeQuietly(client);
        }
    }

    private static QueueSerializer<String> createQueueSerializer() {
        return new QueueSerializer<String>(){

            @Override
            public byte[] serialize(String item) {
                return item.getBytes();
            }

            @Override
            public String deserialize(byte[] bytes) {
                return new String(bytes);
            }

        };
    }

}
