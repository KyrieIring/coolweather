package com.gg.coolweather.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Administrator on 2018/6/12 0012.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
