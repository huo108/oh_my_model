package com.ailian.designpattern.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.ailian.designpattern.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class WebviewActivity extends AppCompatActivity {

    @Bind(R.id.activity_webview)
    WebView webview;

    public static void start(Activity mActivity, String url) {
        Intent intent = new Intent(mActivity, WebviewActivity.class);
        intent.putExtra("url", url);
        mActivity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview);
        ButterKnife.bind(this);
        String url = getIntent().getStringExtra("url");
        WebSettings webSettings = webview.getSettings();
        //设置WebView属性，能够执行Javascript脚本
        webSettings.setJavaScriptEnabled(true);
        //设置可以访问文件
        webSettings.setAllowFileAccess(true);
        //设置Web视图
        webview.setWebViewClient(new NoAdWebViewClient(this, url));
        webview.setWebChromeClient(new WebChromeClient());
        webview.loadUrl(url);
    }
}
