package com.walhalla.prodexytasker.presentation.presenter;

import android.support.annotation.NonNull;
import android.text.TextUtils;

import com.arellomobile.mvp.InjectViewState;
import com.walhalla.beans.SignInRequest;
import com.walhalla.beans.SignInResponse;
import com.walhalla.prodexytasker.App;
import com.walhalla.prodexytasker.R;
import com.walhalla.prodexytasker.domen.user.UserManager;
import com.walhalla.prodexytasker.presentation.presenter.base.BasePresenter;
import com.walhalla.prodexytasker.presentation.view.SignInView;
import com.walhalla.prodexytasker.rest.NetworkService;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


@InjectViewState
public class LoginPresenter extends BasePresenter<SignInView> {


    @Inject
    NetworkService mNetworkService;

    @Inject
    UserManager mUserManager;


    public LoginPresenter() {
        App.getAppComponent().inject(this);
    }

    /**
     * Attempts to sign in or register the account specified by the login form.
     * If there are form errors (invalid email, missing fields, etc.), the
     * errors are presented and no actual login attempt is made.
     *
     * @param email
     * @param password
     * @param server
     */
    public void attemptLogin(String email, String password, String server) {

        getViewState().hideFormError();

        Integer emailError = null;
        Integer passwordError = null;
        Integer serverError = null;

        // Check for mObjects valid password, if the user entered one.
        if (!TextUtils.isEmpty(password) && !isPasswordValid(password)) {
            passwordError = R.string.error_invalid_password;
        }

        // Check for mObjects valid email address.
        if (TextUtils.isEmpty(email)) {
            emailError = R.string.error_field_required;
        } else if (!isEmailValid(email)) {
            emailError = R.string.error_invalid_email;
        }


        // Check for mObjects valid email address.
        if (TextUtils.isEmpty(server)) {
            serverError = R.string.error_field_required;
        }
//        else if (!isEmailValid(email)) {
//            emailError = R.string.error_invalid_email;
//        }

        if (emailError != null || passwordError != null
                || serverError != null) {
            // There was an error; don't attempt login and focus the first
            // form field with an error.
            getViewState().showFormError(emailError, passwordError, serverError);
            return;
        }


        // Show mObjects progress spinner, and kick off mObjects background task to
        // perform the user login attempt.
        getViewState().startSignIn();
        Call<SignInResponse> call = mNetworkService.signIn(new SignInRequest(email, password));
        call.enqueue(new Callback<SignInResponse>() {
            @Override
            public void onResponse(@NonNull Call<SignInResponse> call, @NonNull Response<SignInResponse> response) {
                if (response.isSuccessful() && response.body() != null) {

                    getViewState().finishSignIn();

                    SignInResponse SignInResponse = response.body();

                    if (SignInResponse == null) {
                        //err
                        return;
                    }

                    //Log.d(TAG, "doInBackground: " + SignInResponse.toString());

                    //200 ok 200 err
                    String err = SignInResponse.getError();
                    if (response.code() == 200 && err != null) {
                        String errMessage = SignInResponse.getError();
                        getViewState().failedSignIn(errMessage);
                    } else {
                        boolean success = ((response.code() == 200) && err == null);//Если такой пользователь существует
                        if (success) {
                            String url = SignInResponse.getReturnUrl();
                            UserManager.getInstance().createUser(url);
                            getViewState().successSignIn();
                        } else {
                            getViewState().showFormError(null,
                                    R.string.error_incorrect_password, null);
                        }
                    }

                }
            }

            @Override
            public void onFailure(@NonNull Call<SignInResponse> call, @NonNull Throwable t) {
                getViewState().finishSignIn();
                getViewState().failedSignIn(t.getLocalizedMessage());
            }
        });

        //call.cancel();
    }


    private boolean isEmailValid(String email) {
        //TODO: Replace this with your own logic
        return email.contains("@");
    }

    private boolean isPasswordValid(String password) {
        return password.length() > 4;
    }
}
