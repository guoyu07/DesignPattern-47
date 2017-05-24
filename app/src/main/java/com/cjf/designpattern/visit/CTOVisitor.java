package com.cjf.designpattern.visit;

/**
 * Created by chenjifang on 2017/4/11.
 */

public class CTOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师 : "+engineer.name + ",代码行数 : "+engineer.getCodeLines());

    }

    @Override
    public void visit(Manager manager) {
        System.out.println("经理 : "+manager.name+" , 新产品数量 : "+manager.getProducts());
    }
}
