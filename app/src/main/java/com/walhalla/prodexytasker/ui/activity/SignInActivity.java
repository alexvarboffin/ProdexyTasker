package com.walhalla.prodexytasker.ui.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.TargetApi;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.EditorInfo;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.walhalla.prodexytasker.R;
import com.walhalla.prodexytasker.presentation.presenter.LoginPresenter;
import com.walhalla.prodexytasker.presentation.view.SignInView;

/**
 * A login screen that offers login via email/password.
 */
public class SignInActivity extends BaseActivity implements SignInView {

    // UI references.
    private AutoCompleteTextView mEmailView;
    private EditText mPasswordView;
    private EditText tvServer;

    private View mProgressView;
    private View mLoginFormView;
    private TextView mForgotPasswordTv;

    private RelativeLayout rl1;

    @InjectPresenter
    LoginPresenter mLoginPresenter;


    @Override
    protected int getContentResource() {
        return R.layout.activity_login_container;
    }

    @Override
    protected void init(@Nullable Bundle state) {
        // Set up the login form.
        mEmailView = findViewById(R.id.email);

        rl1 = findViewById(R.id.rl1);

        mPasswordView = findViewById(R.id.extendedRegistrationFragmentEmailId);
        mPasswordView.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int id, KeyEvent keyEvent) {
                if (id == R.id.login || id == EditorInfo.IME_NULL) {
                    // Store values at the time of the login attempt.
                    submitForm();
                    return true;
                }
                return false;
            }
        });

        Button mEmailSignInButton = findViewById(R.id.email_sign_in_button);
        mEmailSignInButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                submitForm();
            }
        });

        mLoginFormView = findViewById(R.id.extendedRegistrationFragmentLoginFormId);
        mProgressView = findViewById(R.id.registrationExtendedFragmentLoginProgressId);
        mForgotPasswordTv = findViewById(R.id.extendedRegistrationFragmentGenDirectorName);
        tvServer = findViewById(R.id.extendedRegistrationFragmenServer);


        mForgotPasswordTv.setPaintFlags(mForgotPasswordTv.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        mForgotPasswordTv.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignInActivity.this, "run tegistration", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(SignInActivity.this, RegistrationActivity.class);
                startActivity(intent);
            }
        });
    }

    private void submitForm() {
        String email = mEmailView.getText().toString();
        String password = mPasswordView.getText().toString();
        String server = tvServer.getText().toString();
        mLoginPresenter.attemptLogin(email, password, server);
    }


    /**
     * Shows the progress UI and hides the login form.
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR2)
    private void showProgress(final boolean show) {
        // On Honeycomb MR2 we have the ViewPropertyAnimator APIs, which allow
        // for very easy animations. If available, use these APIs to fade-in
        // the progress spinner.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
            int shortAnimTime = getResources().getInteger(android.R.integer.config_shortAnimTime);

            mLoginFormView.setVisibility(show ? View.GONE : View.VISIBLE);
            mLoginFormView.animate().setDuration(shortAnimTime).alpha(
                    show ? 0 : 1).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    mLoginFormView.setVisibility(show ? View.GONE : View.VISIBLE);
                }
            });

            mProgressView.setVisibility(show ? View.VISIBLE : View.GONE);
            mProgressView.animate().setDuration(shortAnimTime).alpha(
                    show ? 1 : 0).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    mProgressView.setVisibility(show ? View.VISIBLE : View.GONE);
                }
            });
        } else {
            // The ViewPropertyAnimator APIs are not available, so simply show
            // and hide the relevant UI components.
            mProgressView.setVisibility(show ? View.VISIBLE : View.GONE);
            mLoginFormView.setVisibility(show ? View.GONE : View.VISIBLE);
        }
    }

    @Override
    public void startSignIn() {
        showProgress(true);
    }

    @Override
    public void finishSignIn() {
        showProgress(false);
    }

    @Override
    public void failedSignIn(String message) {
        Snackbar.make(rl1, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

    @Override
    public void hideError() {

    }

    @Override
    public void hideFormError() {
        // Reset errors.
        mEmailView.setError(null);
        mPasswordView.setError(null);
    }

    @Override
    public void showFormError(Integer emailError, Integer passwordError, Integer serverError) {

        View focusView = null;

        if (passwordError != null) {
            mPasswordView.setError(getString(passwordError));
            mPasswordView.setHintTextColor(getResources().getColor(R.color.colorPrimary));
            focusView = mPasswordView;
        }
        if (emailError != null) {
            mEmailView.setError(getString(emailError));
            focusView = mEmailView;
        }
        if (serverError != null) {
            tvServer.setError(getString(serverError));
            focusView = tvServer;
        }
        if (focusView != null) {
            focusView.requestFocus();
        }
    }

    @Override
    public void successSignIn() {
        startActivity(new Intent(this, WelcomeActivity.class));
    }
}
