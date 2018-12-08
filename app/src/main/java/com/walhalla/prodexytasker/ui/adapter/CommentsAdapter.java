package com.walhalla.prodexytasker.ui.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.walhalla.beans.CommentsBlockResponse;
import com.walhalla.prodexytasker.CircleTransform;
import com.walhalla.prodexytasker.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//Comments
//UserContacts
//GroupNames

public class CommentsAdapter extends RecyclerView.Adapter<CommentsAdapter.ViewHolder> {

    private final Context mContext;
    private List<CommentsBlockResponse> messageList;

    public static final int SENDER = 0;
    public static final int RECEIVER = 1;

    private Callback callback;
    private int avatarSize;

    public CommentsAdapter(Context context, List<CommentsBlockResponse> messages) {
        messageList = messages;
        mContext = context;
        avatarSize = mContext.getResources().getDimensionPixelSize(R.dimen.comments_iv_user_pic_size);
    }

    public CommentsAdapter(Context context) {
        this(context, new ArrayList<CommentsBlockResponse>());
    }

    @NonNull
    @Override
    public CommentsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        if (viewType == RECEIVER) {
            View v = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.chat_item_receiver, parent, false);
            return new ViewHolder((LinearLayout) v);
        } else {
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.chat_item_sender, parent, false);
            return new ViewHolder((LinearLayout) v);
        }
    }

    public void remove(int pos) {
        messageList.remove(pos);
        notifyItemRemoved(pos);
        notifyItemRangeChanged(pos, messageList.size());

    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {

        CommentsBlockResponse blockResponse = messageList.get(holder.getAdapterPosition());

        holder.mTextView.setText(blockResponse.getCommentText());
        holder.mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                remove(holder.getAdapterPosition());
            }
        });


        Picasso.with(mContext)
                .load("https://www.gravatar.com/avatar/73f5fc5486eda0431e1da1ac1e767743?s=328&d=identicon&r=PG")
                .placeholder(R.drawable.img_circle_placeholder)
                .resize(avatarSize, avatarSize)
                .centerCrop()
                .transform(new CircleTransform())
                .into(holder.userPic);
    }

    @Override
    public int getItemCount() {
        return messageList == null ? 0 : messageList.size();
    }

    @Override
    public int getItemViewType(int position) {
        CommentsBlockResponse message = messageList.get(position);

        if (message.getAuthor().getUserId() == 1) {
            return SENDER;
        } else {
            return RECEIVER;
        }

    }

    public void swap(@Nullable List<CommentsBlockResponse> list) {
        this.messageList.clear();
        if (list != null) {
            this.messageList.addAll(list);
        }
        this.notifyDataSetChanged();
    }

    public void setChildItemClickListener(Callback callback) {
        this.callback = callback;
    }


    //On item click event
    public interface Callback {
        //        void onItemClicked(View v, int position);
        void onItemClicked(View v, Object obj);
    }

    //==============================================================================================
    static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView mTextView;
        public ImageView userPic;
        private ViewGroup btn;


        public ViewHolder(LinearLayout v) {
            super(v);
            mTextView = v.findViewById(R.id.text);
            userPic = v.findViewById(R.id.imageView);
            btn = v.findViewById(R.id.submit_button);
        }
    }
}