package com.sanmu.myXiaoMi.DesignPattern;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-05-11 11:05
 **/
public class 模板模式 {


    public static void main(String[] args) {
        DoThings doThings = new DoThings();

        doThings.doAllThings();
    }
}

interface doThings{
    void doAllThings();
}

abstract class AbstractClass implements doThings{
    protected abstract void doStringThing1();

    protected abstract void doStringThing2();


    public void doAllThings(){
        doStringThing1();
        doStringThing2();
    }
}

abstract class Abstract1 extends AbstractClass{


    protected abstract void doStringThing3();

    public final void doAllThings(){
        doStringThing1();
        doStringThing2();
        doStringThing3();
    }
}

final class DoThings extends Abstract1{

    @Override
    protected void doStringThing1() {
        System.out.println("do Some Thing 1");
    }

    @Override
    protected void doStringThing2() {
        System.out.println("do Some Thing 2");
    }

    @Override
    protected void doStringThing3() {
        System.out.println("do Some Thing 3");
    }
}
