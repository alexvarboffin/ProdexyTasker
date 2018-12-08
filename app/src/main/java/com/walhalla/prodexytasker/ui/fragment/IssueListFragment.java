package com.walhalla.prodexytasker.ui.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pchmn.materialchips.ChipsInput;
import com.pchmn.materialchips.model.ChipInterface;
import com.walhalla.DEMO_DATA_YEAH;
import com.walhalla.beans.ByField;
import com.walhalla.beans.Criteria;
import com.walhalla.beans.DataSourceRequest;
import com.walhalla.beans.Datum;
import com.walhalla.beans.IssueFieldValueCriterias;
import com.walhalla.beans.IssuelistRequest;
import com.walhalla.beans.IssuelistResponse;
import com.walhalla.prodexytasker.App;
import com.walhalla.prodexytasker.R;
import com.walhalla.prodexytasker.rest.NetworkService;
import com.walhalla.prodexytasker.ui.adapter.ComplexRecyclerViewAdapter;
import com.walhalla.prodexytasker.ui.adapter.MyDividerItemDecoration;
import com.walhalla.prodexytasker.ui.fragment.base.BaseFragment;
import com.walhalla.prodexytasker.ui.fragment.base.BaseListFragment;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

//aka Задачи - IssueListResponse
//Получение списка задач

public class IssueListFragment extends BaseListFragment
        implements ComplexRecyclerViewAdapter.ChildItemClickListener {

    private static final String TAG = "@@@";



    @OnClick(R.id.filterDialogButton)
    public void showFilterDialog(View view) {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        Fragment prev = getFragmentManager().findFragmentByTag("dialog");
        if (prev != null) {
            ft.remove(prev);
        }
        ft.addToBackStack(null);

        // Create and show the dialog.
        DialogFragment newFragment = FilterDialogFragment.newInstance();
        newFragment.show(ft, "dialog");
    }


    ComplexRecyclerViewAdapter mAdapter;

    public IssueListFragment() {
        App.getAppComponent().inject(this);
    }


    public static Fragment newInstance() {
        return new IssueListFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.issue_list_fragment, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mListener.setActionBarTitle(R.string.nav_issue_list, false);
        mListener.tabsVisibility(false);

        IssuelistRequest issuelistRequest = new IssuelistRequest();
        issuelistRequest.setAddChilds(false);//default
        List<Criteria> list = new ArrayList<>();

        list.add(new Criteria("BrokenSla", false));
        list.add(new Criteria("Completed", true));
        list.add(new Criteria("Assignee", new int[]{1309, 1310}));

        issuelistRequest.setCriterias(list);

        DataSourceRequest zz = new DataSourceRequest();  //Pagination
        zz.setSkip(0);
        zz.setTake(80);
        issuelistRequest.setDataSourceRequest(zz);


        IssueFieldValueCriterias xx = new IssueFieldValueCriterias();
        xx.setByDictionary(new ArrayList<Object>());
        List<ByField> fields = new ArrayList<>();
        fields.add(new ByField());

        xx.setByField(fields);
        issuelistRequest.setIssueFieldValueCriterias(xx);

        mNetworkService.issueList(issuelistRequest).enqueue(new Callback<IssuelistResponse>() {
            @Override
            public void onResponse(@NonNull Call<IssuelistResponse> call,
                                   @NonNull Response<IssuelistResponse> response) {

                IssuelistResponse issuelistResponse = response.body();
                if (issuelistResponse != null) {
                    List<Object> data = new ArrayList<>();
                    List<Datum> bb = issuelistResponse.getData();
                    data.addAll(bb);
                    mAdapter.swap(data);
                }

            }

            @Override
            public void onFailure(@NonNull Call<IssuelistResponse> call, @NonNull Throwable t) {
                //
            }
        });


        mAdapter = new ComplexRecyclerViewAdapter();
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.addItemDecoration(
                new MyDividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL, 36));

        mRecyclerView.setAdapter(mAdapter);
        mAdapter.setChildItemClickListener(this);


        // get ChipsInput view
        ChipsInput chipsInput = view.findViewById(R.id.chips_input);
        //ChipsInputLayout chipsInputLayout = new ChipsInputLayout(getContext());
        // Set any properties for chips input layout

        List<Criteria> chips = getReallyCoolChips();
        //chipsInput.setFilterableChipList(chips);
        chipsInput.setFilterableList(chips);
        chipsInput.addChipsListener(new ChipsInput.ChipsListener() {
            @Override
            public void onChipAdded(ChipInterface chip, int newSize) {
                // chip added
                // newSize is the size of the updated selected chip list
                Log.i(TAG, "onChipAdded: " + chip.getLabel());
            }

            @Override
            public void onChipRemoved(ChipInterface chip, int newSize) {
                // chip removed
                // newSize is the size of the updated selected chip list
                Log.i(TAG, "onChipRemoved: " + chip);
            }

            @Override
            public void onTextChanged(CharSequence text) {
                // text changed
                Log.i(TAG, "onTextChanged: " + text);
            }
        });
//        ChipView cvTag = view.findViewById(R.id.cvTag);
//        ArrayList<Object> data = new ArrayList<>();
//        data.add("First Item");
//        data.add("Second Item");
//        data.add("Third Item");
//        data.add("Fourth Item");
//        data.add("Fifth Item");
//        data.add("Sixth Item");
//        data.add("Seventh Item");
//        SimpleChipAdapter adapter = new SimpleChipAdapter(data);
//        cvTag.setAdapter(adapter);

        Log.i(TAG, "onViewCreated: "+demo.mObjects);
        mAdapter.swap(demo.mObjects);

    }

    private List<Criteria> getReallyCoolChips() {
        List<Criteria> list = new ArrayList<>();
        for (int i = 0; i < 55; i++) {
            list.add(new Criteria("aaaaaaa" + i, "aaaa" + i));
        }
        return list;
    }


    @Override
    public void onClick(View v, int adapterPosition, Datum datum) {
        if(mListener!=null){
            int id = (datum == null) ? -1 : datum.getId();
            String title = (datum == null) ? null : datum.getFullKey();//&&&&&&&&&&&&&&&&&&

//            mListener.replaceFragment(RootIssueInfoFragment.newInstance(id));
            mListener.showInformationIssue(id, title);
        }
    }
}
