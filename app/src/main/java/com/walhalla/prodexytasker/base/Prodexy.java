package com.walhalla.prodexytasker.base;

public interface Prodexy {

    interface Callback<T> {
        void returnData(T data);
        void error();
    }

    void login(String user, String password, Callback<String> returnUrl);

    void logout(Callback<Boolean> result);

    void settings();
}
