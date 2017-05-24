package com.cjf.designpattern.strategy;

/**
 * Created by Administrator on 2017/4/6.
 */

public class TranficCalculator {
    public static void main(String[] args) {
        TranficCalculator calculator=new TranficCalculator();
        calculator.setCalculateStrategy(new BusStrategy());
        calculator.calculatePrice();

    }

    CalculateStrategy calculateStrategy;
    public void calculatePrice(){
         calculateStrategy.calculatePrice(1);
    }

    public void setCalculateStrategy(CalculateStrategy calculateStrategy) {
        this.calculateStrategy = calculateStrategy;
    }
}
