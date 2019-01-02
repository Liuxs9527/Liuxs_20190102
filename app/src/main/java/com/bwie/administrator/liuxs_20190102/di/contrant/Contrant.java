package com.bwie.administrator.liuxs_20190102.di.contrant;

/**
 * liu
 * 2019/01/02
 * 接口
 */

public interface Contrant {

    //V层
    public interface IMainView{
        //News
        public void NewsData(String listBean);

        //Show
        public void ShowData(String dataBean);
    }

    //P层
    public interface IMainPresenter<IMainView>{

        //绑定
        public void attactView(Contrant.IMainView mainView);

        //解绑
        public void detachView(Contrant.IMainView mainView);


        public void requestData();

    }

    //P层
    public interface IMainModel{

        public void requeData(CallBack callBack);

        public interface CallBack{

            void onCallback(String listBean);

            void onCallBack(String dataBean);
        }

    }


}
