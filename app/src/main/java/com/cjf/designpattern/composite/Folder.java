package com.cjf.designpattern.composite;

import java.util.Iterator;
import java.util.List;

/**
 * Created by chenjifang on 2017/4/11.
 */

public class Folder extends Dir {
    public Folder(String name) {
        super(name);
    }

    @Override
    public void addDir(Dir dir) {
        mDirs.add(dir);
    }

    @Override
    public void rmDir(Dir dir) {
        mDirs.remove(dir);
    }

    @Override
    public void clear() {
        mDirs.clear();
    }

    @Override
    public void print() {
        System.out.print(getName() + "(");
        Iterator<Dir> iter = mDirs.iterator();
        while (iter.hasNext()) {
            Dir dir = iter.next();
            dir.print();
            if (iter.hasNext()) {
                System.out.print(",");
            }
        }
        System.out.print(")");


    }

    @Override
    public List<Dir> getFiles() {
        return mDirs;
    }
}
