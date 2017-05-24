package com.cjf.designpattern.strategy;

/**
 * Created by Administrator on 2017/4/6.
 */

public class BusStrategy implements CalculateStrategy {
    @Override
    public void calculatePrice(int km) {
        System.out.println("公交车价格计算方式"+km);
    }
}
