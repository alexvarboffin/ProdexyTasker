package com.walhalla.prodexytasker.presentation.presenter;

import android.support.annotation.NonNull;
import android.view.View;

import com.arellomobile.mvp.InjectViewState;
import com.walhalla.DEMO_DATA_YEAH;
import com.walhalla.beans.CommentsBlockRequest;
import com.walhalla.beans.CommentsBlockResponse;
import com.walhalla.prodexytasker.App;
import com.walhalla.prodexytasker.presentation.presenter.base.BasePresenter;
import com.walhalla.prodexytasker.presentation.view.CommentsBlockView;
import com.walhalla.prodexytasker.rest.NetworkService;
import com.walhalla.prodexytasker.ui.adapter.CommentsAdapter;

import java.util.List;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


@InjectViewState
public class CommentsBlockPresenter
        extends BasePresenter<CommentsBlockView>
        implements CommentsAdapter.Callback {

    private static final String TAG = "@@@";

    @Inject
    NetworkService mNetworkService;

    @Inject
    DEMO_DATA_YEAH demo;

    public CommentsBlockPresenter() {
        App.getAppComponent().inject(this);
        loadFeed();
    }

    public void loadFeed() {

        Call<List<CommentsBlockResponse>> call = mNetworkService.commentsBlock(new CommentsBlockRequest());
        call.enqueue(new Callback<List<CommentsBlockResponse>>() {

            @Override
            public void onResponse(@NonNull Call<List<CommentsBlockResponse>> call,
                                   @NonNull Response<List<CommentsBlockResponse>> response) {

                getViewState().hideLoading();

                List<CommentsBlockResponse> blockResponse = response.body();
//                int code = blockResponse.getCode();
//                boolean isError = blockResponse.isError();
//
//                if (isError && code == 409) {
//                    String errMsg = blockResponse.getMessage();
//                    getViewState().showError(errMsg);
//                }
//                if (!isError && code == 200) {
//                    List<Message> data = blockResponse.getData();
//                    getViewState().updateFeedList(data);
//                }

                getViewState().showCommentsBlock(demo.getComments());
            }

            @Override
            public void onFailure(@NonNull Call<List<CommentsBlockResponse>> call, @NonNull Throwable t) {
                getViewState().handleException(t.getLocalizedMessage());
                getViewState().hideLoading();
            }
        });
    }

    @Override
    public void onItemClicked(View v, Object obj) {

    }


//    public void sendMessage(String title, String message) {
//        Log.i(TAG, title + message);
//
//        if (TextUtils.isEmpty(title)) {
//            getViewState().showToast("Введите заголовок сообщения");
//            return;
//        } else if (TextUtils.isEmpty(message)) {
//            getViewState().showToast("Введите текст сообщения");
//            return;
//        }
//
//        MessageRequest messageRequest = new MessageRequest(title, message);
//        Call<MessageResponse> call = mNetworkService.sendMessage(messageRequest);
//        call.enqueue(new Callback<MessageResponse>() {
//            @Override
//            public void onResponse(
//                    @NonNull Call<MessageResponse> call,
//                    @NonNull Response<MessageResponse> response) {
//
//
//                MessageResponse messageResponse = response.body();
//                int code = messageResponse.getCode();
//                boolean isError = messageResponse.isError();
//
//                if (isError && code == 409) {
//                    String errMsg = messageRequest.getMessage();
//                    getViewState().showError(errMsg);
//                }
//                if (!isError && code == 200) {
//                    getViewState().messageSentSuccessfully();
//                }
//
//
//            }
//
//            @Override
//            public void onFailure(@NonNull Call<MessageResponse> call, @NonNull Throwable t) {
//                getViewState().showError(t.getLocalizedMessage());
//            }
//        });
//    }
//
//    //RecyclerView Callback
//    @Override
//    public void onItemClicked(int v, Object obj) {
//
//    }
}
