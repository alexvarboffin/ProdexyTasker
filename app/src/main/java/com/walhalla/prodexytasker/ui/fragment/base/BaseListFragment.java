package com.walhalla.prodexytasker.ui.fragment.base;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;

import com.walhalla.DEMO_DATA_YEAH;
import com.walhalla.prodexytasker.App;
import com.walhalla.prodexytasker.R;
import com.walhalla.prodexytasker.rest.NetworkService;

import javax.inject.Inject;

import butterknife.BindView;

public abstract class BaseListFragment extends BaseFragment{


    public BaseListFragment() {
        App.getAppComponent().inject(this);
    }
    //==============================================
    @Inject
    protected
    NetworkService mNetworkService;

    @Inject
    protected
    DEMO_DATA_YEAH demo;

    //==============================================
    @BindView(R.id.recyclerView)
    protected
    RecyclerView mRecyclerView;

    @BindView(R.id.swipeRefreshLayout)
    SwipeRefreshLayout mSwipeRefreshLayout;


    //==============================================

}
