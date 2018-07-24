package com.sanmu.myXiaoMi.netty.udp.example;

import java.io.Serializable;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-07-17 13:46
 **/
public class Metric implements Serializable {

    private static final long serialVersionUID = 1L;
    private long t;
    private long  v;
    private String p;

    public Metric(String prefix ,long value){
        this.p = prefix;
        this.v = value;
        this.t = System.currentTimeMillis();
    }

    public void setT(long t) {
        this.t = t;
    }

    public void setV(long value) {
        this.v = value;
    }

    public void setP(String prefix) {
        this.p = prefix;
    }

    public long getT() {
        return t;
    }

    public long getV() {
        return v;
    }

    public String getP() {
        return p;
    }



}
