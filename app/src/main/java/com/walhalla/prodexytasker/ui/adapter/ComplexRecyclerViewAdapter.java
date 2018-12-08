package com.walhalla.prodexytasker.ui.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.walhalla.beans.Datum;
import com.walhalla.prodexytasker.R;
import com.walhalla.prodexytasker.ui.activity.APIError;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ComplexRecyclerViewAdapter
        extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE_NULL = R.layout.rv_datum_item_small;
    private static final int TYPE_DATUM = R.layout.rv_datum_item_layout, ERROR = 1;


    private ChildItemClickListener childItemClickListener;
    // The items to display in your RecyclerView
    private List<Object> items; //Datum

    // Provide mObjects suitable constructor (depends on the kind of dataset)
    public ComplexRecyclerViewAdapter(List<Object> objects) {//Datum
        if (objects == null) {
            objects = new ArrayList<>();
        }
        this.items = objects;
    }

    public ComplexRecyclerViewAdapter() {
        this.items = new ArrayList<>();
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
        if (items.get(position) instanceof Datum) {
            return TYPE_DATUM;
        } else if (items.get(position) instanceof APIError) {
            return ERROR;
        } else {
            return TYPE_NULL;
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {

        RecyclerView.ViewHolder viewHolder;
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());

        switch (viewType) {
            case TYPE_DATUM:
                View v1 = inflater.inflate(R.layout.rv_datum_item_small, viewGroup, false);
                viewHolder = new DatumViewHolder(v1, childItemClickListener);
                break;
//            case ERROR:
//                View v2 = inflater.inflate(R.layout.row_item_error, viewGroup, false);
//                viewHolder = new ViewHolder2(v2);
//                break;
            default:
                View v = inflater.inflate(android.R.layout.simple_list_item_1, viewGroup, false);
                viewHolder = new RecyclerViewSimpleTextViewHolder(v);
                break;
        }
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        switch (viewHolder.getItemViewType()) {
            case TYPE_DATUM:
                DatumViewHolder vh1 = (DatumViewHolder) viewHolder;
                configureDatumViewHolder(vh1, position);
                break;
//            case ERROR:
//                ViewHolder2 vh2 = (ViewHolder2) viewHolder;
//                configureViewHolder2(vh2, position);
//                break;
            default:
                RecyclerViewSimpleTextViewHolder vh = (RecyclerViewSimpleTextViewHolder) viewHolder;
                configureDefaultViewHolder(vh, position);
                break;
        }
    }


    //private void configureDefaultViewHolder(RecyclerViewSimpleTextViewHolder vh, int position) {
    //vh.getLabel().setText((CharSequence) items.get(position));
    //}

    private void configureDatumViewHolder(DatumViewHolder holder, int position) {
        Datum datum = (Datum) items.get(position);
        if (datum != null) {
//            holder.tvId.setText(""+datum.getId());
            holder.tvFullKey.setText("" + datum.getFullKey());
//            holder.tvSummary.setText(""+datum.getSummary());
//            holder.tvFloor.setText(""+datum.getFloor());
//            holder.tvRoom.setText(""+datum.getRoom());
//            holder.tvDescription.setText(""+datum.getDescription());
//            holder.tvCreated.setText(""+datum.getCreated());
//            holder.tvResolutionDate.setText(""+datum.getResolutionDate());
//            holder.tvDueDate.setText(""+datum.getDueDate());
//            holder.tvStartDate.setText(""+datum.getStartDate());
//            holder.tvChannelId.setText(""+datum.getChannelId());
//            holder.tvChannelName.setText(""+datum.getChannelName());
//            holder.tvIssueChannelIcon.setText(""+datum.getIssueChannelIcon());
//            holder.tvPriorityId.setText(""+datum.getPriorityId());
//            holder.tvPriorityName.setText(""+datum.getPriorityName());
//            holder.tvPriorityColor.setText(""+datum.getPriorityColor());
//            holder.tvFullStatusName.setText(""+datum.getFullStatusName());
//            holder.tvIssueStateId.setText(""+datum.getIssueStateId());
//            holder.tvIssueTypeId.setText(""+datum.getIssueTypeId());
//            holder.tvIssueTypeName.setText(""+datum.getIssueTypeName());
//            holder.tvAssignedUsers.setText(""+datum.getAssignedUsers());
//            holder.tvInspectorId.setText(""+datum.getInspectorId());
//            holder.tvInspectorName.setText(""+datum.getInspectorName());
//            holder.tvInspectorEMail.setText(""+datum.getInspectorEMail());
//            holder.tvTaskSetterId.setText(""+datum.getTaskSetterId());
//            holder.tvTaskSetterName.setText(""+datum.getTaskSetterName());
//            holder.tvTaskSetterEMail.setText(""+datum.getTaskSetterEMail());
//            holder.tvReporterId.setText(""+datum.getReporterId());
//            holder.tvReporterName.setText(""+datum.getReporterName());
//            holder.tvReporterEMail.setText(""+datum.getReporterEMail());
//            holder.tvProjectId.setText(""+datum.getProjectId());
//            holder.tvProjectFolderId.setText(""+datum.getProjectFolderId());
//            holder.tvProjectName.setText(""+datum.getProjectName());
//            holder.tvProjectFolderName.setText(""+datum.getProjectFolderName());
//            holder.tvIssueStateReason.setText(""+datum.getIssueStateReason());
//            holder.tvWorkspaceName.setText(""+datum.getWorkspaceName());
//            holder.tvProtocolId.setText(""+datum.getProtocolId());
//            holder.tvProtocolShortDescription.setText(""+datum.getProtocolShortDescription());
//            holder.tvProtocolSignDate.setText(""+datum.getProtocolSignDate());
//            holder.tvProtocolName.setText(""+datum.getProtocolName());
//            holder.tvProtocolCreated.setText(""+datum.getProtocolCreated());
//            holder.tvProtocolIdentifier.setText(""+datum.getProtocolIdentifier());
//            holder.tvAccepted.setText(""+datum.isAccepted());
//            holder.tvProtocolIdAccepted.setText(""+datum.getProtocolIdAccepted());
//            holder.tvProtocolIdentifierAccepted.setText(""+datum.getProtocolIdentifierAccepted());
//            holder.tvProtocolSignDateAccepted.setText(""+datum.getProtocolSignDateAccepted());
//            holder.tvAreaName.setText(""+datum.getAreaName());
//            holder.tvScheduledMinutes.setText(""+datum.getScheduledMinutes());
//            holder.tvSlaTimeScheduledMinutes.setText(""+datum.getSlaTimeScheduledMinutes());
//            holder.tvWorkLogMinutesTotal.setText(""+datum.getWorkLogMinutesTotal());
//            holder.tvModified.setText(""+datum.getModified());
//            holder.tvMileStoneId.setText(""+datum.getMileStoneId());
//            holder.tvMileStoneText.setText(""+datum.getMileStoneText());
//            holder.tvStateReports.setText(""+datum.getStateReports());
//            holder.tvCompleted.setText(""+datum.isCompleted());
//            holder.tvInProcess.setText(""+datum.isInProcess());
//            holder.tvPaused.setText(""+datum.isPaused());
//            holder.tvParentId.setText(""+datum.getParentId());
//            holder.tvHasChilds.setText(""+datum.isHasChilds());
//            holder.tvChildsCount.setText(""+datum.getChildsCount());
//            holder.tvFirstLevelChildsCount.setText(""+datum.getFirstLevelChildsCount());
//            holder.tvNotFitFilter.setText(""+datum.isNotFitFilter());
//            holder.tvDueDateStatus.setText(""+datum.getDueDateStatus());
//            holder.tvSlaStatusTitle.setText(""+datum.getSlaStatusTitle());
//            holder.tvMinStartDateChildIssue.setText(""+datum.getMinStartDateChildIssue());
//            holder.tvMinStartDateParentIssue.setText(""+datum.getMinStartDateParentIssue());
//            holder.tvMaxDueDateChildIssue.setText(""+datum.getMaxDueDateChildIssue());
//            holder.tvMaxDueDateParentIssue.setText(""+datum.getMaxDueDateParentIssue());
//            holder.tvChildScheduledMinutes.setText(""+datum.getChildScheduledMinutes());
//            holder.tvFieldValues.setText(""+datum.getFieldValues());
        }
    }

    public void swap(List<Object> data) {
        this.items.clear();
        this.items.addAll(data);
        this.notifyDataSetChanged();
    }

    /*
        private void configureViewHolder2(ViewHolder2 vh2, int positon) {
            //vh2.getImageView().setImageResource(R.drawable.sample_golden_gate);
            APIError error = (APIError) items.get(positon);
            if (error != null) {
                vh2.error_msg.setText(error.getErrorMsg());
            }
        }
    */
//========================================================================================
    class DatumViewHolder extends RecyclerView.ViewHolder
            implements View.OnClickListener {

        private final ChildItemClickListener mOnClickListener;


        //        @BindView(R.id.tv_id) TextView tvId;
        @BindView(R.id.tv_fullKey)
        TextView tvFullKey;
//        @BindView(R.id.tv_summary) TextView tvSummary;
//        @BindView(R.id.tv_floor) TextView tvFloor;
//        @BindView(R.id.tv_room) TextView tvRoom;
//        @BindView(R.id.tv_description) TextView tvDescription;
//        @BindView(R.id.tv_created) TextView tvCreated;
//        @BindView(R.id.tv_resolutionDate) TextView tvResolutionDate;
//        @BindView(R.id.tv_dueDate) TextView tvDueDate;
//        @BindView(R.id.tv_startDate) TextView tvStartDate;
//        @BindView(R.id.tv_channelId) TextView tvChannelId;
//        @BindView(R.id.tv_channelName) TextView tvChannelName;
//        @BindView(R.id.tv_issueChannelIcon) TextView tvIssueChannelIcon;
//        @BindView(R.id.tv_priorityId) TextView tvPriorityId;
//        @BindView(R.id.tv_priorityName) TextView tvPriorityName;
//        @BindView(R.id.tv_priorityColor) TextView tvPriorityColor;
//        @BindView(R.id.tv_fullStatusName) TextView tvFullStatusName;
//        @BindView(R.id.tv_issueStateId) TextView tvIssueStateId;
//        @BindView(R.id.tv_issueTypeId) TextView tvIssueTypeId;
//        @BindView(R.id.tv_issueTypeName) TextView tvIssueTypeName;
//        @BindView(R.id.tv_assignedUsers) TextView tvAssignedUsers;
//        @BindView(R.id.tv_inspectorId) TextView tvInspectorId;
//        @BindView(R.id.tv_inspectorName) TextView tvInspectorName;
//        @BindView(R.id.tv_inspectorEMail) TextView tvInspectorEMail;
//        @BindView(R.id.tv_taskSetterId) TextView tvTaskSetterId;
//        @BindView(R.id.tv_taskSetterName) TextView tvTaskSetterName;
//        @BindView(R.id.tv_taskSetterEMail) TextView tvTaskSetterEMail;
//        @BindView(R.id.tv_reporterId) TextView tvReporterId;
//        @BindView(R.id.tv_reporterName) TextView tvReporterName;
//        @BindView(R.id.tv_reporterEMail) TextView tvReporterEMail;
//        @BindView(R.id.tv_projectId) TextView tvProjectId;
//        @BindView(R.id.tv_projectFolderId) TextView tvProjectFolderId;
//        @BindView(R.id.tv_projectName) TextView tvProjectName;
//        @BindView(R.id.tv_projectFolderName) TextView tvProjectFolderName;
//        @BindView(R.id.tv_issueStateReason) TextView tvIssueStateReason;
//        @BindView(R.id.tv_workspaceName) TextView tvWorkspaceName;
//        @BindView(R.id.tv_protocolId) TextView tvProtocolId;
//        @BindView(R.id.tv_protocolShortDescription) TextView tvProtocolShortDescription;
//        @BindView(R.id.tv_protocolSignDate) TextView tvProtocolSignDate;
//        @BindView(R.id.tv_protocolName) TextView tvProtocolName;
//        @BindView(R.id.tv_protocolCreated) TextView tvProtocolCreated;
//        @BindView(R.id.tv_protocolIdentifier) TextView tvProtocolIdentifier;
//        @BindView(R.id.tv_accepted) TextView tvAccepted;
//        @BindView(R.id.tv_protocolIdAccepted) TextView tvProtocolIdAccepted;
//        @BindView(R.id.tv_protocolIdentifierAccepted) TextView tvProtocolIdentifierAccepted;
//        @BindView(R.id.tv_protocolSignDateAccepted) TextView tvProtocolSignDateAccepted;
//        @BindView(R.id.tv_areaName) TextView tvAreaName;
//        @BindView(R.id.tv_scheduledMinutes) TextView tvScheduledMinutes;
//        @BindView(R.id.tv_slaTimeScheduledMinutes) TextView tvSlaTimeScheduledMinutes;
//        @BindView(R.id.tv_workLogMinutesTotal) TextView tvWorkLogMinutesTotal;
//        @BindView(R.id.tv_modified) TextView tvModified;
//        @BindView(R.id.tv_mileStoneId) TextView tvMileStoneId;
//        @BindView(R.id.tv_mileStoneText) TextView tvMileStoneText;
//        @BindView(R.id.tv_stateReports) TextView tvStateReports;
//        @BindView(R.id.tv_completed) TextView tvCompleted;
//        @BindView(R.id.tv_inProcess) TextView tvInProcess;
//        @BindView(R.id.tv_paused) TextView tvPaused;
//        @BindView(R.id.tv_parentId) TextView tvParentId;
//        @BindView(R.id.tv_hasChilds) TextView tvHasChilds;
//        @BindView(R.id.tv_childsCount) TextView tvChildsCount;
//        @BindView(R.id.tv_firstLevelChildsCount) TextView tvFirstLevelChildsCount;
//        @BindView(R.id.tv_notFitFilter) TextView tvNotFitFilter;
//        @BindView(R.id.tv_dueDateStatus) TextView tvDueDateStatus;
//        @BindView(R.id.tv_slaStatusTitle) TextView tvSlaStatusTitle;
//        @BindView(R.id.tv_minStartDateChildIssue) TextView tvMinStartDateChildIssue;
//        @BindView(R.id.tv_minStartDateParentIssue) TextView tvMinStartDateParentIssue;
//        @BindView(R.id.tv_maxDueDateChildIssue) TextView tvMaxDueDateChildIssue;
//        @BindView(R.id.tv_maxDueDateParentIssue) TextView tvMaxDueDateParentIssue;
//        @BindView(R.id.tv_childScheduledMinutes) TextView tvChildScheduledMinutes;
//        @BindView(R.id.tv_fieldValues) TextView tvFieldValues;

        DatumViewHolder(View v, ChildItemClickListener onclicklistener) {
            super(v);
            this.mOnClickListener = onclicklistener;
            ButterKnife.bind(this, v);
            v.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (getAdapterPosition() != RecyclerView.NO_POSITION) {
                Object obj = items.get(getAdapterPosition());
                if (obj instanceof Datum) {
                    Datum zz = (Datum) obj;
                    mOnClickListener.onClick(v, getAdapterPosition(), zz);
                }
            }
        }
    }

    private void configureDefaultViewHolder(RecyclerViewSimpleTextViewHolder vh, int position) {
        //vh.getLabel().setText((CharSequence) items.get(position));
    }

    class RecyclerViewSimpleTextViewHolder extends RecyclerView.ViewHolder {

        @BindView(android.R.id.text1)
        TextView text1;

        RecyclerViewSimpleTextViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }

    public interface ChildItemClickListener {
        void onClick(View v, int adapterPosition, Datum obj);
    }
}
