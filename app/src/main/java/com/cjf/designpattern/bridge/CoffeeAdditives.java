package com.cjf.designpattern.bridge;

/**
 * Created by Administrator on 2017/4/12.
 */

public abstract class CoffeeAdditives {
    public abstract String addSomething();

    @Override
    public String toString() {
        return addSomething();
    }
}
