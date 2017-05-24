package com.cjf.designpattern.decorator;

/**
 * Created by chenjifang on 2017/4/12.
 */

public class ConcreateComponentA extends DecoratorComponent {


    public ConcreateComponentA(ConcreateComponent concreateComponent) {
        super(concreateComponent);
    }

    @Override
    void execute() {
        super.execute();
        //添加其他逻辑
        doOtherThing();
    }

    private void doOtherThing() {
    }
}
