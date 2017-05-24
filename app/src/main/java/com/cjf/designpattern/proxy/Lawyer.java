package com.cjf.designpattern.proxy;

/**
 * Created by chenjifang on 2017/4/11.
 */

public class Lawyer implements ILawsuit {
    private ILawsuit mILawsuit;//被代理者的引用

    public Lawyer(ILawsuit lawsuit){
        mILawsuit=lawsuit;
    }

    @Override
    public void submit() {
        mILawsuit.submit();
    }

    @Override
    public void burden() {
        mILawsuit.burden();
    }

    @Override
    public void defend() {
        mILawsuit.defend();
    }

    @Override
    public void finish() {
        mILawsuit.finish();
    }


}
