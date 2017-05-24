package com.cjf.designpattern.observer;

import java.util.Observable;

/**
 * Created by chenjifang on 2017/4/10.
 */

public class DevtTechFrontier extends Observable {
   public void postNewPublication(String content){
       setChanged();
       notifyObservers(content);
   }
}
