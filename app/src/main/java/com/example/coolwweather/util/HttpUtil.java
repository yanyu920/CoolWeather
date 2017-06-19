package com.example.coolwweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by 颜玉 on 2017/6/18.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
