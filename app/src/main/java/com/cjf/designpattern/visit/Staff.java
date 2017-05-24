package com.cjf.designpattern.visit;

import java.util.Random;

/**
 * Created by chenjifang on 2017/4/11.
 */

public abstract class Staff {
    public  String name;
    public int kpi;

    public Staff(String name){
        this.name= name;
        kpi=new Random().nextInt(10);
    }

    public abstract void accept(Visitor visitor);


}
