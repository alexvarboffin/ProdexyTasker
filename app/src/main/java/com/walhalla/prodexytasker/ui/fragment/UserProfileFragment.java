package com.walhalla.prodexytasker.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.walhalla.beans.SettingRequest;
import com.walhalla.beans.UserInfo;
import com.walhalla.prodexytasker.App;
import com.walhalla.prodexytasker.R;
import com.walhalla.prodexytasker.presentation.view.base.BaseView;
import com.walhalla.prodexytasker.rest.NetworkService;
import com.walhalla.prodexytasker.ui.fragment.base.BaseFragment;

import javax.inject.Inject;

import butterknife.BindView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class UserProfileFragment
        extends BaseFragment implements BaseView {


    @Inject
    NetworkService mNetworkService;


    @BindView(R.id.tv_eMail)
    TextView eMail;
    @BindView(R.id.tv_userName)
    TextView userName;
    @BindView(R.id.tv_activeDirectorySid)
    TextView activeDirectorySid;
    @BindView(R.id.tv_activeDirectoryAccountName)
    TextView activeDirectoryAccountName;
    @BindView(R.id.tv_windowsDomainFullyQualifiedDomainName)
    TextView windowsDomainFullyQualifiedDomainName;
    @BindView(R.id.tv_phone)
    TextView phone;
    @BindView(R.id.tv_mobilePhone)
    TextView mobilePhone;
    @BindView(R.id.tv_departmentNames)
    TextView departmentNames;
    @BindView(R.id.tv_roleName)
    TextView roleName;
    @BindView(R.id.tv_areaName)
    TextView areaName;
    @BindView(R.id.tv_positionName)
    TextView positionName;
    @BindView(R.id.tv_groupNames)
    TextView groupNames;

    public UserProfileFragment() {
        App.getAppComponent().inject(this);
    }


    public static Fragment newInstance() {
        return new UserProfileFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.settings_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mListener.setActionBarTitle(R.string.action_settings, false);
        mListener.tabsVisibility(false);


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


        mNetworkService.settings().enqueue(new Callback<SettingRequest>() {
            @Override
            public void onResponse(@NonNull Call<SettingRequest> call,
                                   @NonNull Response<SettingRequest> response) {


                SettingRequest body = response.body();
                if (body != null) {
                    UserInfo userInfo = body.getUserInfo();



                } else if (response.code() == 401) {
                    showMessage("401 Unauthorized");
                }

            }

            @Override
            public void onFailure(@NonNull Call<SettingRequest> call,
                                  @NonNull Throwable t) {
                handleException(t.getLocalizedMessage());

            }
        });
    }


    @Override
    public void handleException(String e) {
        Toast.makeText(getContext(), e, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showMessage(String msg) {

    }
}
