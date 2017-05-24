package com.cjf.designpattern.decorator;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by chenjifang on 2017/4/12.
 */

public class Test4Activity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initData();

        initViews();
        
        


    }

    private void initViews() {

    }

    private void initData() {
    }
}
