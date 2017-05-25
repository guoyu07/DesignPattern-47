package com.cjf.designpattern.factory;

/**
 * Created by chenjifang on 2017/5/25.
 */

public class SmsSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
