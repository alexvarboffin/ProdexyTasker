package com.walhalla.prodexytasker.ui.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.squareup.picasso.Picasso;
import com.walhalla.prodexytasker.CircleTransform;
import com.walhalla.prodexytasker.R;
import com.walhalla.prodexytasker.presentation.presenter.WelcomePresenter;
import com.walhalla.prodexytasker.presentation.view.WelcomeView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WelcomeActivity extends MvpAppCompatActivity implements WelcomeView {

    private static final String TAG = "@@@";


    @InjectPresenter
    WelcomePresenter mWelcomePresenter;

    /**
     * Gui
     */
    @BindView(R.id.progress_text)
    TextView mTextView;
    @BindView(R.id.tv_name)
    TextView name;
    @BindView(R.id.progress_bar)
    ProgressBar mProgressBar;

    @BindView(R.id.photo)
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wellcome);
        ButterKnife.bind(this);
    }

    @Override
    public void showProgressText(String s) {
        if (mTextView != null) {
            mTextView.setText(s);
        }
    }

    @Override
    public void successResult() {
        //Finish without navigation to main activity
        this.finish();
    }

    @Override
    public void showProgress(int i) {
        mProgressBar.setProgress(i);
        Log.i(TAG, "showProgress: " + i);

    }

    @Override
    public void showUserData(String username, String photo) {

        int avatarSize = getResources().getDimensionPixelSize(R.dimen.welcome_iv_profile_size);

        //if (i == 10 || i == 30 || i == 80) {
//            name.animate().alpha(0.0f);
//            Picasso.with(this)
//                    .load(R.drawable.default_profile)
//                    .placeholder(R.drawable.img_circle_placeholder)
//                    .resize(avatarSize, avatarSize)
//                    .centerCrop()
//                    .transform(new CircleTransform())
//                    .into(mImageView);
        //} else {
        name.animate().alpha(0.0f);
        name.setText(username);
        name.animate().alpha(1.0f);
        Picasso.with(this)
                .load(photo)
                .placeholder(R.drawable.img_circle_placeholder)
                .resize(avatarSize, avatarSize)
                .centerCrop()
                .transform(new CircleTransform())
                .into(mImageView);
        //}
    }

    @Override
    public void handleException(String e) {
        Toast.makeText(this, e, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showMessage(String msg) {

    }
}
