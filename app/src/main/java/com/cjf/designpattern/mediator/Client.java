package com.cjf.designpattern.mediator;

/**
 * Created by chenjifang on 2017/4/11.
 */

public class Client {
    public static void main(String[] args) {
        MainBoard mediator=new MainBoard();
        CDDevice cd=new CDDevice(mediator);
        CPU cpu=new CPU(mediator);
        GraphicsCard mGraphicsCard=new GraphicsCard(mediator);
        SoundCard mSoundCard=new SoundCard(mediator);

        mediator.setCDDevice(cd);
        mediator.setCpu(cpu);
        mediator.setGraphicsCard(mGraphicsCard);
        mediator.setSoundCard(mSoundCard);
        cd.load();
    }
}
