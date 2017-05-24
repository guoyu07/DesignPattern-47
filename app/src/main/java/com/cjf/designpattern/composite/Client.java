package com.cjf.designpattern.composite;

/**
 * Created by chenjifang on 2017/4/11.
 */

public class Client {
    public static void main(String[] args) {
        Dir diskC=new Folder("C");
        diskC.addDir(new Folder("windows"));
        diskC.addDir(new Folder("test1"));
        diskC.addDir(new Folder("test2"));
        diskC.addDir(new File("test3.txt"));

        Dir tmp=new Folder("test4");
        tmp.addDir(new File("test5.txt"));
        tmp.addDir(new File("test6.exe"));
        diskC.addDir(tmp);

        diskC.print();

    }
}
