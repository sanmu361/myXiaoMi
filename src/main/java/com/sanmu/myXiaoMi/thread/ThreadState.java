package com.sanmu.myXiaoMi.thread;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-11-28 19:40
 **/
public class ThreadState {

    public static void main(String[] args) {
        Runnable r = new TimeWaiting();
        Thread a = new Thread(r,"TimeWaittingThread");
        a.setDaemon(true);
        a.start();
        try {
            Thread.sleep(1000 * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a.interrupt();
        a.suspend();
//        new Thread(new Waiting(),"WaitingThread").start();
//
//        new Thread(new Blocked(),"BlockedThread-1").start();
//        new Thread(new Blocked(),"BlockedThread-2").start();
    }

    static class TimeWaiting implements Runnable{

        @Override
        public void run() {
            while(true){
//                try {
//                    Thread.sleep(100 * 1000);
                    while(true){
                        System.out.println(123);
                    }
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
            }
        }
    }

    static class Waiting implements Runnable{

        @Override
        public void run() {
            while(true){
                synchronized (Waiting.class){
                    try{
                        Waiting.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class Blocked implements Runnable{

        @Override
        public void run() {
            synchronized (Blocked.class){
                while(true){
                    try {
                        Thread.sleep(100 * 1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
