package com.cjf.designpattern.factory;

/**
 * Created by chenjifang on 2017/4/6.
 */

public class Client {
    public static void main(String[] args) {
        Factory mFactory = new ConcreateFactory();
        Product mProduct = mFactory.createProduct();
        mProduct.method();
    }
}
