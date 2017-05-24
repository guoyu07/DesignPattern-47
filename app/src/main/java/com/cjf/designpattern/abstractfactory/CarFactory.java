package com.cjf.designpattern.abstractfactory;

/**
 * Created by chenjifang on 2017/4/6.
 */

public abstract class CarFactory {
    /**
     * 创建轮胎
     * @return
     */
    public abstract ITire createTire();

    /**
     * 创建发动机
     * @return
     */
    public abstract IEngine createEngine();

    /**
     * 创建制动系统
     * @return
     */

    public abstract IBrake createBrake();
}
