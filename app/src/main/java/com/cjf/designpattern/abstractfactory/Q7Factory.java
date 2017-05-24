package com.cjf.designpattern.abstractfactory;

/**
 * Created by chenjifang on 2017/4/6.
 */

public class Q7Factory extends CarFactory {
    @Override
    public ITire createTire() {
        return new SuvTire();
    }

    @Override
    public IEngine createEngine() {
        return new ImportEngine();
    }

    @Override
    public IBrake createBrake() {
        return new SeniorBrake();
    }
}
