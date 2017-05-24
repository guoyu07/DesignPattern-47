package com.cjf.designpattern.visit;

import java.util.Random;

/**
 * Created by chenjifang on 2017/4/11.
 */

public class Manager extends Staff {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public int getProducts() {
        return new Random().nextInt(10);
    }
}
