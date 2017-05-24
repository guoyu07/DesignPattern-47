package com.cjf.designpattern.visit;

/**
 * Created by chenjifang on 2017/4/11.
 */

public interface Visitor {
    public void visit(Engineer engineer) ;

    public void visit(Manager manager) ;

}
