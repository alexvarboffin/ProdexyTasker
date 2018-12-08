package com.walhalla.prodexytasker.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.walhalla.prodexytasker.R;

public class AppCompatUtil {



    public static void copyToClipboard(Context context, String text) {
        ClipboardManager service = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData myClip = ClipData.newPlainText("text", text);
        if (service != null) {
            service.setPrimaryClip(myClip);
        }
    }

//    public static void setActionBarTitle(AppCompatActivity a, String title, boolean multiline) {
//        ActionBar actionBar = a.getSupportActionBar();
//        if (actionBar != null) {
//            if (multiline) {
//                actionBar.setDisplayShowCustomEnabled(multiline);
//                actionBar.setCustomView(R.layout.action_bar_title_layout);
//                ((TextView) a.findViewById(R.id.action_bar_title)).setText(title);
//            } else {
//                actionBar.setDisplayShowCustomEnabled(multiline);
//                actionBar.setTitle(title);
//            }
//        }
//    }
//
//    public static void setActionBarTitle(AppCompatActivity a, int title, boolean multiline) {
//        setActionBarTitle(a, a.getString(title), multiline);
//    }
}
