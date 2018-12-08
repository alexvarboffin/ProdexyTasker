package com.walhalla.prodexytasker.ui.adapter;

//
//RV
//

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.walhalla.beans.IssueCardFilesResponse;
import com.walhalla.prodexytasker.R;

import java.util.ArrayList;
import java.util.List;

public class IssueCardFilesAdapter
        extends RecyclerView.Adapter<IssueCardFilesAdapter.ViewHolder> {

    private List<IssueCardFilesResponse> data;


    private ChildItemClickListener childItemClickListener;


    public void setChildItemClickListener(ChildItemClickListener listener) {
        this.childItemClickListener = listener;
    }

    public IssueCardFilesAdapter(List<IssueCardFilesResponse> data, @NonNull Context context) {
        this.data = data;
    }


    public IssueCardFilesAdapter() {
        this.data = new ArrayList<>();
    }

    public void swap(List<IssueCardFilesResponse> o) {
        if (o == null || o.size() == 0) {
            return;
        }
        if (data == null) {
            data = new ArrayList<>();
        }

        if (data.size() > 0) {
            data.clear();
        }
        data.addAll(o);
        notifyDataSetChanged();
    }

    //=============================================================================================
    final static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        // 1. Declare your Views here
        private TextView tvId;
        private TextView tvName;
        private TextView tvIsSystemFile;
        private TextView tvSystemFileInfo;
        private TextView tvVersion;
        private TextView tvVersioningAllowed;
        private TextView tvProviderId;
        private TextView tvAuthorUserName;
        private TextView tvAuthorUserId;
        private TextView tvCreationDate;
        private TextView tvSize;
        private TextView tvIsViewable;
        private TextView tvImageHeight;
        private TextView tvImageWidth;


        /**
         * childItemClickListener
         */
        private ChildItemClickListener childItemClickListener;


        private ViewHolder(View v, ChildItemClickListener presenter) {
            super(v);

            // 2. Define your Views here

            tvId = v.findViewById(R.id.tv_id);
            tvName = v.findViewById(R.id.tv_name);
            tvIsSystemFile = v.findViewById(R.id.tv_isSystemFile);
            tvSystemFileInfo = v.findViewById(R.id.tv_systemFileInfo);
            tvVersion = v.findViewById(R.id.tv_version);
            tvVersioningAllowed = v.findViewById(R.id.tv_versioningAllowed);
            tvProviderId = v.findViewById(R.id.tv_providerId);
            tvAuthorUserName = v.findViewById(R.id.tv_authorUserName);
            tvAuthorUserId = v.findViewById(R.id.tv_authorUserId);
            tvCreationDate = v.findViewById(R.id.tv_creationDate);
            tvSize = v.findViewById(R.id.tv_size);
            tvIsViewable = v.findViewById(R.id.tv_isViewable);
            tvImageHeight = v.findViewById(R.id.tv_imageHeight);
            tvImageWidth = v.findViewById(R.id.tv_imageWidth);
            v.setOnClickListener(this);
            this.childItemClickListener = presenter;
        }

        @Override
        public void onClick(View v) {
            if (childItemClickListener != null) {
                childItemClickListener.onClick(v, getAdapterPosition());//clicker...
            }

        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_issue_file, parent, false);

        return new ViewHolder(itemView, childItemClickListener);
    }

    public void setListener(ChildItemClickListener listener) {
        childItemClickListener = listener;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        IssueCardFilesResponse model = data.get(position);

        // 3. set the data to your Views here
        holder.tvId.setText("" + model.getId());
        holder.tvName.setText("" + model.getName());
        holder.tvIsSystemFile.setText("" + model.isIsSystemFile());
        holder.tvSystemFileInfo.setText("" + model.getSystemFileInfo());
        holder.tvVersion.setText("" + model.getVersion());
        holder.tvVersioningAllowed.setText("" + model.isVersioningAllowed());
        holder.tvProviderId.setText("" + model.getProviderId());
        holder.tvAuthorUserName.setText("" + model.getAuthorUserName());
        holder.tvAuthorUserId.setText("" + model.getAuthorUserId());
        holder.tvCreationDate.setText("" + model.getCreationDate());
        holder.tvSize.setText("" + model.getSize());
        holder.tvIsViewable.setText("" + model.isIsViewable());
        holder.tvImageHeight.setText("" + model.getImageHeight());
        holder.tvImageWidth.setText("" + model.getImageWidth());


    }

    @Override
    public int getItemCount() {
        return (data == null) ? 0 : data.size();
    }

    public interface ChildItemClickListener {
        void onClick(View v, int position);
    }
}