package com.cjf.designpattern.mediator;

/**
 * Created by chenjifang on 2017/4/11.
 */

public class MainBoard extends Mediator {
    private CDDevice mCDDevice;
    private CPU cpu;
    private SoundCard mSoundCard;

    private GraphicsCard mGraphicsCard;

    @Override
    public void changed(Colleague c) {
        if(c==mCDDevice){
            handleCD((CDDevice)c);
        }else if(c==cpu){
            handleCPU((CPU)c);
        }

    }

    private void handleCPU(CPU c) {
        mSoundCard.soundPlay(c.getDataSound());
        mGraphicsCard.videoPlay(c.getDataVideo());
    }

    private void handleCD(CDDevice c) {
        cpu.decodeData(c.read());
    }

    public void setCDDevice(CDDevice CDDevice) {
        mCDDevice = CDDevice;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public void setSoundCard(SoundCard soundCard) {
        mSoundCard = soundCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        mGraphicsCard = graphicsCard;
    }
}
