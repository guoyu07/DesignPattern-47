package com.cjf.designpattern.iterator;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Administrator on 2017/4/8.
 */

public class ThirdReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        int limit =intent.getIntExtra("limit",-1001);

        if(limit==10){
            String msg=intent.getStringExtra("msg");
            Bundle b=getResultExtras(true);
            String str=b.getString("new");
            Toast.makeText(context,msg+"------------------"+str,Toast.LENGTH_SHORT).show();

            //终止广播
            abortBroadcast();
        }else {
            //添加信息发送给下一个receiver
            Bundle b=new Bundle();
            b.putString("new","Message from ThirdReceiver");
            setResultExtras(b);
        }

    }
}
