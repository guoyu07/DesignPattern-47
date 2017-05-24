package com.cjf.designpattern.memorandum;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by chenjifang on 2017/4/10.
 */

public class TestActivity extends Activity {

    /**
     *
     * @param savedInstanceState
     */
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }


    /**
     * 存档
     * @param outState
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}
