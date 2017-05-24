package com.cjf.designpattern.abstractfactory;

/**
 * Created by chenjifang on 2017/4/6.
 */

public class SuvTire implements ITire {
    @Override
    public void tire() {
        System.out.println("全尺寸越野轮胎");
    }
}
