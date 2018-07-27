package com.ryan.corelibs.widget;

import android.widget.TextView;

import com.ryan.corelibs.R;

import butterknife.BindView;

/**
 * 标题栏
 */
public class NavBar {

    @BindView(R.id.tv_title) TextView tvTitle;


    public void setTitle(String title) {
        tvTitle.setText(title);
    }

    public void setTitle(int title) {
        tvTitle.setText(title);
    }
}
