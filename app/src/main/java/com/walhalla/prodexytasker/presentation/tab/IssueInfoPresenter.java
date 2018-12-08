package com.walhalla.prodexytasker.presentation.tab;

import android.support.annotation.NonNull;

import com.arellomobile.mvp.InjectViewState;
import com.walhalla.beans.IssuesResponse;
import com.walhalla.prodexytasker.App;
import com.walhalla.prodexytasker.presentation.presenter.base.BasePresenter;
import com.walhalla.prodexytasker.presentation.view.tab.IssueInfoView;
import com.walhalla.prodexytasker.rest.NetworkService;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


@InjectViewState
public class IssueInfoPresenter extends BasePresenter<IssueInfoView> {

    @Inject
    NetworkService mNetworkService;

    public IssueInfoPresenter() {
        App.getAppComponent().inject(this);
        douu();
    }

    /*Для получения данных карточки задачи использовать метод: “Получение полей задачи”
        Метод возвращает данные задачи. Данных очень много.
        */
    private void douu() {
        mNetworkService.issues(99).enqueue(new Callback<IssuesResponse>() {
            @Override
            public void onResponse(@NonNull Call<IssuesResponse> call,
                                   @NonNull Response<IssuesResponse> response) {

                IssuesResponse issuesResponse = response.body();
                if (response.code() == 200 && issuesResponse != null) {
                }
            }

            @Override
            public void onFailure(@NonNull Call<IssuesResponse> call,
                                  @NonNull Throwable t) {

            }
        });

    }
}
