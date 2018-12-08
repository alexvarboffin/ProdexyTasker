package com.walhalla.prodexytasker.ui.fragment.tab_container;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.arellomobile.mvp.presenter.InjectPresenter;
import com.walhalla.beans.CommentsBlockResponse;
import com.walhalla.prodexytasker.R;
import com.walhalla.prodexytasker.presentation.presenter.CommentsBlockPresenter;
import com.walhalla.prodexytasker.presentation.view.CommentsBlockView;
import com.walhalla.prodexytasker.ui.EmptyRecyclerView;
import com.walhalla.prodexytasker.ui.adapter.CommentsAdapter;
import com.walhalla.prodexytasker.ui.adapter.PaddingDecore;
import com.walhalla.prodexytasker.ui.fragment.base.BaseFragment;

import java.util.List;

import butterknife.BindView;

public class CommentsBlockFragment extends BaseFragment
        implements CommentsBlockView {

    public static CommentsBlockFragment newInstance(int id) {
        return new CommentsBlockFragment();
    }

    @InjectPresenter
    CommentsBlockPresenter messagesPresenter;

    @BindView(R.id.recyclerView)
    EmptyRecyclerView mRecyclerView;

    @BindView(R.id.swipeRefreshLayout)
    SwipeRefreshLayout swipeRefreshLayout;


    private CommentsAdapter messageAdapter;

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

//    private OnFragmentInteractionListener mListener;

    public CommentsBlockFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

//        mCallback.enableToolBarScrolling();
//        mCallback.setEnableButtomLayout(false);

        if (messageAdapter == null) {
            messageAdapter = new CommentsAdapter(getContext());
            messageAdapter.setChildItemClickListener(messagesPresenter);
        }
        return inflater.inflate(R.layout.fragment_comments, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        // use this if you want the RecyclerView to look like mObjects grid view
        //mRecyclerView.setLayoutManager(new GridLayoutManager(this, 2));

        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.addItemDecoration(new PaddingDecore(22, 1));
        mRecyclerView.setAdapter(messageAdapter);

        mRecyclerView.setEmptyView(R.layout.item_empty_data, R.string.app_name);

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                messagesPresenter.loadFeed();
            }
        });
    }

    @Override
    public void hideLoading() {
        swipeRefreshLayout.setRefreshing(false);
    }

    @Override
    public void showCommentsBlock(List<CommentsBlockResponse> list) {
        messageAdapter.swap(list);
    }


    @Override
    public void handleException(String e) {
        Toast.makeText(getContext(), e, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showMessage(String msg) {
        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
    }


//    ..R.id.new_message_btn
//    private void showNewMessageDialog() {
//        // DialogFragment.show() will take care of adding the fragment
//        // in mObjects transaction.  We also want to remove any currently showing
//        // dialog, so make our own transaction and take care of that here.
//        FragmentTransaction ft = getFragmentManager().beginTransaction();
//        Fragment prev = getFragmentManager().findFragmentByTag("n_dialog");
//        if (prev != null) {
//            ft.remove(prev);
//        }
//        ft.addToBackStack(null);
//
//        // Create and show the dialog.
//        SendMessageDialog fragment = SendMessageDialog.newInstance();
//        fragment.setTargetFragment(this, REQUEST_SEND_MESSAGE_DIALOG);
//        fragment.show(ft, "n_dialog");
//    }
//
//    @Override
//    public void onActivityResult(int requestCode, int resultCode, Intent data) {
//        super.onActivityResult(requestCode, resultCode, data);
//        if (resultCode == Activity.RESULT_OK) {
//            switch (requestCode) {
//                case REQUEST_SEND_MESSAGE_DIALOG:
//                    String title = data.getStringExtra(SendMessageDialog.TAG_MESSAGE_TITLE);
//                    String message = data.getStringExtra(SendMessageDialog.TAG_MESSAGE_TEXT);
//                    messagesPresenter.sendMessage(title, message);
//                    break;
//            }
//        }
//    }
//
//    public void onButtonPressed(Uri uri) {
//        if (mListener != null) {
//            mListener.onFragmentInteraction(uri);
//        }
//    }
//
//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
////        if (context instanceof OnTestingDetailsFragmentCallBack) {
////            mListener = (OnTestingDetailsFragmentCallBack) context;
////        } else {
////            throw new RuntimeException(context.toString()
////                    + " must implement OnTestingDetailsFragmentCallBack");
////        }
//    }
//
//    @Override
//    public void onDetach() {
//        super.onDetach();
//        mListener = null;
//    }
//
//    @Override
//    protected void initInstances() {
//
//    }
//
//    @Override
//    public void showToast(String msg) {
//        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    public void showError(String errMsg) {
//        Toast.makeText(getContext(), errMsg, Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    public void messageSentSuccessfully() {
//        Toast.makeText(getContext(), "Сообщение успешно отправлено!", Toast.LENGTH_SHORT).show();
//    }
//
//    @Override
//    public void updateFeedList(List<Message> data) {
//        ArrayList<Object> obj = new ArrayList<>();
//        obj.addAll(data);
//
//        Message mm = new Message();
//        mm.setIsRead(true);
//        mm.setTitle("000"+new Random().nextInt());
//        mm.setMsgId(new Random().nextInt());
//        obj.add(0, mm);
//
//        //adapterSavedState = data;
//        messageAdapter.onRestoreInstanceState(obj);
//    }
//
//    @Override
//    public void hideLoading() {
//        swipeRefreshLayout.setRefreshing(false);
//    }
//
//    /**
//     * This interface must be implemented by activities that contain this
//     * fragment to allow an interaction in this fragment to be communicated
//     * to the activity and potentially other fragments contained in that
//     * activity.
//     * <p>
//     * See the Android Training lesson <mObjects href=
//     * "http://developer.android.com/training/basics/fragments/communicating.html"
//     * >Communicating with Other Fragments</mObjects> for more information.
//     */
//    public interface OnFragmentInteractionListener {
//        // TODO: Update argument type and name
//        void onFragmentInteraction(Uri uri);
//    }

}
