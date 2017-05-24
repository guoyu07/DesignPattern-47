package com.cjf.designpattern.bridge;

/**
 * Created by Administrator on 2017/4/12.
 */

public abstract class Coffee {
    protected CoffeeAdditives impl;

    public Coffee(CoffeeAdditives impl) {
        this.impl = impl;
    }

    public abstract void makeCoffee();
}
