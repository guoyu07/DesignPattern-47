package com.cjf.designpattern;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.cjf.designpattern.iterator.OrderActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.test_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intent= new Intent(MainActivity.this,TestActivity.class);
                startActivity(intent);
            }

        });

        findViewById(R.id.test_btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,TestActivity2.class);
                startActivity(intent);
            }

        });
        findViewById(R.id.test2_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(MainActivity.this,OrderActivity.class);
                startActivity(intent);
            }

        });






    }
}
