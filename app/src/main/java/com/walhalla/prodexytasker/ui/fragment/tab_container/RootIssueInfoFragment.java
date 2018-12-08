package com.walhalla.prodexytasker.ui.fragment.tab_container;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rahimlis.badgedtablayout.BadgedTabLayout;
import com.walhalla.prodexytasker.Config;
import com.walhalla.prodexytasker.R;
import com.walhalla.prodexytasker.ui.fragment.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

public class RootIssueInfoFragment extends BaseFragment {


    private static final String KEY_TAB_POSITION = "key:tab_container:pos";

    private int id = -1;
    private String title;

    /**
     * Ui
     */
    private ViewPager mViewPager;

    private ViewPagerAdapter mPagerAdapter;


    public static Fragment newInstance(int id, String title) {
        RootIssueInfoFragment fragment = new RootIssueInfoFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(Config.ARG_ID, id);
        bundle.putString(Config.ARG_TITLE, title);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_trainings_root, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        mViewPager = view.findViewById(R.id.viewPager);


        if (getArguments() != null) {
            this.id = getArguments().getInt(Config.ARG_ID);
            this.title = getArguments().getString(Config.ARG_TITLE);
        }

        mListener.setActionBarTitle(title, true);

        //Issue aka Datum

        mPagerAdapter = new ViewPagerAdapter(getFragmentManager());
        mPagerAdapter.addFragment(IssuePhotoFragment.newInstance(id), "");
        mPagerAdapter.addFragment(IssueInfoFragment.newInstance(id), "");//Карточка задачи
        mPagerAdapter.addFragment(CommentsBlockFragment.newInstance(id), "");
        mPagerAdapter.addFragment(IssueCardFilesFragment.newInstance(id), "");
        mViewPager.setAdapter(mPagerAdapter);
        configParentActivityTabLayout(mViewPager);


        if (savedInstanceState != null) {
            mViewPager.setCurrentItem(savedInstanceState.getInt(KEY_TAB_POSITION, 1));
        }
    }

    private void configParentActivityTabLayout(ViewPager mViewPager) {
        if (getActivity() != null) {

            BadgedTabLayout tabLayout = getActivity().findViewById(R.id.tabs);
            tabLayout.setVisibility(View.VISIBLE);
            mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
            tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

            tabLayout.setupWithViewPager(mViewPager);
//        mViewPager.setOffscreenPageLimit(3);
//        tabLayout.getTabAt(0).setText(R.string.tab_text_1);


//            tabLayout.getTabAt(0).setIcon(R.drawable.ic_photo_camera_black_24dp);
//            tabLayout.getTabAt(1).setIcon(R.drawable.ic_assignment_black_24dp);
//            tabLayout.getTabAt(2).setIcon(R.drawable.ic_speaker_notes_black_24dp);
//            tabLayout.getTabAt(3).setIcon(R.drawable.ic_attachment_black_24dp);


//        tabLayout.getTabAt(1).setText(R.string.tab_text_2);

////
////        tabLayout.getTabAt(2).setText(R.string.tab_text_3);


            tabLayout.setIcon(0, R.drawable.ic_photo_camera_black_24dp);
            tabLayout.setIcon(1, R.drawable.ic_assignment_black_24dp);
            tabLayout.setIcon(2, R.drawable.ic_speaker_notes_black_24dp);
            tabLayout.setIcon(3, R.drawable.ic_attachment_black_24dp);

            //first parameter is the tab index, at which badge should appear
            tabLayout.setBadgeText(3, "16");
            //if you want to hide a badge pass null as a second parameter
            //tablayout.setBadgeText(0,null);
        }
    }


    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_TAB_POSITION, mViewPager.getCurrentItem());
    }


    private static class ViewPagerAdapter
            extends FragmentStatePagerAdapter/*FragmentPagerAdapter */ {

        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        ViewPagerAdapter(android.support.v4.app.FragmentManager manager) {
            super(manager);
        }

        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        @Override
        public int getItemPosition(@NonNull Object object) {
            return super.getItemPosition(object);
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }

        void addFragment(android.support.v4.app.Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add((title == null) ? "" : title);
        }
    }
}
