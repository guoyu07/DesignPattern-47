package com.cjf.designpattern.factory;

/**
 * Created by chenjifang on 2017/5/25.
 */

public class SmsSender implements Sender {
    @Override
    public void send() {
        System.out.println("a sms send by SmsSender");
    }
}
