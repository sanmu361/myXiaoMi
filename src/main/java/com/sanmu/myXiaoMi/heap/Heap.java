package com.sanmu.myXiaoMi.heap;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-08-16 10:16
 **/
public interface Heap {
    abstract public int size();
    abstract public int maxSize();
    abstract public boolean empty();
    abstract public boolean full();
    abstract public Comparable top();
    abstract public Comparable pop();
    abstract public Heap push(Comparable object);
    abstract public void initialize(Comparable[] object);
    abstract public void output();
}
