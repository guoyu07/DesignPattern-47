package com.cjf.designpattern.bridge;

/**
 * Created by Administrator on 2017/4/12.
 */

public class Ordinary extends CoffeeAdditives {
    @Override
    public String addSomething() {
        return "原味";
    }
}
