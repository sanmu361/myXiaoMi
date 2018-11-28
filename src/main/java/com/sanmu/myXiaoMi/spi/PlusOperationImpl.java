package com.sanmu.myXiaoMi.spi;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-11-14 18:12
 **/
public class PlusOperationImpl implements IOperation {
    @Override
    public int operation(int numberA, int numberB) {
        return numberA + numberB;
    }
}
