package com.ryan.corelibs.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.ryan.corelibs.R;
import com.ryan.corelibs.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.ac_main);
        MainPresenter mainPresenter=new MainPresenter();
//        mainPresenter.getModuleList( "[30]",
//                "[1,2,3]","[]",0,10,1);

        mainPresenter.loadCenterInfo();
    }
}
