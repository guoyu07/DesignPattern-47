package com.cjf.designpattern.strategy;

/**
 * Created by Administrator on 2017/4/6.
 */

public interface CalculateStrategy {
    /**
     * 按距离计算价格
     * @param km 公里
     * @return 返回价格
     */
    void calculatePrice(int km);
}
