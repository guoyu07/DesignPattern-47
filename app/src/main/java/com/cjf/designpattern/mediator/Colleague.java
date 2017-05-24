package com.cjf.designpattern.mediator;

/**
 * Created by chenjifang on 2017/4/11.
 */
public abstract class Colleague {
    protected Mediator mMediator;

    public Colleague(Mediator mediator) {
        this.mMediator = mediator;
    }
}
