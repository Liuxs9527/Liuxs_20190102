package com.bwie.administrator.liuxs_20190102.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.bwie.administrator.liuxs_20190102.R;
import com.bwie.administrator.liuxs_20190102.di.contrant.Contrant;
import com.bwie.administrator.liuxs_20190102.di.presenter.IMainPresenterImpl;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements Contrant.IMainView {

    @BindView(R.id.recycler)
    RecyclerView recycler;
    private IMainPresenterImpl mainPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mainPresenter = new IMainPresenterImpl();
        mainPresenter.attactView(this);



    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void NewsData(String bean) {

    }

    @Override
    public void ShowData(String dataBean) {

    }


}
