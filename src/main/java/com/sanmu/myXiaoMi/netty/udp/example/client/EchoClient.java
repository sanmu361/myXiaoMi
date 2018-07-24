package com.sanmu.myXiaoMi.netty.udp.example.client;

import com.sanmu.myXiaoMi.netty.udp.example.KryoUtils;
import com.sanmu.myXiaoMi.netty.udp.example.Metric;
import com.sanmu.myXiaoMi.netty.udp.example.Utils;
import org.apache.hive.com.esotericsoftware.kryo.Kryo;

import java.util.Random;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-07-17 13:36
 **/
public class EchoClient {

    public static void main(String[] args) throws Exception{
        // 初始化本地UDP的Socket
        LocalUDPSocketProvider.getInstance().initSocket();
        // 启动本地UDP监听（接收数据用的）
        LocalUDPDataReciever.getInstance().startup();

        Random random  = new Random();

        // 循环发送数据给服务端
        while(true)
        {
            // 要发送的数据
            //String toServer = "Hi，我是客户端，我的时间戳"+System.currentTimeMillis();
            Metric metric = new Metric("sanmu.text",random.nextInt());
            byte[] soServerBytes = KryoUtils.serialize(metric);

            // 开始发送
            boolean ok = UDPUtils.send(soServerBytes, soServerBytes.length);
            if(ok)
                Log.d("EchoClient", "发往服务端的信息已送出.");
            else
                Log.e("EchoClient", "发往服务端的信息没有成功发出！！！");

            // 3000秒后进入下一次循环
            Thread.sleep(3000);
        }
    }
}
