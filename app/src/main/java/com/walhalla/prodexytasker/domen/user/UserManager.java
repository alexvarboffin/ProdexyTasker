package com.walhalla.prodexytasker.domen.user;

public class UserManager {
    private static final UserManager INSTANCE = new UserManager();

    public static UserManager getInstance() {
        return INSTANCE;
    }


    public void initializeUser() {

    }

    public void logout() {
    }

    public boolean isUserLogIn() {
        return true;
    }

    public void createUser(String url) {
    }
}
