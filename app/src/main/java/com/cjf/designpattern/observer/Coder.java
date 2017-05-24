package com.cjf.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by chenjifang on 2017/4/10.
 */

public class Coder implements Observer {
    public String name;
    @Override
    public void update(Observable observable, Object o) {
        System.out.println("Hi, "+name+", DevTechFrontier 更新啦，内容 : "+o);
    }

    public Coder(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "码农:"+ name;
    }
}
