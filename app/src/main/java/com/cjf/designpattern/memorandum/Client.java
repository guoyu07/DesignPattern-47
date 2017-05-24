package com.cjf.designpattern.memorandum;

/**
 * Created by chenjifang on 2017/4/10.
 */

public class Client {
    public static void main(String[] args) {
        CallOfDuty game=new CallOfDuty();
        game.play();
        Caretaker mCaretaker=new Caretaker();
        mCaretaker.archive(game.createMemoto());
        game.quit();

        CallOfDuty newGame=new CallOfDuty();
        newGame.restore(mCaretaker.getMemoto());

    }
}
