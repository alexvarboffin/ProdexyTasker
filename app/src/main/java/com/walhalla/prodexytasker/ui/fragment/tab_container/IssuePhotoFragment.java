package com.walhalla.prodexytasker.ui.fragment.tab_container;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.walhalla.prodexytasker.Config.ARG_ID;

public class IssuePhotoFragment extends Fragment {

    public static IssuePhotoFragment newInstance(int id) {
        IssuePhotoFragment fragment = new IssuePhotoFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_ID, id);
        fragment.setArguments(bundle);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
