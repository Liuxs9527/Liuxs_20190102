package com.bwie.administrator.liuxs_20190102.di.model;

import com.bwie.administrator.liuxs_20190102.data.Constant;
import com.bwie.administrator.liuxs_20190102.data.utils.OKHttpUtils;
import com.bwie.administrator.liuxs_20190102.di.contrant.Contrant;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.Response;

public class IMainModelImpl  implements Contrant.IMainModel {


    @Override
    public void requeData(final CallBack callBack) {
        requestUrl(callBack);
    }

    private void requestUrl(final CallBack callBack){
        //请求体
        FormBody formBody = new FormBody.Builder().build();
        //请求地址
        String urlString = Constant.HOME_URL;
        OKHttpUtils.getIntence().get(formBody,urlString, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                callBack.onCallback(e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String responseData = response.body().string();
                callBack.onCallback(responseData);
            }
        });
    }

    private void requestUrl2(final CallBack callBack){
        //请求体
        FormBody formBody = new FormBody.Builder().build();
        //请求地址
        String urlString = Constant.SHOW_URL;
        OKHttpUtils.getIntence().get(formBody, urlString, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                callBack.onCallBack(e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String responseData = response.body().string();
                callBack.onCallBack(responseData);
            }
        });

    }



}
