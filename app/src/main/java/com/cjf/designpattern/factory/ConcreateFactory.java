package com.cjf.designpattern.factory;



/**
 * Created by chenjifang on 2017/4/6.
 */

public class ConcreateFactory extends Factory {

    @Override
    public Product createProduct() {
        return new ConcreateProductA();
    }
}
