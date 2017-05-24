package com.cjf.designpattern.memorandum;

/**
 * 备忘录模式
 * Created by chenjifang on 2017/4/10.
 */

public class CallOfDuty {
    private int mCheckPoiont = 1;
    private int mLifeValue = 100;
    private String mWeapon = "xxx";

    public void play() {
        System.out.println("玩游戏 : " + String.format("第%d关", mCheckPoiont) + "奋战杀敌中");
        mLifeValue -= 100;
        System.out.println("进度升级了");
        mCheckPoiont++;
        System.out.println("到达 " + String.format("第%d关", mCheckPoiont));
    }

    public void quit() {
        System.out.println("---------------------");
        System.out.println("退出前的游戏属性 : " + this.toString());
        System.out.println("退出游戏");
        System.out.println("---------------------");
    }

    public Memoto createMemoto() {
        Memoto mMemoto = new Memoto();
        mMemoto.mCheckPoint = mCheckPoiont;
        mMemoto.mLifeValue = mLifeValue;
        mMemoto.mWeapon = mWeapon;
        return mMemoto;
    }

    public void restore(Memoto memoto){
        this.mCheckPoiont=memoto.mCheckPoint;
        this.mLifeValue=memoto.mLifeValue;
        this.mWeapon=memoto.mWeapon;
        System.out.println("恢复后的游戏属性 : "+this.toString());

    }

    @Override
    public String toString() {
        return "CallOfDuty{" +
                "mCheckPoiont=" + mCheckPoiont +
                ", mLifeValue=" + mLifeValue +
                ", mWeapon='" + mWeapon + '\'' +
                '}';
    }


}
