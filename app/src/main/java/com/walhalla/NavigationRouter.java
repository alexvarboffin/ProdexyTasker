package com.walhalla;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.walhalla.prodexytasker.ui.activity.MainActivity;
import com.walhalla.prodexytasker.ui.activity.SignInActivity;
import com.walhalla.prodexytasker.ui.activity.WelcomeActivity;

import static android.content.Intent.FLAG_ACTIVITY_NEW_TASK;

public class NavigationRouter {

    private String currentLocation = null;

    public enum Point {
        SIGN_IN_ACTIVITY,
        WELCOME_ACTIVITY,
        MAIN_ACTIVITY
    }


    private final Context mContext;

    public NavigationRouter(Context context) {
        this.mContext = context;
    }


    public void init() {
        navigate(Point.MAIN_ACTIVITY);
    }


    private void navigate(Point point) {

        Class<? extends Activity> clazz = null;

        switch (point) {
            case SIGN_IN_ACTIVITY:
                clazz = SignInActivity.class;
                break;

            case WELCOME_ACTIVITY:
                clazz = WelcomeActivity.class;
                break;

            case MAIN_ACTIVITY:
                clazz = MainActivity.class;

            default:

                break;
        }
        Intent intent = new Intent(mContext, clazz);
        intent.setFlags(FLAG_ACTIVITY_NEW_TASK);
        mContext.startActivity(intent);
    }
}
