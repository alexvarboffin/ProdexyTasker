package com.walhalla.prodexytasker;

import android.app.Application;
import android.util.Log;

import com.walhalla.DEMO_DATA_YEAH;
import com.walhalla.NavigationRouter;
import com.walhalla.prodexytasker.di.component.ApplicationComponent;
import com.walhalla.prodexytasker.di.component.DaggerApplicationComponent;
import com.walhalla.prodexytasker.di.module.ApplicationModule;
import com.walhalla.prodexytasker.domen.user.UserManager;

import javax.inject.Inject;

public class App extends Application {

    private static final String TAG = "@@@";

    @Inject
    NavigationRouter mNavigator;

    @Inject
    DEMO_DATA_YEAH demo;

    private static ApplicationComponent component;

    public static ApplicationComponent getAppComponent() {
        return component;
    }

    @Override
    public void onCreate() {
        super.onCreate();


        UserManager.getInstance().initializeUser();


        component = buildComponent();
        component.inject(App.this);

        mNavigator.init();
    }


    private ApplicationComponent buildComponent() {
        return DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }
}
