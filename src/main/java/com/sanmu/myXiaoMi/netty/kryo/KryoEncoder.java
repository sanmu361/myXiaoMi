package com.sanmu.myXiaoMi.netty.kryo;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-11-14 16:08
 **/
public class KryoEncoder extends MessageToByteEncoder<Object>{
    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, Object o, ByteBuf byteBuf) throws Exception {
        KryoSerializer.serialize(o, byteBuf);
        channelHandlerContext.flush();
    }
}
