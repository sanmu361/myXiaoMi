package com.sanmu.myXiaoMi.spi;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-11-14 18:14
 **/
public class DivisionOperationImpl implements IOperation {
    @Override
    public int operation(int numberA, int numberB) {
        return numberA / numberB;
    }
}
