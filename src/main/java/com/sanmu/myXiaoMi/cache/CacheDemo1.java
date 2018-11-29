package com.sanmu.myXiaoMi.cache;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-11-28 15:40
 **/
public class CacheDemo1 {



    private CacheDemo1(){
    }

    public static CacheDemo1 singeton(){
        return new CacheDemo1();
    }

    private int a = 0;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    static class CacheDemo1Single{
        private static volatile CacheDemo1 cacheDemo1;

        public static CacheDemo1 getCacheDemo1() {

            if(cacheDemo1 == null){
                synchronized (CacheDemo1.class){
                    if(cacheDemo1 == null){
                        cacheDemo1 = new CacheDemo1();
                    }
                }
            }
            return cacheDemo1;
        }
    }

    public static void main(String[] args) {
        System.out.println(CacheDemo1Single.getCacheDemo1().getA());
    }
}
