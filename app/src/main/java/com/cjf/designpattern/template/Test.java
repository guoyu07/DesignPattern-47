package com.cjf.designpattern.template;

/**
 * Created by chenjifang on 2017/4/10.
 */

public class Test {
    public static void main(String[] args) {
        AbstarctComputer comp=new CoderComputer();
        comp.startUp();

        comp=new MilitaryComputer();
        comp.startUp();
    }

}
