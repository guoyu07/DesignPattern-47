package com.cjf.designpattern.abstractfactory;

/**
 * Created by chenjifang on 2017/4/6.
 */

public class SeniorBrake implements IBrake {
    @Override
    public void brake() {
        System.out.println("高级制动");
    }
}
