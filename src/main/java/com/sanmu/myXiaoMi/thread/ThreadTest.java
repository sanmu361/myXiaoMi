package com.sanmu.myXiaoMi.thread;

import java.util.Random;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-11-28 15:01
 **/
public class ThreadTest {

    private static volatile C c = new C();

    public static void main(String[] args) {

        final Random random = new Random();


        new Thread(new Runnable() {

            @Override
            public void run() {
                int i = 10;
                while(i-- > 0) {
                    if(c.x == 'A') {
                        System.out.println('A');
                        c.x = 'B';
                    }else {
                        System.out.println("aaaaaa===="+c.x);
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 10;
                while(i-- > 0) {
                    if(c.x == 'B') {
                        System.out.println('B');
                        c.x = 'C';
                    }else {
                        System.out.println("bbbbbbbb===="+c.x);
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 10;
                while(i-- > 0) {
                    if(c.x == 'C') {
                        System.out.println('C');
                        c.x = 'A';
                    }else {
                        System.out.println("ccccccc===="+c.x);
                    }
                }
            }
        }).start();
    }


}


class C{
    public char x = 'A';
}

