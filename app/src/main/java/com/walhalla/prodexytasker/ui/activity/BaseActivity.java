package com.walhalla.prodexytasker.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.walhalla.prodexytasker.domen.user.UserManager;

import butterknife.ButterKnife;

public abstract class BaseActivity extends MvpAppCompatActivity{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentResource());
        ButterKnife.bind(this);
        init(savedInstanceState);
    }

//    private ActivityComponent buildComponent() {
//        return DaggerActivityComponent.builder()
//                .activityModule(new ActivityModule(this))
//                .applicationComponent(((App) getApplication()).getComponent())
//                .build();
//    }

    protected void addFragment(int container, Fragment fragment) {
        getSupportFragmentManager().beginTransaction()
                .add(container, fragment)
                .commit();
    }

//    @Override
//    protected void attachBaseContext(Context newBase) {
//        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
//    }


    protected void startLoginActivity() {
        UserManager.getInstance().logout();
        Intent loginIntent = new Intent(this, SignInActivity.class);
        startActivity(loginIntent);
        this.finish();
    }

    /**
     * Layout resource to be inflated
     *
     * @return layout resource
     */
    @LayoutRes
    protected abstract int getContentResource();

    /**
     * Initialisations
     */
    protected abstract void init(@Nullable Bundle state);

}
