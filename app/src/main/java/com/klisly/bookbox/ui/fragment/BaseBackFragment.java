package com.klisly.bookbox.ui.fragment;

import com.klisly.bookbox.R;

import android.support.v7.widget.Toolbar;
import android.view.View;

public class BaseBackFragment extends BaseFragment {

    protected void initToolbarNav(Toolbar toolbar) {
        initToolbarNav(toolbar, true);
    }

    protected void initToolbarNav(Toolbar toolbar, boolean initMenu) {
        toolbar.setNavigationIcon(R.drawable.ic_arrow_back_white_24dp);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                _mActivity.onBackPressed();
            }
        });
        if(initMenu) {
            initToolbarMenu(toolbar);
        }
    }
}