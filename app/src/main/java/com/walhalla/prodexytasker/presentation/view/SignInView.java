package com.walhalla.prodexytasker.presentation.view;

import com.arellomobile.mvp.MvpView;

public interface SignInView extends MvpView {
    void startSignIn();

    void finishSignIn();

    void failedSignIn(String message);

    void hideError();

    void hideFormError();

    void showFormError(Integer emailError, Integer passwordError, Integer serverError);

//    @StateStrategyType(SkipStrategy.class)
    void successSignIn();
}
