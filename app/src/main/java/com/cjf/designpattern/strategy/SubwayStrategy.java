package com.cjf.designpattern.strategy;

/**
 * Created by Administrator on 2017/4/6.
 */

public class SubwayStrategy implements CalculateStrategy {
    @Override
    public void calculatePrice(int km) {
        System.out.println("地铁价格计算方式"+km);
    }
}
