package com.walhalla.prodexytasker.presentation.view;

import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.SkipStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;
import com.walhalla.prodexytasker.presentation.view.base.BaseView;


@StateStrategyType(AddToEndSingleStrategy.class)
public interface WelcomeView extends BaseView {


    @StateStrategyType(SkipStrategy.class)
    void showProgressText(String s);

    void successResult();

    void showProgress(int i);

    void showUserData(String username, String photo);
}
