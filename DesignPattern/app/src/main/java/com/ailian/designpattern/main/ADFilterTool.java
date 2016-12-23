package com.ailian.designpattern.main;

import android.content.Context;
import android.content.res.Resources;

import com.ailian.designpattern.R;

/**
 * Created by Ailian on 16/12/23.
 */

public class ADFilterTool {
    public static boolean hasAd(Context context, String url) {
        Resources res = context.getResources();
        String[] adUrls = res.getStringArray(R.array.adBlockUrl);
        for (String adUrl : adUrls) {
            if (url.contains(adUrl)) {
                return true;
            }
        }
        return false;
    }
}
