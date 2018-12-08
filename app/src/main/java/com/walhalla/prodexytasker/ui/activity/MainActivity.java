package com.walhalla.prodexytasker.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.walhalla.DEMO_DATA_YEAH;
import com.walhalla.prodexytasker.App;
import com.walhalla.prodexytasker.CircleTransform;
import com.walhalla.prodexytasker.R;
import com.walhalla.prodexytasker.domen.user.UserManager;
import com.walhalla.prodexytasker.ui.activity.BaseActivity;
import com.walhalla.prodexytasker.ui.activity.SignInActivity;
import com.walhalla.prodexytasker.ui.fragment.IssueListFragment;
import com.walhalla.prodexytasker.ui.fragment.NotificationsFragment;
import com.walhalla.prodexytasker.ui.fragment.UserProfileFragment;
import com.walhalla.prodexytasker.ui.fragment.base.BaseFragment;
import com.walhalla.prodexytasker.ui.fragment.tab_container.RootIssueInfoFragment;

import javax.inject.Inject;

import butterknife.BindView;

public class MainActivity extends BaseActivity
        implements BaseFragment.IOnFragmentInteractionListener {

    private static final String TAG = "@@@";

    @Inject
    UserManager mUserManager;
    private DrawerLayout mDrawerLayout;

    @Inject
    DEMO_DATA_YEAH
            demo;


    @BindView(R.id.nav_view)
    NavigationView mNavigationView;
    private View navHeader;


    public MainActivity() {
        App.getAppComponent().inject(this);
    }

    @Override
    protected int getContentResource() {
        return R.layout.activity_main_tab;
    }

    @Override
    protected void init(@Nullable Bundle savedInstanceState) {


        if (!mUserManager.isUserLogIn()) {
            startActivity(new Intent(this, SignInActivity.class));
            this.finish();
            return;
        }

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });

        mDrawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, mDrawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                return selectItem(item.getItemId());
            }
        });

        final Menu menu = mNavigationView.getMenu();
        selectItem(R.id.nav_issue_list);
        setUpDrawerList();
    }

    private void setUpDrawerList() {
        if (mUserManager.isUserLogIn()) {
            //Log.d(TAG, "onCreate: " + UserManager.getInstance().getUser().getToken());
            int avatarSize = getResources().getDimensionPixelSize(R.dimen.profile_image_size);

            this.navHeader = mNavigationView.getHeaderView(0);
            ImageView ivUserProfilePhoto = navHeader.findViewById(R.id.imageView);
            Picasso.with(this)
                    .load(demo.getAvatara())
                    .placeholder(R.drawable.img_circle_placeholder)
                    .resize(avatarSize, avatarSize)
                    .centerCrop()
                    .transform(new CircleTransform())
                    .into(ivUserProfilePhoto);

            TextView nav_header_title = navHeader.findViewById(R.id.nav_header_title);
            TextView nav_header_subtitle = navHeader.findViewById(R.id.nav_header_subtitle);
            nav_header_title.setText("Лучин Алексей Евгеньевич");
            nav_header_subtitle.setText("null@null.nu");
        }
    }


    public void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        try {
            String fragmentTag = fragment.getClass().getName();
            boolean fragmentPopped = fragmentManager
                    .popBackStackImmediate(fragmentTag, 0); //popBackStackImmediate - some times crashed

            if (!fragmentPopped && fragmentManager.findFragmentByTag(fragmentTag) == null) {

                FragmentTransaction ftx = fragmentManager.beginTransaction();
                ftx.addToBackStack(fragment.getClass().getSimpleName());
//                ftx.setCustomAnimations(R.anim.slide_in_right,
//                        R.anim.slide_out_left, R.anim.slide_in_left,
//                        R.anim.slide_out_right);
                ftx.replace(R.id.container, fragment);
                ftx.commit();
            }
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void showInformationIssue(int issue_id_number, String title) {
        replaceFragment(RootIssueInfoFragment.newInstance(issue_id_number, title));
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify mObjects parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private boolean selectItem(int id) {

        //setActionBarTitle(title, false);

        int position = 0;
        switch (id) {
            case R.id.nav_issue_list:
                position = 0;
                replaceFragment(IssueListFragment.newInstance());
                break;

            case R.id.nav_notification:
                position = 1;
                replaceFragment(new NotificationsFragment());
                break;

            case R.id.nav_settings:
                position = 2;
                replaceFragment(UserProfileFragment.newInstance());
                break;


            case R.id.nav_exit:
                startLoginActivity();
                break;

            default:
                break;
        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    @Override
    public void setActionBarTitle(String title, boolean multiline) {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            if (multiline) {
                actionBar.setDisplayShowCustomEnabled(true);
                actionBar.setDisplayShowTitleEnabled(false);
                actionBar.setCustomView(R.layout.action_bar_title_layout);
                ((TextView) findViewById(R.id.action_bar_title)).setText(title);
            } else {
                actionBar.setDisplayShowCustomEnabled(false);
                actionBar.setDisplayShowTitleEnabled(true);
                actionBar.setTitle(title);
            }
        }
    }

    @Override
    public void setActionBarTitle(int title, boolean multiline) {
        setActionBarTitle(getString(title), multiline);
    }

    @Override
    public void tabsVisibility(boolean b) {
        findViewById(R.id.tabs).setVisibility(
                b ? View.VISIBLE : View.GONE
        );
    }
}
