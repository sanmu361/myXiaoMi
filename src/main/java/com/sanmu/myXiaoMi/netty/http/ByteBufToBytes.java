package com.sanmu.myXiaoMi.netty.http;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-11-15 18:16
 **/
public class ByteBufToBytes {
    private ByteBuf temp;
    private boolean end = true;
    public ByteBufToBytes(int length) {
        temp = Unpooled.buffer(length);
    }
    public void reading(ByteBuf datas) {
        datas.readBytes(temp, datas.readableBytes());
        if (this.temp.writableBytes() != 0) {
            end = false;
        } else {
            end = true;
        }
    }
    public boolean isEnd() {
        return end;
    }
    public byte[] readFull() {
        if (end) {
            byte[] contentByte = new byte[this.temp.readableBytes()];
            this.temp.readBytes(contentByte);
            this.temp.release();
            return contentByte;
        } else {
            return null;
        }
    }
    public byte[] read(ByteBuf datas) {
        byte[] bytes = new byte[datas.readableBytes()];
        datas.readBytes(bytes);
        return bytes;
    }
}

