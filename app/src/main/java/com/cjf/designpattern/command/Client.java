package com.cjf.designpattern.command;

/**
 * Created by chenjifang on 2017/4/10.
 */

public class Client {
    public static void main(String[] args) {
        Receiver mReceiver=new Receiver();
        Command mCommand=new ConcreateCommand(mReceiver);
        Invoker mInvoker=new Invoker(mCommand);
        mInvoker.action();
    }
}
