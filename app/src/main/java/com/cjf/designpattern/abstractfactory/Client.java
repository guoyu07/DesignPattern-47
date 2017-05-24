package com.cjf.designpattern.abstractfactory;

/**
 * Created by chenjifang on 2017/4/6.
 */

public class Client {
    public static void main(String[] args) {
        CarFactory q3Factory = new Q3Factory();
        q3Factory.createBrake().brake();
        q3Factory.createEngine().engine();
        q3Factory.createTire().tire();
        System.out.println("---------------------------------");

        CarFactory q7Factory = new Q7Factory();
        q7Factory.createBrake().brake();
        q7Factory.createEngine().engine();
        q7Factory.createTire().tire();

    }
}
