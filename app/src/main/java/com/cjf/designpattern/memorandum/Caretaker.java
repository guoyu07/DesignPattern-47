package com.cjf.designpattern.memorandum;

/**
 * Created by chenjifang on 2017/4/10.
 */

public class Caretaker {
    Memoto mMemoto;

    /**
     * 存档
     *
     * @param memoto
     */
    public void archive(Memoto memoto) {
        this.mMemoto = memoto;
    }

    /**
     * 获取存档
     *
     * @return
     */
    public Memoto getMemoto() {
        return mMemoto;
    }




}
