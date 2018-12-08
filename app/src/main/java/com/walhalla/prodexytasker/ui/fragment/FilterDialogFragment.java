package com.walhalla.prodexytasker.ui.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.walhalla.prodexytasker.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class FilterDialogFragment extends DialogFragment {

    @BindView(R.id.dialogFragmentRegionSpinnerId)
    Spinner mSpinner;

    public static FilterDialogFragment newInstance() {

        FilterDialogFragment fragment = new FilterDialogFragment();
        ;
        return fragment;
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NO_TITLE, android.R.style.Theme_Holo_Light_Dialog);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.fragment_dialog_item, container, false);

        ButterKnife.bind(this, v);


//        View closeImg = v.findViewById(R.id.dialogFragmentCloseImageViewId);
//        closeImg.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                dismiss();
//            }
//        });
        Log.d("test", "cur thread is " + Thread.currentThread());


//        DatabaseManager.getInstance().getCategories(new Callback<Category[]>() {
//            @Override
//            public void returnData(final Category[] data) {
//                Log.d("test", "callback thread is " + Thread.currentThread());
////                getActivity().runOnUiThread(new Runnable() {
////                    @Override
////                    public void run() {
//


        String[] data = {"Проект", "Площадка", "Исполнитель", "Статус", "Другое"};
        String[] names = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            names[i] = data[i];//.getName();
        }


        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_spinner_dropdown_item, names);
        mSpinner.post(new Runnable() {
            @Override
            public void run() {
                mSpinner.setAdapter(adapter);
            }
        });
//            }
//        });

        return v;
    }
}
