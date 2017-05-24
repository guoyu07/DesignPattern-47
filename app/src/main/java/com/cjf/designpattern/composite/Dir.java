package com.cjf.designpattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenjifang on 2017/4/11.
 */

public abstract class Dir {
    protected List<Dir> mDirs = new ArrayList<>();

    private String name;

    public Dir(String name) {
        this.name = name;
    }

    public abstract void addDir(Dir dir);

    public abstract void rmDir(Dir dir);

    public abstract void clear();

    public abstract void print();

    public abstract List<Dir> getFiles();

    public String getName() {
        return name;
    }
}
