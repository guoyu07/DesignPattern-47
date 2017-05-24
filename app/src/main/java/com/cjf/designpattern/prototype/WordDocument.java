package com.cjf.designpattern.prototype;

import java.util.ArrayList;

/**原型模式
 * 使用场景:
 * 1、类初始化需要消耗非常多的资源,这个资源包括数据、硬件资源等，通过原型拷贝避免这些消耗。
 * 2、通过new产生一个对象需要非常繁琐的数据准备或访问权限，这时可以使用原型模式。
 * 3、一个对象需要提供给其它对象访问，而且各个调用者可能都需要修改其值时，可以考虑使用原型模式拷贝多个对象供调用者使用，即保护性拷贝。
 * Created by Administrator on 2017/4/3.
 */

public class WordDocument implements Cloneable {
    private String mText;
    private ArrayList<String> mImages = new ArrayList<>();

    public WordDocument() {
        System.out.println("WordDocument构造函数");
    }

    @Override
    protected WordDocument clone()  {
        try {
            WordDocument doc = (WordDocument) super.clone();
            doc.mText = this.mText;
            //浅拷贝
            //doc.mImages = this.mImages;
            //引用型采用clone形式，深拷贝
            doc.mImages= (ArrayList<String>) this.mImages.clone();
            return doc;
        } catch (Exception e) {
        }
        return null;
    }

    public String getmText() {
        return mText;
    }

    public void setmText(String mText) {
        this.mText = mText;
    }

    public ArrayList<String> getmImages() {
        return mImages;
    }


    public void addImage(String image){
        this.mImages.add(image);
    }

    public void showDocument() {
        System.out.println("--------word content start");
        System.out.println("--------Text: " + mText);
        System.out.println("--------Images List: ");
        for (String image : mImages) {
            System.out.println("--------image: "+image);
        }
        System.out.println("--------word content end");

    }
}
