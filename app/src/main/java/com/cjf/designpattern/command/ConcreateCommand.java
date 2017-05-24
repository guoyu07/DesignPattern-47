package com.cjf.designpattern.command;

/**
 * Created by chenjifang on 2017/4/10.
 */

public class ConcreateCommand implements Command {
    private Receiver mReceiver;

    public ConcreateCommand(Receiver receiver) {
        mReceiver = receiver;
    }

    @Override
    public void execute() {

        //接受者来执行具体逻辑
        mReceiver.action();
    }
}
