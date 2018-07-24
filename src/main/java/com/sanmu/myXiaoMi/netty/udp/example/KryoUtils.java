package com.sanmu.myXiaoMi.netty.udp.example;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import org.objenesis.strategy.StdInstantiatorStrategy;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-07-17 14:19
 **/
public class KryoUtils {

    private static final ThreadLocal<Kryo> local = new ThreadLocal<Kryo>(){
        protected Kryo initialValue(){
            Kryo kryo = new Kryo();

            kryo.setReferences(true);

            kryo.setRegistrationRequired(false);
            ((Kryo.DefaultInstantiatorStrategy)kryo.getInstantiatorStrategy()).setFallbackInstantiatorStrategy(new StdInstantiatorStrategy());
            return kryo;
        }
    };

    public static Kryo getInstance(){
        return local.get();
    }


    public static <T> byte[] serialize(T obj){
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        Output output = new Output(byteArrayOutputStream);

        Kryo kryo = getInstance();

        kryo.writeClassAndObject(output,obj);

        output.flush();

        return  byteArrayOutputStream.toByteArray();
    }

    public static <T> T deserialize(byte[] bytes){
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);

        Input input = new Input(byteArrayInputStream);

        Kryo kryo = getInstance();
        return (T)kryo.readClassAndObject(input);
    }


}
