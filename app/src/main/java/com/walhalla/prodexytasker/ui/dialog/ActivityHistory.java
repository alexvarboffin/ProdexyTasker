package com.walhalla.prodexytasker.ui.dialog;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.walhalla.prodexytasker.R;

public class ActivityHistory extends DialogFragment{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container, Bundle savedInstanceState) {
        // Do all the stuff to initialize your custom view
        return inflater.inflate(R.layout.fragment_activity_history_dialog,
                container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }


    /*FragmentTransaction ft = getFragmentManager().beginTransaction();
Fragment prev = getFragmentManager().findFragmentByTag("dialog");
if (prev != null) {
 ft.remove(prev);
}
ft.addToBackStack(null);

DialogFragment dialogFragment = new MyCustomDialogFragment();
dialogFragment.show(ft, "dialog");*/
}
