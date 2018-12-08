package com.walhalla.prodexytasker.presentation.view.base;

import com.arellomobile.mvp.MvpView;

public interface BaseView extends MvpView {
    void handleException(String e);

    void showMessage(String msg);
}
