package com.cjf.designpattern;

import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Administrator on 2017/4/5.
 */

public class TestActivity2 extends AppCompatActivity {
    private WebView webview;
    String url;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);
        webview = (WebView) findViewById(R.id.webview_test);
        webview.getSettings().setJavaScriptEnabled(true);
        webview.getSettings().setDomStorageEnabled(true);
        url = "http://admin.elefu.cn";
        final String name = "xhy";
        final String pass = "sinodata,.";
        webview.setWebViewClient(new WebViewClient() {
       /*     public boolean shouldOverrideUrlLoading(WebView view, String url)
            { //  重写此方法表明点击网页里面的链接还是在当前的webview里跳转，不跳到浏览器那边
                view.loadUrl(url);
                return true;
            }*/

            @Override
            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                return super.shouldOverrideUrlLoading(view, request);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                if (url.contains("LoginMobile")) {
                    StringBuilder js = new StringBuilder();
                    js.append("javascript:");
                    js.append("document.getElementById('inputLoginName').value='");
                    js.append(name + "';");
                    js.append("document.getElementById('inputPassword').value='");
                    js.append(pass + "';");
                    js.append("Login();");
                    view.loadUrl(js.toString());
                }
                super.onPageFinished(view,url);
            }
        });
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            WebView.setWebContentsDebuggingEnabled(true);
        }


    }

    @Override
    protected void onResume() {
        super.onResume();
        webview.loadUrl(url);
    }
}
