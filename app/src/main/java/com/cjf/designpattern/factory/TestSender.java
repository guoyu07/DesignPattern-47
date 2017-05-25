package com.cjf.designpattern.factory;

/**
 * Created by chenjifang on 2017/5/25.
 */

public class TestSender {
    public static void main(String[] args) {
        Provider mFactory=new SmsSenderFactory();
        Sender mSender= mFactory.produce();
        mSender.send();
    }
}
