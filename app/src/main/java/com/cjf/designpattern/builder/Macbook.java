package com.cjf.designpattern.builder;

/**
 * Created by chenjifang on 2017/4/1.
 */

public class Macbook extends Computer {
    protected Macbook(){}

    @Override
    public void setOs() {
        mOs="Mac OS X 10.10";
    }
}
