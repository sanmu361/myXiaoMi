package com.sanmu.myXiaoMi.netty.udp.example.server;

import com.sanmu.myXiaoMi.netty.udp.example.KryoUtils;
import com.sanmu.myXiaoMi.netty.udp.example.Metric;
import com.sanmu.myXiaoMi.netty.udp.example.Utils;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;
import io.netty.util.CharsetUtil;
import org.apache.hive.com.esotericsoftware.kryo.Kryo;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-07-17 13:40
 **/
public class EchoSeverHandler extends SimpleChannelInboundHandler<DatagramPacket>
{

    @Override
    protected void messageReceived(ChannelHandlerContext ctx, DatagramPacket packet) throws Exception {
        // 读取收到的数据
        ByteBuf buf = (ByteBuf) packet.copy().content();
        byte[] req = new byte[buf.readableBytes()];
        buf.readBytes(req);
        Metric metric = KryoUtils.deserialize(req);
        System.out.println("【NOTE】>>>>>> 收到客户端："+metric.getP() + "  数据：" + metric.getV() + " 时间：" + metric.getT());

        // 回复一条信息给客户端
        ctx.writeAndFlush(new DatagramPacket(
                Unpooled.copiedBuffer("Hello，我是Server，我的时间戳是"+System.currentTimeMillis()
                        , CharsetUtil.UTF_8)
                , packet.sender())).sync();
    }

//	@Override
//	public void channelRegistered(ChannelHandlerContext ctx) throws Exception
//	{
//		super.channelRegistered(ctx);
//		//System.out.println("I got it!");
//	}
}
