package com.bwie.administrator.liuxs_20190102.di.presenter;

import com.bwie.administrator.liuxs_20190102.di.contrant.Contrant;
import com.bwie.administrator.liuxs_20190102.di.model.IMainModelImpl;

import java.lang.ref.SoftReference;

/**
 * liu
 * 2019/01/02
 * P层
 */
public class IMainPresenterImpl implements Contrant.IMainPresenter {
    Contrant.IMainView mainView;
    private SoftReference<Contrant.IMainView> softReference;
    private Contrant.IMainModel mainModel;


    @Override
    public void attactView(Contrant.IMainView mainView) {
        this.mainView = mainView;
        //软引用
        softReference = new SoftReference<>(mainView);
        //M层
        mainModel = new IMainModelImpl();
    }

    @Override
    public void detachView(Contrant.IMainView mainView) {
        softReference.clear();
    }

    @Override
    public void requestData() {
        mainModel.requeData(new Contrant.IMainModel.CallBack() {
            @Override
            public void onCallback(String listBean) {
                mainView.NewsData(listBean);
            }

            @Override
            public void onCallBack(String dataBean) {
                mainView.ShowData(dataBean);
            }
        });
    }
}
