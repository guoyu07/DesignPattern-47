package com.cjf.designpattern.template;

/**
 * Created by chenjifang on 2017/4/10.
 */

public class CoderComputer extends AbstarctComputer {

    @Override
    protected void login() {
        System.out.println("coder进行用户名和密码验证");
    }
}
