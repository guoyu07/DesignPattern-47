package com.cjf.designpattern.command;

/**
 * Created by chenjifang on 2017/4/10.
 */

public class Invoker {
    private Command mCommand;

    public Invoker(Command command){
        this.mCommand=command;
    }

    public void action(){
        mCommand.execute();
    }
}
