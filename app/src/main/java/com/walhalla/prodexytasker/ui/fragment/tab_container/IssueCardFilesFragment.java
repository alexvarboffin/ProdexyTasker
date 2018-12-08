package com.walhalla.prodexytasker.ui.fragment.tab_container;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.walhalla.DEMO_DATA_YEAH;
import com.walhalla.prodexytasker.App;
import com.walhalla.prodexytasker.R;
import com.walhalla.prodexytasker.rest.NetworkService;
import com.walhalla.prodexytasker.ui.adapter.IssueCardFilesAdapter;
import com.walhalla.prodexytasker.ui.adapter.MyDividerItemDecoration;
import com.walhalla.prodexytasker.ui.fragment.base.BaseListFragment;

import javax.inject.Inject;

import butterknife.BindView;

import static com.walhalla.prodexytasker.Config.ARG_ID;

public class IssueCardFilesFragment extends BaseListFragment
        implements IssueCardFilesAdapter.ChildItemClickListener {


    private IssueCardFilesAdapter mAdapter;

    public static IssueCardFilesFragment newInstance(int id) {
        IssueCardFilesFragment fragment = new IssueCardFilesFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_ID, id);
        fragment.setArguments(bundle);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.issue_files_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });



        mAdapter = new IssueCardFilesAdapter(demo.IssueCardFilesResponse(), getContext());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.addItemDecoration(
                new MyDividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL, 36));

        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setChildItemClickListener(this);
    }

    @Override
    public void onClick(View v, int position) {

    }
}
