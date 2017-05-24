package com.cjf.designpattern.prototype;

import android.content.Intent;
import android.content.pm.PackageManager;

/**
 * Created by Administrator on 2017/4/3.
 */

public class Client {
    public static void main(String[] args) {
        WordDocument originDoc=new WordDocument();
        originDoc.setmText("这是一篇文档");
        originDoc.addImage("图片1");
        originDoc.addImage("图片2");
        originDoc.addImage("图片3");
        originDoc.showDocument();

        WordDocument doc2=originDoc.clone();
        //修改不会影响原对象
        doc2.showDocument();
        doc2.setmText("修改之后的文档");
        doc2.addImage("呵呵哒.jpg");
        doc2.showDocument();
        originDoc.showDocument();
        //原型模式典型
        Intent mIntent=new Intent();
        //Intent实现了Cloneable接口
        /**
         *  @Override
        public Object clone() {
        return new Intent(this);
        }
         */
        PackageManager packageManager;
    }
}
