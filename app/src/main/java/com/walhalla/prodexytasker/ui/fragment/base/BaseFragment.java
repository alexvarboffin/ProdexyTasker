package com.walhalla.prodexytasker.ui.fragment.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.View;

import com.arellomobile.mvp.MvpAppCompatFragment;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by combo on 17.06.2017.
 */

public abstract class BaseFragment extends MvpAppCompatFragment {

    protected IOnFragmentInteractionListener mListener;
    private Unbinder mUnbinder;

    public BaseFragment() {
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mUnbinder = ButterKnife.bind(this, view);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        mUnbinder.unbind();
    }




    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof IOnFragmentInteractionListener) {
            mListener = (IOnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement IOnFragmentInteractionListener");
        }
    }
    @Override public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    public interface IOnFragmentInteractionListener {
        void replaceFragment(Fragment fragment);
        //void setActionBarTitle(String title, boolean customView);

        void showInformationIssue(int issue_id_number, String title);

        void setActionBarTitle(String title, boolean multiline);

        void setActionBarTitle(int title, boolean multiline);

        void tabsVisibility(boolean b);
    }
}
