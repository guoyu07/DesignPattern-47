package com.cjf.designpattern.adapter;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.cjf.designpattern.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenjifang on 2017/4/12.
 */

public class Test2Activity extends Activity {
    private CircleMenuLayout mCircleMenuLayout;
    private CircleMenuLayout2 mCircleMenuLayout2;

    private String[] mItemtTexts = new String[]{
            "安全中心", "特色服务", "投资理财", "转账汇款", "我的账户", "信用卡"
    };
    private int[] mItemImgs = new int[]{
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher,
            R.mipmap.ic_launcher
    };

    List<MenuItem> mMenuItems=new ArrayList<>();

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /* setContentView(R.layout.menu_layout);
       mCircleMenuLayout = (CircleMenuLayout) findViewById(R.id.id_menu_layout);

        mCircleMenuLayout.setMenuItemIconsAndTexts(mItemImgs, mItemtTexts);

        mCircleMenuLayout.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onClick(View view, int i) {
                Toast.makeText(Test2Activity.this, mItemtTexts[i], Toast.LENGTH_SHORT).show();
            }
        });*/


       //改进之后的代码
        setContentView(R.layout.menu_layout2);
        mockMenuItems();
        mCircleMenuLayout2 = (CircleMenuLayout2) findViewById(R.id.id_menu_layout);
        mCircleMenuLayout2.setAdapter(new CircleMenuAdapter(mMenuItems));

        mCircleMenuLayout2.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onClick(View view, int i) {
                Toast.makeText(Test2Activity.this, mItemtTexts[i], Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void mockMenuItems() {
        mMenuItems.add(new MenuItem(R.mipmap.ic_launcher,"test1"));
        mMenuItems.add(new MenuItem(R.mipmap.ic_launcher,"test2"));
        mMenuItems.add(new MenuItem(R.mipmap.ic_launcher,"test3"));
        mMenuItems.add(new MenuItem(R.mipmap.ic_launcher,"test4"));
        mMenuItems.add(new MenuItem(R.mipmap.ic_launcher,"test5"));
        mMenuItems.add(new MenuItem(R.mipmap.ic_launcher,"test6"));
    }
}
