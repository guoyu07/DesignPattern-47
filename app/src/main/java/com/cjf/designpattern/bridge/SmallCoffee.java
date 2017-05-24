package com.cjf.designpattern.bridge;

/**
 * Created by Administrator on 2017/4/12.
 */

public class SmallCoffee extends Coffee {
    public SmallCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("小杯的"+impl+"咖啡");
    }
}
