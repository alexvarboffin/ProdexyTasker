package com.walhalla.prodexytasker.ui.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;

import com.squareup.picasso.Picasso;
import com.walhalla.prodexytasker.CircleTransform;
import com.walhalla.prodexytasker.R;
import com.walhalla.prodexytasker.ui.adapter.item.Header;
import com.walhalla.prodexytasker.ui.adapter.item.Notice;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class NoticeAdapter
        extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private static final int ERROR = 1;
    private static final int TYPE_HEADER = R.layout.item_header_zz;
    private static final int TYPE_NOTICE = R.layout.item_notice;


    private ChildItemClickListener childItemClickListener;
    // The items to display in your RecyclerView
    private List<Object> items;

    // Provide mObjects suitable constructor (depends on the kind of dataset)
    public NoticeAdapter(List<Object> items) {
        this.items = items;
    }

    public void setChildItemClickListener(ChildItemClickListener listener) {
        childItemClickListener = listener;
    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return this.items.size();
    }

    //Returns the view type of the item at position for the purposes of view recycling.
    @Override
    public int getItemViewType(int position) {
        if (items.get(position) instanceof Notice) {
            return TYPE_NOTICE;
        } else if (items.get(position) instanceof Header) {
            return TYPE_HEADER;
        } else {
            return ERROR;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        RecyclerView.ViewHolder viewHolder;
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());

        switch (viewType) {
            case TYPE_NOTICE:
                View v1 = inflater.inflate(R.layout.item_notice, viewGroup, false);
                viewHolder = new NoticeViewHolder(v1, childItemClickListener);
                break;

            case TYPE_HEADER:
                View v2 = inflater.inflate(R.layout.item_header_zz, viewGroup, false);
                viewHolder = new HeaderViewHolder(v2);
                break;

            default:
                v2 = inflater.inflate(R.layout.item_header_zz, viewGroup, false);
                viewHolder = new HeaderViewHolder(v2);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        switch (viewHolder.getItemViewType()) {


            case TYPE_NOTICE:
                NoticeViewHolder vh1 = (NoticeViewHolder) viewHolder;
                configureNoticeViewHolder(vh1, position);
                break;

            case TYPE_HEADER:
                HeaderViewHolder vh2 = (HeaderViewHolder) viewHolder;
                configureViewHolder2(vh2, position);
                break;

            default:
                vh2 = (HeaderViewHolder) viewHolder;
                configureViewHolderErr(vh2, position);
                break;
        }
    }


    private void configureViewHolder2(HeaderViewHolder vh2, int positon) {

        Header header = (Header) items.get(positon);
        if (header != null) {
            vh2.text1.setText(header.getHeader());
        }
    }

    private void configureNoticeViewHolder(NoticeViewHolder holder, int position) {
        Notice notice = (Notice) items.get(position);
        if (notice != null) {


            int avatarSize = holder.mImageView.getContext().getResources()
                    .getDimensionPixelSize(R.dimen.comments_iv_user_pic_size);

            Picasso.with(holder.mImageView.getContext())
                    .load("https://www.gravatar.com/avatar/73f5fc5486eda0431e1da1ac1e767743?s=328&d=identicon&r=PG")
                    .placeholder(R.drawable.img_circle_placeholder)
                    .resize(avatarSize, avatarSize)
                    .centerCrop()
                    .transform(new CircleTransform())
                    .into(holder.mImageView);


            if (notice.isReadable()) {
                holder.submitButton.setVisibility(View.GONE);
            }
        }
    }

    private void configureViewHolderErr(HeaderViewHolder vh2, int position) {
        Object object = items.get(position);
        if (object != null) {
            vh2.text1.setText(object.toString());
        }
    }


    //========================================================================================
    class NoticeViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {

        private final ChildItemClickListener mOnClickListener;

        @BindView(R.id.submit_button)
        View submitButton;

        @BindView(R.id.overflow_menu)
        ImageView overflow_menu;


        @BindView(R.id.imageView)
        ImageView mImageView;

        NoticeViewHolder(View v, ChildItemClickListener onclicklistener) {
            super(v);
            this.mOnClickListener = onclicklistener;
            ButterKnife.bind(this, v);
            this.submitButton.setOnClickListener(this);
            this.overflow_menu.setOnClickListener(this);
            v.setOnClickListener(this);


//            int avatarSize = v.getContext().getResources().getDimensionPixelSize(R.dimen.profile_image_size);
//
//            this.navHeader = mNavigationView.getHeaderView(0);
//            ImageView ivUserProfilePhoto = navHeader.findViewById(R.id.imageView);
//            Picasso.with(this)
//                    .load(R.drawable.default_profile)
//                    .placeholder(R.drawable.img_circle_placeholder)
//                    .resize(avatarSize, avatarSize)
//                    .centerCrop()
//                    .transform(new CircleTransform())
//                    .into(ivUserProfilePhoto);
        }

        @Override
        public void onClick(View v) {
            if (getAdapterPosition() != RecyclerView.NO_POSITION) {
                Object obj = items.get(getAdapterPosition());
                if (obj instanceof Notice) {
                    Notice zz = (Notice) obj;

                    switch (v.getId()) {

                        case R.id.submit_button:
                            mOnClickListener.submit(zz.getId());
                            break;

                        case R.id.overflow_menu:
                            showPopupMenu(v, zz);
                            break;

                        default:
                            mOnClickListener.onClick(v, getAdapterPosition(), zz);
                            break;
                    }

                }
            }
        }
    }

    private void showPopupMenu(View v, Notice notice) {
        // inflate menu
        PopupMenu popup = new PopupMenu(v.getContext(), v);
        MenuInflater inflater = popup.getMenuInflater();
        inflater.inflate(R.menu.menu_notice, popup.getMenu());
        popup.setOnMenuItemClickListener(new MyMenuItemClickListener(notice));
        popup.show();
    }

    /**
     * Click listener for popup menu items
     */
    private class MyMenuItemClickListener implements PopupMenu.OnMenuItemClickListener {

        private final Notice category;

        MyMenuItemClickListener(Notice category) {
            this.category = category;
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            switch (menuItem.getItemId()) {
                case R.id.action_open_link:
//                    Toast.makeText(mContext, "Add to favourite", Toast.LENGTH_SHORT).show();
//                    childItemClickListener.onItemClicked(menuItem.getItemId(), category);
                    return true;
                case R.id.action_share_link:
//                    Toast.makeText(mContext, "Play next", Toast.LENGTH_SHORT).show();
//                    childItemClickListener.onItemClicked(menuItem.getItemId(), category);
                    return true;
                default:
            }
            return false;
        }
    }


    class HeaderViewHolder extends RecyclerView.ViewHolder {

        @BindView(android.R.id.text1)
        TextView text1;

        HeaderViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public interface ChildItemClickListener {
        void onClick(View v, int adapterPosition, Notice obj);

        void submit(int id);
    }
}
