package com.bwie.administrator.liuxs_20190102.data.utils;

import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;

public class OKHttpUtils {

    //创建本地okHttpUtils
    private static OKHttpUtils  okHttpUtils;
    private final OkHttpClient okHttpClient;

    //单例
    public OKHttpUtils() {
        okHttpClient = new OkHttpClient.Builder().build();
    }

    public static OKHttpUtils getIntence(){

        if (null == okHttpUtils){
            synchronized(OKHttpUtils.class){
                if (null == okHttpUtils){
                    okHttpUtils = new OKHttpUtils();
                }
            }
        }
        return okHttpUtils;
    }

    //GET
    public void get(FormBody formBody, String urlString, Callback callback){

        Request request = new Request.Builder()
                .url(urlString)
                .build();
        okHttpClient.newCall(request).enqueue(callback);
    }


}
