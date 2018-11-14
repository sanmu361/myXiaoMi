package com.sanmu.myXiaoMi.netty.kryo;

import com.sanmu.myXiaoMi.netty.udp.example.KryoUtils;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-11-14 16:07
 **/
public class KryoDecoder extends ByteToMessageDecoder{
    @Override
    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        Object obj = KryoSerializer.deserialize(byteBuf);
    }
}
