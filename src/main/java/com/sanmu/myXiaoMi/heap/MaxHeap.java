package com.sanmu.myXiaoMi.heap;

import com.google.common.collect.Lists;

import java.util.ArrayList;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-08-16 10:17
 **/
public class MaxHeap<T> {
    private ArrayList<T> list;

    public MaxHeap(){
        list = Lists.newArrayList();
    }


   
    public int size() {
        return list.size();
    }

   
    public int maxSize() {
        return size();
    }

   
    public boolean empty() {
        return size() == 0;
    }

   
    public boolean full() {
        return size() > 0;
    }

    private int parent(int index){
        if(index>=size()||index<=0){
            return -1;
        }
        else{
            return (index-1)/2;
        }
    }

    private int leftChild(int index){
        int output=index*2+1;
        if(output>=size()||index<0){
            return -1;
        }
        else{
            return output;
        }
    }

    private int rightChild(int index){
        int output=index*2+2;
        if(output>=size()||index<0){
            return -1;
        }
        else{
            return output;
        }
    }

   
    public T top() {
        return list.get(0);
    }

   
    public T pop() {
        T t = list.get(0);
        list.remove(0);
        return t;
    }



   
    public Heap push(Comparable object) {
        return null;
    }

   
    public void initialize(Comparable[] object) {

    }

   
    public void output() {

    }
}
