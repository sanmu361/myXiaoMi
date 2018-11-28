package com.sanmu.myXiaoMi.spi;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * ${DESCRIPTION}
 *
 * @author yansen
 * @create 2018-11-14 18:16
 **/
public class Main {

    public static void main(String[] args) {
//        IOperation plus = new PlusOperationImpl();
//
//        IOperation division = new DivisionOperationImpl();
//        System.out.println(plus.operation(5, 3));
//
//        System.out.println(division.operation(9, 3));

        ServiceLoader<IOperation> operations = ServiceLoader.load(IOperation.class);
        Iterator<IOperation> operationIterator = operations.iterator();
        System.out.println("classPath:"+System.getProperty("java.class.path"));
        while (operationIterator.hasNext()) {
            IOperation operation = operationIterator.next();
            System.out.println(operation.getClass());
        }
    }
}
