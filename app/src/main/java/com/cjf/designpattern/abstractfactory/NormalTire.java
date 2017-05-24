package com.cjf.designpattern.abstractfactory;

/**
 * Created by chenjifang on 2017/4/6.
 */

public class NormalTire implements ITire {
    @Override
    public void tire() {
        System.out.println("普通轮胎");
    }
}
