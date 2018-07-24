package com.sanmu.myXiaoMi.builder;

import com.company.section4.Product;

/**
 * Created by mi on 2017/7/3.
 */
public abstract class Builder {

    public abstract void setPart();

    public abstract Product buildProduct();
}
