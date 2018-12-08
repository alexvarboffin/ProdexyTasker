package com.walhalla.prodexytasker.di.component;

import com.walhalla.prodexytasker.App;
import com.walhalla.prodexytasker.ui.activity.MainActivity;
import com.walhalla.prodexytasker.di.module.ApplicationModule;
import com.walhalla.prodexytasker.presentation.presenter.CommentsBlockPresenter;
import com.walhalla.prodexytasker.presentation.presenter.LoginPresenter;
import com.walhalla.prodexytasker.presentation.presenter.WelcomePresenter;
import com.walhalla.prodexytasker.presentation.tab.IssueInfoPresenter;
import com.walhalla.prodexytasker.ui.fragment.IssueListFragment;
import com.walhalla.prodexytasker.ui.fragment.UserProfileFragment;
import com.walhalla.prodexytasker.ui.fragment.base.BaseListFragment;
import com.walhalla.prodexytasker.ui.fragment.tab_container.IssueCardFilesFragment;
import com.walhalla.prodexytasker.ui.fragment.tab_container.IssueInfoFragment;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
    void inject(App app);

    void inject(LoginPresenter loginPresenter);

    void inject(MainActivity mainActivity);

    void inject(IssueListFragment issueListFragment);

    void inject(CommentsBlockPresenter commentsBlockPresenter);

    void inject(WelcomePresenter welcomePresenter);

    void inject(IssueInfoPresenter issueInfoPresenter);

    void inject(IssueInfoFragment issueInfoFragment);

    void inject(IssueCardFilesFragment issueCardFilesFragment);

    void inject(BaseListFragment baseListFragment);

    void inject(UserProfileFragment userProfileFragment);
}
