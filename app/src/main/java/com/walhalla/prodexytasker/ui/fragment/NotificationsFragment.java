package com.walhalla.prodexytasker.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.walhalla.DEMO_DATA_YEAH;
import com.walhalla.prodexytasker.R;
import com.walhalla.prodexytasker.rest.NetworkService;
import com.walhalla.prodexytasker.ui.adapter.NoticeAdapter;
import com.walhalla.prodexytasker.ui.adapter.PaddingDecore;
import com.walhalla.prodexytasker.ui.adapter.item.Notice;
import com.walhalla.prodexytasker.ui.fragment.base.BaseFragment;

import javax.inject.Inject;

import butterknife.BindView;

public class NotificationsFragment extends BaseFragment
        implements NoticeAdapter.ChildItemClickListener {

    //==============================================
    @Inject
    NetworkService mNetworkService;

    @Inject
    DEMO_DATA_YEAH demo;

    //==============================================
    @BindView(R.id.recyclerView)
    RecyclerView mRecyclerView;

    @BindView(R.id.swipeRefreshLayout)
    SwipeRefreshLayout mSwipeRefreshLayout;
    //==============================================

    private NoticeAdapter mNoticeAdapter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.notice_list_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mListener.setActionBarTitle(R.string.nav_notification, false);
        mListener.tabsVisibility(false);


        mNoticeAdapter = new NoticeAdapter(DEMO_DATA_YEAH.loadList());
        mNoticeAdapter.setChildItemClickListener(this);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.addItemDecoration(new PaddingDecore(22, 1));

        mRecyclerView.setAdapter(mNoticeAdapter);
    }

    @Override
    public void onClick(View v, int adapterPosition, Notice obj) {

    }

    @Override
    public void submit(int id) {
        Toast.makeText(getContext(), "pressed", Toast.LENGTH_SHORT).show();
    }
}
