package com.sanmu.myXiaoMi.thread;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-04-26 14:24
 **/
public class ForkJoinTest {

    private static ForkJoinPool pool = new ForkJoinPool();

    public static void main(String[] args) {

    }

    public static class CountTask extends RecursiveTask<Integer>{

        private static final int THRESHOLD = 2;
        public int start;
        public int end;

        public int getStart() {
            return start;
        }

        public int getEnd() {
            return end;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public void setEnd(int end) {
            this.end = end;
        }

        public CountTask(int start, int end){
            this.start = start;
            this.end = end;
        }

        @Override
        protected Integer compute() {

            int sum = 0;

            boolean canCompute = (end- start) <= 2;

            if(canCompute){
                for(int i = start; i <= end; i++){
                    sum += i;
                }
            }else{
                int mid = (start + end) / 2;
                CountTask left = new CountTask(start,mid);
                CountTask right = new CountTask(mid,end);

                left.fork();
                right.fork();
                int leftResult = left.join();
                int rightResult = right.join();

                sum = leftResult + rightResult;
            }

            return sum;
        }
    }
}
