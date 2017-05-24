package com.cjf.designpattern.template;

/**
 * Created by chenjifang on 2017/4/10.
 */

public class MilitaryComputer extends AbstarctComputer {
    @Override
    protected void login() {
        System.out.println("Military用户名密码验证，并且要进行指纹验证");
    }

    @Override
    protected void checkHardware() {
        super.checkHardware();
        System.out.println("检查硬件防火墙");
    }


}
