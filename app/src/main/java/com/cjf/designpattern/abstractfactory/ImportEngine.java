package com.cjf.designpattern.abstractfactory;

/**
 * Created by chenjifang on 2017/4/6.
 */

public class ImportEngine implements IEngine {
    @Override
    public void engine() {
        System.out.println("进口发动机");
    }
}
