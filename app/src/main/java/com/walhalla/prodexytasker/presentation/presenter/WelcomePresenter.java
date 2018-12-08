package com.walhalla.prodexytasker.presentation.presenter;

import android.os.AsyncTask;
import android.support.annotation.NonNull;

import com.arellomobile.mvp.InjectViewState;
import com.walhalla.beans.SettingRequest;
import com.walhalla.prodexytasker.App;
import com.walhalla.prodexytasker.domen.user.UserManager;
import com.walhalla.prodexytasker.presentation.presenter.base.BasePresenter;
import com.walhalla.prodexytasker.presentation.view.WelcomeView;
import com.walhalla.prodexytasker.rest.NetworkService;

import java.util.Random;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@InjectViewState
public class WelcomePresenter extends BasePresenter<WelcomeView> {

    private static final String TAG = "@@@";

    @Inject
    UserManager mUserManager;

    @Inject
    NetworkService mNetworkService;

    private MyTask mMyTask;

    public WelcomePresenter() {
        App.getAppComponent().inject(this);
        mMyTask = new MyTask(new MyTask.TaskCallback() {
            @Override
            public void onProgressUpdate(Integer[] values) {
                getViewState().showProgressText("ЗАГРУЗКА ДАННЫХ ПОЛЬЗОВАТЕЛЯ"
                        + new String(new char[values[0]])
                        .replace("\n", "."));

                getViewState().showProgress(randomProgress(values[0]));
                getViewState().showUserData("Ivanov Ivan Ivanovich",
                        "https://www.gravatar.com/avatar/aa282cb43dd92c3383fdffddd386c19c?d=mm&s=200");

                if (values[0] == 4) {
                    getViewState().successResult();
                }
            }
        });

        mMyTask.execute();

        //if (!mUserManager.isUserLogIn()) {
        mNetworkService.settings().enqueue(new Callback<SettingRequest>() {
            @Override
            public void onResponse(@NonNull Call<SettingRequest> call,
                                   @NonNull Response<SettingRequest> response) {
                if (response.code() == 200) {
                    SettingRequest hh = response.body();


                    //Update setings...

                    getViewState().successResult();
                    WelcomePresenter.this.onDestroy();

                } else if (response.code() == 401) {
                    //Unauthorized.
                }
            }

            @Override
            public void onFailure(@NonNull Call<SettingRequest> call, @NonNull Throwable t) {
                getViewState().handleException(t.getLocalizedMessage());
            }
        });
//        } else {
//                                    getViewState().successResult();
//                        WelcomePresenter.this.onDestroy();
//        }
    }

    @Override
    public void onDestroy() {
        if (mMyTask != null && !mMyTask.isCancelled()) {
            mMyTask.cancel(true);
            mMyTask = null;
        }
        super.onDestroy();
    }


    private static class MyTask extends AsyncTask<Integer, Integer, String> {

        private final TaskCallback taskCallback;

        MyTask(TaskCallback taskCallback) {
            this.taskCallback = taskCallback;
        }

        interface TaskCallback {
            void onProgressUpdate(Integer[] values);
        }

        @Override
        protected String doInBackground(Integer... integers) {

            int o = 0;

            while (true) {
                try {

                    o = (o > 9) ? 1 : ++o;
                    Thread.sleep(1000);
                    publishProgress(o);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);
            if (taskCallback != null) {
                taskCallback.onProgressUpdate(values);
            }
        }
    }


    private int randomProgress(int position) {

        int diapason[][] = {
                {0, 22},
                {22, 37},
                {37, 66},
                {66, 100}
        };

        if (position > diapason.length - 1) {
            return 100;
        }

        Random r = new Random();
        return r.nextInt(diapason[position][1] - diapason[position][0])
                + diapason[position][0];
    }

}
