package com.sanmu.myXiaoMi.builder;

import com.company.section4.Product;

/**
 * Created by mi on 2017/7/3.
 */
public class ConcreteProduct extends Builder {
    private Product product = new Product();
    public void setPart() {

    }

    public Product buildProduct() {
        return product;
    }
}
