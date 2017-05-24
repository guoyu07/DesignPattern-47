package com.cjf.designpattern.visit;

import java.util.Random;

/**
 * Created by chenjifang on 2017/4/11.
 */

public class Engineer extends Staff {

    public Engineer(String name) {
        super(name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public int getCodeLines(){
        return new Random().nextInt(10*10000);
    }
}
