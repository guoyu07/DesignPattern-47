package com.cjf.designpattern.abstractfactory;

/**
 * Created by chenjifang on 2017/4/6.
 */

public class Q3Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new NormalTire();
    }

    @Override
    public IEngine createEngine() {
        return new DomesticEngine();
    }

    @Override
    public IBrake createBrake() {
        return new NormalBrake();
    }
}
