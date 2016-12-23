package com.ailian.designpattern.main;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Ailian on 16/12/23.
 */

public class NoAdWebViewClient extends WebViewClient {
    private String homeurl;
    private Context context;

    public NoAdWebViewClient(Context context, String homeurl) {
        this.context = context;
        this.homeurl = homeurl;
    }

    @Override
    public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
        url = url.toLowerCase();
        if (!url.contains(homeurl)) {
            if (!ADFilterTool.hasAd(context, url)) {
                return super.shouldInterceptRequest(view, url);
            } else {
                return new WebResourceResponse(null, null, null);
            }
        } else {
            return super.shouldInterceptRequest(view, url);
        }


    }
}
