package com.sanmu.myXiaoMi.builder;

import com.company.section4.*;
import com.company.section4.ConcreteProduct;

/**
 * Created by mi on 2017/7/3.
 */
public class Director {

    private com.company.section4.Builder builder = new ConcreteProduct();
    public Product getAProduct(){

        builder.setPart();
        return builder.buildProduct();
    }
}
