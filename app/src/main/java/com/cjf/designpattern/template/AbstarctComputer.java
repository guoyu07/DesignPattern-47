package com.cjf.designpattern.template;

/**
 * Created by chenjifang on 2017/4/10.
 */

public abstract class AbstarctComputer {

    protected void powerOn(){
        System.out.println("开启电源");
    }

    protected void checkHardware(){
        System.out.println("硬件检查");
    }

    protected void loadOS(){
        System.out.println("载入操作系统");
    }

    protected void login(){
        System.out.println("无需验证，直接进入操作系统");
    }

    public final void startUp(){
        System.out.println("---------开机start-------------");
        powerOn();
        checkHardware();
        loadOS();
        login();
        System.out.println("---------开机end------------");

    }


}
