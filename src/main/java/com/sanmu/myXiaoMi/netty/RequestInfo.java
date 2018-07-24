package com.sanmu.myXiaoMi.netty;

import java.io.Serializable;
import java.util.HashMap;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-06-26 14:45
 **/
public class RequestInfo implements Serializable {
    private String ip ;
    private long time = System.currentTimeMillis();
    private HashMap<String, Object> cpuPercMap ;
    private HashMap<String, Object> memoryMap;
    //.. other field


    public void setTime(long time) {
        this.time = time;
    }

    public long getTime() {
        return time;
    }

    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public HashMap<String, Object> getCpuPercMap() {
        return cpuPercMap;
    }
    public void setCpuPercMap(HashMap<String, Object> cpuPercMap) {
        this.cpuPercMap = cpuPercMap;
    }
    public HashMap<String, Object> getMemoryMap() {
        return memoryMap;
    }
    public void setMemoryMap(HashMap<String, Object> memoryMap) {
        this.memoryMap = memoryMap;
    }


}
