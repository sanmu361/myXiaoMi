package com.sanmu.myXiaoMi.netty.udp.example;

import java.io.*;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-07-17 14:05
 **/
public class Utils {
    public static byte[] serialize(Object obj) 

    {
        try {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(obj);
        byte[] bs = baos.toByteArray();
        baos.close();
        oos.close();
        return bs;
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
    }

    public static Object deserialize(byte[] bits) {
        try {
            ByteArrayInputStream bais = new ByteArrayInputStream(bits);
            ObjectInputStream ois = new ObjectInputStream(bais);
            Object obj = ois.readObject();
            bais.close();
            ois.close();
            return obj;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
