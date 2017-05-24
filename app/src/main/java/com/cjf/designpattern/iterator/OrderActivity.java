package com.cjf.designpattern.iterator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IntegerRes;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import com.cjf.designpattern.R;

/**
 * Created by Administrator on 2017/4/8.
 */

public class OrderActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Button button= (Button) findViewById(R.id.ordersend_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction("com.aigestudio.action.ORDER_BROADCAST");
                intent.putExtra("limit",100);
                intent.putExtra("msg","Message from OrderActivity");
                sendBroadcast(intent,null);
            }
        });


    }
}
