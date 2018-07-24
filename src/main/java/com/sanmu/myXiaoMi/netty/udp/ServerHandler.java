package com.sanmu.myXiaoMi.netty.udp;

import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.socket.DatagramPacket;
import io.netty.util.CharsetUtil;
import io.netty.util.internal.ThreadLocalRandom;

public class ServerHandler extends
	SimpleChannelInboundHandler<DatagramPacket> {

    // 谚语列表
    private static final String[] DICTIONARY = { 
    	"葡萄美酒夜光杯，欲饮琵琶马上催。",
	    "长风破浪会有时，直挂云帆济沧海。", 
	    "洛阳亲友如相问，一片冰心在玉壶。",
	    "锦瑟无端五十弦，一弦一柱思华年。",
	    "春蚕到死丝方尽，蜡炬成灰泪始干。",
	    "黑云压城城欲摧，甲光向日金鳞开。",
	    "山重水复疑无路，柳暗花明又一村。",
	    "山回路转不见君，雪上空留马行处。",
	    "箫鼓追随春社近，衣冠简朴古风存。",
	    "瀚海阑干百丈冰，愁云惨淡万里凝。"
    };

    private String nextQuote() {
		int quoteId = ThreadLocalRandom.current().nextInt(DICTIONARY.length);
		return DICTIONARY[quoteId];
    }

    @Override
    public void messageReceived(ChannelHandlerContext ctx, DatagramPacket packet)
	    throws Exception {
		String req = packet.content().toString(CharsetUtil.UTF_8);
		System.out.println(req);
		if ("查询请求".equals(req)) {
		    ctx.writeAndFlush(
		    		new DatagramPacket(Unpooled.copiedBuffer("查询结果: " + nextQuote(),
		    		CharsetUtil.UTF_8), packet.sender()));
		}
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)
	    throws Exception {
		ctx.close();
		cause.printStackTrace();
    }
}
