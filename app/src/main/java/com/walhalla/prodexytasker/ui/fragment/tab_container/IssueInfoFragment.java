package com.walhalla.prodexytasker.ui.fragment.tab_container;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.walhalla.beans.Field;
import com.walhalla.beans.IssuesResponse;
import com.walhalla.prodexytasker.App;
import com.walhalla.prodexytasker.CircleTransform;
import com.walhalla.prodexytasker.Config;
import com.walhalla.prodexytasker.R;
import com.walhalla.prodexytasker.presentation.view.base.BaseView;
import com.walhalla.prodexytasker.rest.NetworkService;
import com.walhalla.prodexytasker.ui.AppCompatUtil;
import com.walhalla.prodexytasker.ui.fragment.base.BaseFragment;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static com.walhalla.prodexytasker.Config.ARG_ID;

public class IssueInfoFragment extends BaseFragment implements BaseView {


    @Inject
    NetworkService mNetworkService;


    @BindView(R.id.tv_id)
    TextView mId;

    @BindView(R.id.tv_author_name)
    TextView name;


    @BindView(R.id.content)
    TextView tv_content;


    @BindView(R.id.userPic)
    ImageView userpic;

    private int id;

    public IssueInfoFragment() {
        App.getAppComponent().inject(this);
    }

    @OnClick(R.id.tv_id)
    void copyToBuffer(View view) {
        AppCompatUtil.copyToClipboard(getContext(), mId.getText().toString());
        Snackbar.make(view, "ID задачи скопирован", Snackbar.LENGTH_LONG).show();
    }

    public static IssueInfoFragment newInstance(int id) {
        IssueInfoFragment fragment = new IssueInfoFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(ARG_ID, id);
        fragment.setArguments(bundle);
        return fragment;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.issue_info_fragment, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        if (getArguments() != null) {
            id = getArguments().getInt(Config.ARG_ID);
        }


        int avatarSize = getResources()
                .getDimensionPixelSize(R.dimen.comments_iv_user_pic_size);

        Picasso.with(getContext())
                .load("https://www.gravatar.com/avatar/73f5fc5486eda0431e1da1ac1e767743?s=328&d=identicon&r=PG")
                .placeholder(R.drawable.img_circle_placeholder)
                .resize(avatarSize, avatarSize)
                .centerCrop()
                .transform(new CircleTransform())
                .into(userpic);

        jjj();
    }

    private void jjj() {
        mNetworkService.issues(id).enqueue(new Callback<IssuesResponse>() {
            @Override
            public void onResponse(@NonNull Call<IssuesResponse> call,
                                   @NonNull Response<IssuesResponse> response) {

                IssuesResponse issue = response.body();

                if (response.code() == 200 && issue != null) {
                    List<Field> hh = issue.getFields();
                    for (int i = 0; i < hh.size(); i++) {

                        Field field = hh.get(i);
//                        field.getSchema().getDisplayName()

                    }
                }
            }

            @Override
            public void onFailure(@NonNull Call<IssuesResponse> call,
                                  @NonNull Throwable t) {

            }
        });
    }


    @Override
    public void handleException(String e) {

    }

    @Override
    public void showMessage(String msg) {

    }
}
