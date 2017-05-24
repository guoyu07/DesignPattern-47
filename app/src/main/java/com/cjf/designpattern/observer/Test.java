package com.cjf.designpattern.observer;

/**
 * Created by chenjifang on 2017/4/10.
 */

public class Test {
    public static void main(String[] args) {
        DevtTechFrontier mDevtTechFrontier=new DevtTechFrontier();

        Coder mCoder1=new Coder("code1");
        Coder mCoder2=new Coder("code2");
        Coder mCoder3=new Coder("code3");

        mDevtTechFrontier.addObserver(mCoder1);
        mDevtTechFrontier.addObserver(mCoder2);
        mDevtTechFrontier.addObserver(mCoder3);

        mDevtTechFrontier.postNewPublication("新技术开发周刊");
    }
}
