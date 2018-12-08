
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Datum implements Serializable{
    @Override
    public String toString() {
        return "Datum{" +
                "id=" + id +
                ", fullKey='" + fullKey + '\'' +
                ", summary=" + summary +
                ", floor=" + floor +
                ", room=" + room +
                ", description=" + description +
                ", created='" + created + '\'' +
                ", resolutionDate=" + resolutionDate +
                ", dueDate=" + dueDate +
                ", startDate=" + startDate +
                ", channelId=" + channelId +
                ", channelName=" + channelName +
                ", issueChannelIcon=" + issueChannelIcon +
                ", priorityId=" + priorityId +
                ", priorityName=" + priorityName +
                ", priorityColor=" + priorityColor +
                ", fullStatusName=" + fullStatusName +
                ", issueStateId=" + issueStateId +
                ", issueTypeId=" + issueTypeId +
                ", issueTypeName=" + issueTypeName +
                ", assignedUsers=" + assignedUsers +
                ", inspectorId=" + inspectorId +
                ", inspectorName='" + inspectorName + '\'' +
                ", inspectorEMail=" + inspectorEMail +
                ", taskSetterId=" + taskSetterId +
                ", taskSetterName='" + taskSetterName + '\'' +
                ", taskSetterEMail='" + taskSetterEMail + '\'' +
                ", reporterId=" + reporterId +
                ", reporterName='" + reporterName + '\'' +
                ", reporterEMail='" + reporterEMail + '\'' +
                ", projectId=" + projectId +
                ", projectFolderId=" + projectFolderId +
                ", projectName=" + projectName +
                ", projectFolderName=" + projectFolderName +
                ", issueStateReason=" + issueStateReason +
                ", workspaceName=" + workspaceName +
                ", protocolId=" + protocolId +
                ", protocolShortDescription=" + protocolShortDescription +
                ", protocolSignDate=" + protocolSignDate +
                ", protocolName=" + protocolName +
                ", protocolCreated=" + protocolCreated +
                ", protocolIdentifier=" + protocolIdentifier +
                ", accepted=" + accepted +
                ", protocolIdAccepted=" + protocolIdAccepted +
                ", protocolIdentifierAccepted=" + protocolIdentifierAccepted +
                ", protocolSignDateAccepted=" + protocolSignDateAccepted +
                ", areaName=" + areaName +
                ", scheduledMinutes=" + scheduledMinutes +
                ", slaTimeScheduledMinutes=" + slaTimeScheduledMinutes +
                ", workLogMinutesTotal=" + workLogMinutesTotal +
                ", modified='" + modified + '\'' +
                ", mileStoneId=" + mileStoneId +
                ", mileStoneText=" + mileStoneText +
                ", stateReports=" + stateReports +
                ", completed=" + completed +
                ", inProcess=" + inProcess +
                ", paused=" + paused +
                ", parentId=" + parentId +
                ", hasChilds=" + hasChilds +
                ", childsCount=" + childsCount +
                ", firstLevelChildsCount=" + firstLevelChildsCount +
                ", notFitFilter=" + notFitFilter +
                ", dueDateStatus=" + dueDateStatus +
                ", slaStatusTitle=" + slaStatusTitle +
                ", minStartDateChildIssue=" + minStartDateChildIssue +
                ", minStartDateParentIssue=" + minStartDateParentIssue +
                ", maxDueDateChildIssue=" + maxDueDateChildIssue +
                ", maxDueDateParentIssue=" + maxDueDateParentIssue +
                ", childScheduledMinutes=" + childScheduledMinutes +
                ", fieldValues=" + fieldValues +
                '}';
    }

    @SerializedName("Id")
    @Expose
    private int id;
    @SerializedName("FullKey")
    @Expose
    private String fullKey;
    @SerializedName("Summary")
    @Expose
    private Object summary;
    @SerializedName("Floor")
    @Expose
    private Object floor;
    @SerializedName("Room")
    @Expose
    private Object room;
    @SerializedName("Description")
    @Expose
    private Object description;
    @SerializedName("Created")
    @Expose
    private String created;
    @SerializedName("ResolutionDate")
    @Expose
    private Object resolutionDate;
    @SerializedName("DueDate")
    @Expose
    private Object dueDate;
    @SerializedName("StartDate")
    @Expose
    private Object startDate;
    @SerializedName("ChannelId")
    @Expose
    private Object channelId;
    @SerializedName("ChannelName")
    @Expose
    private Object channelName;
    @SerializedName("IssueChannelIcon")
    @Expose
    private Object issueChannelIcon;
    @SerializedName("PriorityId")
    @Expose
    private Object priorityId;
    @SerializedName("PriorityName")
    @Expose
    private Object priorityName;
    @SerializedName("PriorityColor")
    @Expose
    private Object priorityColor;
    @SerializedName("FullStatusName")
    @Expose
    private Object fullStatusName;
    @SerializedName("IssueStateId")
    @Expose
    private Object issueStateId;
    @SerializedName("IssueTypeId")
    @Expose
    private Object issueTypeId;
    @SerializedName("IssueTypeName")
    @Expose
    private Object issueTypeName;
    @SerializedName("AssignedUsers")
    @Expose
    private Object assignedUsers;
    @SerializedName("InspectorId")
    @Expose
    private Object inspectorId;
    @SerializedName("InspectorName")
    @Expose
    private String inspectorName;
    @SerializedName("InspectorEMail")
    @Expose
    private Object inspectorEMail;
    @SerializedName("TaskSetterId")
    @Expose
    private int taskSetterId;
    @SerializedName("TaskSetterName")
    @Expose
    private String taskSetterName;
    @SerializedName("TaskSetterEMail")
    @Expose
    private String taskSetterEMail;
    @SerializedName("ReporterId")
    @Expose
    private int reporterId;
    @SerializedName("ReporterName")
    @Expose
    private String reporterName;
    @SerializedName("ReporterEMail")
    @Expose
    private String reporterEMail;
    @SerializedName("ProjectId")
    @Expose
    private Object projectId;
    @SerializedName("ProjectFolderId")
    @Expose
    private Object projectFolderId;
    @SerializedName("ProjectName")
    @Expose
    private Object projectName;
    @SerializedName("ProjectFolderName")
    @Expose
    private Object projectFolderName;
    @SerializedName("IssueStateReason")
    @Expose
    private Object issueStateReason;
    @SerializedName("WorkspaceName")
    @Expose
    private Object workspaceName;
    @SerializedName("ProtocolId")
    @Expose
    private int protocolId;
    @SerializedName("ProtocolShortDescription")
    @Expose
    private Object protocolShortDescription;
    @SerializedName("ProtocolSignDate")
    @Expose
    private Object protocolSignDate;
    @SerializedName("ProtocolName")
    @Expose
    private Object protocolName;
    @SerializedName("ProtocolCreated")
    @Expose
    private Object protocolCreated;
    @SerializedName("ProtocolIdentifier")
    @Expose
    private Object protocolIdentifier;
    @SerializedName("Accepted")
    @Expose
    private boolean accepted;
    @SerializedName("ProtocolIdAccepted")
    @Expose
    private Object protocolIdAccepted;
    @SerializedName("ProtocolIdentifierAccepted")
    @Expose
    private Object protocolIdentifierAccepted;
    @SerializedName("ProtocolSignDateAccepted")
    @Expose
    private Object protocolSignDateAccepted;
    @SerializedName("AreaName")
    @Expose
    private Object areaName;
    @SerializedName("ScheduledMinutes")
    @Expose
    private Object scheduledMinutes;
    @SerializedName("SlaTimeScheduledMinutes")
    @Expose
    private Object slaTimeScheduledMinutes;
    @SerializedName("WorkLogMinutesTotal")
    @Expose
    private int workLogMinutesTotal;
    @SerializedName("Modified")
    @Expose
    private String modified;
    @SerializedName("MileStoneId")
    @Expose
    private Object mileStoneId;
    @SerializedName("MileStoneText")
    @Expose
    private Object mileStoneText;
    @SerializedName("StateReports")
    @Expose
    private Object stateReports;
    @SerializedName("Completed")
    @Expose
    private boolean completed;
    @SerializedName("InProcess")
    @Expose
    private boolean inProcess;
    @SerializedName("Paused")
    @Expose
    private boolean paused;
    @SerializedName("ParentId")
    @Expose
    private Object parentId;
    @SerializedName("HasChilds")
    @Expose
    private boolean hasChilds;
    @SerializedName("ChildsCount")
    @Expose
    private int childsCount;
    @SerializedName("FirstLevelChildsCount")
    @Expose
    private int firstLevelChildsCount;
    @SerializedName("NotFitFilter")
    @Expose
    private boolean notFitFilter;
    @SerializedName("DueDateStatus")
    @Expose
    private int dueDateStatus;
    @SerializedName("SlaStatusTitle")
    @Expose
    private Object slaStatusTitle;
    @SerializedName("MinStartDateChildIssue")
    @Expose
    private Object minStartDateChildIssue;
    @SerializedName("MinStartDateParentIssue")
    @Expose
    private Object minStartDateParentIssue;
    @SerializedName("MaxDueDateChildIssue")
    @Expose
    private Object maxDueDateChildIssue;
    @SerializedName("MaxDueDateParentIssue")
    @Expose
    private Object maxDueDateParentIssue;
    @SerializedName("ChildScheduledMinutes")
    @Expose
    private int childScheduledMinutes;
    @SerializedName("FieldValues")
    @Expose
    private Object fieldValues;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Datum withId(int id) {
        this.id = id;
        return this;
    }

    public String getFullKey() {
        return fullKey;
    }

    public void setFullKey(String fullKey) {
        this.fullKey = fullKey;
    }

    public Datum withFullKey(String fullKey) {
        this.fullKey = fullKey;
        return this;
    }

    public Object getSummary() {
        return summary;
    }

    public void setSummary(Object summary) {
        this.summary = summary;
    }

    public Datum withSummary(Object summary) {
        this.summary = summary;
        return this;
    }

    public Object getFloor() {
        return floor;
    }

    public void setFloor(Object floor) {
        this.floor = floor;
    }

    public Datum withFloor(Object floor) {
        this.floor = floor;
        return this;
    }

    public Object getRoom() {
        return room;
    }

    public void setRoom(Object room) {
        this.room = room;
    }

    public Datum withRoom(Object room) {
        this.room = room;
        return this;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Datum withDescription(Object description) {
        this.description = description;
        return this;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Datum withCreated(String created) {
        this.created = created;
        return this;
    }

    public Object getResolutionDate() {
        return resolutionDate;
    }

    public void setResolutionDate(Object resolutionDate) {
        this.resolutionDate = resolutionDate;
    }

    public Datum withResolutionDate(Object resolutionDate) {
        this.resolutionDate = resolutionDate;
        return this;
    }

    public Object getDueDate() {
        return dueDate;
    }

    public void setDueDate(Object dueDate) {
        this.dueDate = dueDate;
    }

    public Datum withDueDate(Object dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    public Object getStartDate() {
        return startDate;
    }

    public void setStartDate(Object startDate) {
        this.startDate = startDate;
    }

    public Datum withStartDate(Object startDate) {
        this.startDate = startDate;
        return this;
    }

    public Object getChannelId() {
        return channelId;
    }

    public void setChannelId(Object channelId) {
        this.channelId = channelId;
    }

    public Datum withChannelId(Object channelId) {
        this.channelId = channelId;
        return this;
    }

    public Object getChannelName() {
        return channelName;
    }

    public void setChannelName(Object channelName) {
        this.channelName = channelName;
    }

    public Datum withChannelName(Object channelName) {
        this.channelName = channelName;
        return this;
    }

    public Object getIssueChannelIcon() {
        return issueChannelIcon;
    }

    public void setIssueChannelIcon(Object issueChannelIcon) {
        this.issueChannelIcon = issueChannelIcon;
    }

    public Datum withIssueChannelIcon(Object issueChannelIcon) {
        this.issueChannelIcon = issueChannelIcon;
        return this;
    }

    public Object getPriorityId() {
        return priorityId;
    }

    public void setPriorityId(Object priorityId) {
        this.priorityId = priorityId;
    }

    public Datum withPriorityId(Object priorityId) {
        this.priorityId = priorityId;
        return this;
    }

    public Object getPriorityName() {
        return priorityName;
    }

    public void setPriorityName(Object priorityName) {
        this.priorityName = priorityName;
    }

    public Datum withPriorityName(Object priorityName) {
        this.priorityName = priorityName;
        return this;
    }

    public Object getPriorityColor() {
        return priorityColor;
    }

    public void setPriorityColor(Object priorityColor) {
        this.priorityColor = priorityColor;
    }

    public Datum withPriorityColor(Object priorityColor) {
        this.priorityColor = priorityColor;
        return this;
    }

    public Object getFullStatusName() {
        return fullStatusName;
    }

    public void setFullStatusName(Object fullStatusName) {
        this.fullStatusName = fullStatusName;
    }

    public Datum withFullStatusName(Object fullStatusName) {
        this.fullStatusName = fullStatusName;
        return this;
    }

    public Object getIssueStateId() {
        return issueStateId;
    }

    public void setIssueStateId(Object issueStateId) {
        this.issueStateId = issueStateId;
    }

    public Datum withIssueStateId(Object issueStateId) {
        this.issueStateId = issueStateId;
        return this;
    }

    public Object getIssueTypeId() {
        return issueTypeId;
    }

    public void setIssueTypeId(Object issueTypeId) {
        this.issueTypeId = issueTypeId;
    }

    public Datum withIssueTypeId(Object issueTypeId) {
        this.issueTypeId = issueTypeId;
        return this;
    }

    public Object getIssueTypeName() {
        return issueTypeName;
    }

    public void setIssueTypeName(Object issueTypeName) {
        this.issueTypeName = issueTypeName;
    }

    public Datum withIssueTypeName(Object issueTypeName) {
        this.issueTypeName = issueTypeName;
        return this;
    }

    public Object getAssignedUsers() {
        return assignedUsers;
    }

    public void setAssignedUsers(Object assignedUsers) {
        this.assignedUsers = assignedUsers;
    }

    public Datum withAssignedUsers(Object assignedUsers) {
        this.assignedUsers = assignedUsers;
        return this;
    }

    public Object getInspectorId() {
        return inspectorId;
    }

    public void setInspectorId(Object inspectorId) {
        this.inspectorId = inspectorId;
    }

    public Datum withInspectorId(Object inspectorId) {
        this.inspectorId = inspectorId;
        return this;
    }

    public String getInspectorName() {
        return inspectorName;
    }

    public void setInspectorName(String inspectorName) {
        this.inspectorName = inspectorName;
    }

    public Datum withInspectorName(String inspectorName) {
        this.inspectorName = inspectorName;
        return this;
    }

    public Object getInspectorEMail() {
        return inspectorEMail;
    }

    public void setInspectorEMail(Object inspectorEMail) {
        this.inspectorEMail = inspectorEMail;
    }

    public Datum withInspectorEMail(Object inspectorEMail) {
        this.inspectorEMail = inspectorEMail;
        return this;
    }

    public int getTaskSetterId() {
        return taskSetterId;
    }

    public void setTaskSetterId(int taskSetterId) {
        this.taskSetterId = taskSetterId;
    }

    public Datum withTaskSetterId(int taskSetterId) {
        this.taskSetterId = taskSetterId;
        return this;
    }

    public String getTaskSetterName() {
        return taskSetterName;
    }

    public void setTaskSetterName(String taskSetterName) {
        this.taskSetterName = taskSetterName;
    }

    public Datum withTaskSetterName(String taskSetterName) {
        this.taskSetterName = taskSetterName;
        return this;
    }

    public String getTaskSetterEMail() {
        return taskSetterEMail;
    }

    public void setTaskSetterEMail(String taskSetterEMail) {
        this.taskSetterEMail = taskSetterEMail;
    }

    public Datum withTaskSetterEMail(String taskSetterEMail) {
        this.taskSetterEMail = taskSetterEMail;
        return this;
    }

    public int getReporterId() {
        return reporterId;
    }

    public void setReporterId(int reporterId) {
        this.reporterId = reporterId;
    }

    public Datum withReporterId(int reporterId) {
        this.reporterId = reporterId;
        return this;
    }

    public String getReporterName() {
        return reporterName;
    }

    public void setReporterName(String reporterName) {
        this.reporterName = reporterName;
    }

    public Datum withReporterName(String reporterName) {
        this.reporterName = reporterName;
        return this;
    }

    public String getReporterEMail() {
        return reporterEMail;
    }

    public void setReporterEMail(String reporterEMail) {
        this.reporterEMail = reporterEMail;
    }

    public Datum withReporterEMail(String reporterEMail) {
        this.reporterEMail = reporterEMail;
        return this;
    }

    public Object getProjectId() {
        return projectId;
    }

    public void setProjectId(Object projectId) {
        this.projectId = projectId;
    }

    public Datum withProjectId(Object projectId) {
        this.projectId = projectId;
        return this;
    }

    public Object getProjectFolderId() {
        return projectFolderId;
    }

    public void setProjectFolderId(Object projectFolderId) {
        this.projectFolderId = projectFolderId;
    }

    public Datum withProjectFolderId(Object projectFolderId) {
        this.projectFolderId = projectFolderId;
        return this;
    }

    public Object getProjectName() {
        return projectName;
    }

    public void setProjectName(Object projectName) {
        this.projectName = projectName;
    }

    public Datum withProjectName(Object projectName) {
        this.projectName = projectName;
        return this;
    }

    public Object getProjectFolderName() {
        return projectFolderName;
    }

    public void setProjectFolderName(Object projectFolderName) {
        this.projectFolderName = projectFolderName;
    }

    public Datum withProjectFolderName(Object projectFolderName) {
        this.projectFolderName = projectFolderName;
        return this;
    }

    public Object getIssueStateReason() {
        return issueStateReason;
    }

    public void setIssueStateReason(Object issueStateReason) {
        this.issueStateReason = issueStateReason;
    }

    public Datum withIssueStateReason(Object issueStateReason) {
        this.issueStateReason = issueStateReason;
        return this;
    }

    public Object getWorkspaceName() {
        return workspaceName;
    }

    public void setWorkspaceName(Object workspaceName) {
        this.workspaceName = workspaceName;
    }

    public Datum withWorkspaceName(Object workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }

    public int getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(int protocolId) {
        this.protocolId = protocolId;
    }

    public Datum withProtocolId(int protocolId) {
        this.protocolId = protocolId;
        return this;
    }

    public Object getProtocolShortDescription() {
        return protocolShortDescription;
    }

    public void setProtocolShortDescription(Object protocolShortDescription) {
        this.protocolShortDescription = protocolShortDescription;
    }

    public Datum withProtocolShortDescription(Object protocolShortDescription) {
        this.protocolShortDescription = protocolShortDescription;
        return this;
    }

    public Object getProtocolSignDate() {
        return protocolSignDate;
    }

    public void setProtocolSignDate(Object protocolSignDate) {
        this.protocolSignDate = protocolSignDate;
    }

    public Datum withProtocolSignDate(Object protocolSignDate) {
        this.protocolSignDate = protocolSignDate;
        return this;
    }

    public Object getProtocolName() {
        return protocolName;
    }

    public void setProtocolName(Object protocolName) {
        this.protocolName = protocolName;
    }

    public Datum withProtocolName(Object protocolName) {
        this.protocolName = protocolName;
        return this;
    }

    public Object getProtocolCreated() {
        return protocolCreated;
    }

    public void setProtocolCreated(Object protocolCreated) {
        this.protocolCreated = protocolCreated;
    }

    public Datum withProtocolCreated(Object protocolCreated) {
        this.protocolCreated = protocolCreated;
        return this;
    }

    public Object getProtocolIdentifier() {
        return protocolIdentifier;
    }

    public void setProtocolIdentifier(Object protocolIdentifier) {
        this.protocolIdentifier = protocolIdentifier;
    }

    public Datum withProtocolIdentifier(Object protocolIdentifier) {
        this.protocolIdentifier = protocolIdentifier;
        return this;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public Datum withAccepted(boolean accepted) {
        this.accepted = accepted;
        return this;
    }

    public Object getProtocolIdAccepted() {
        return protocolIdAccepted;
    }

    public void setProtocolIdAccepted(Object protocolIdAccepted) {
        this.protocolIdAccepted = protocolIdAccepted;
    }

    public Datum withProtocolIdAccepted(Object protocolIdAccepted) {
        this.protocolIdAccepted = protocolIdAccepted;
        return this;
    }

    public Object getProtocolIdentifierAccepted() {
        return protocolIdentifierAccepted;
    }

    public void setProtocolIdentifierAccepted(Object protocolIdentifierAccepted) {
        this.protocolIdentifierAccepted = protocolIdentifierAccepted;
    }

    public Datum withProtocolIdentifierAccepted(Object protocolIdentifierAccepted) {
        this.protocolIdentifierAccepted = protocolIdentifierAccepted;
        return this;
    }

    public Object getProtocolSignDateAccepted() {
        return protocolSignDateAccepted;
    }

    public void setProtocolSignDateAccepted(Object protocolSignDateAccepted) {
        this.protocolSignDateAccepted = protocolSignDateAccepted;
    }

    public Datum withProtocolSignDateAccepted(Object protocolSignDateAccepted) {
        this.protocolSignDateAccepted = protocolSignDateAccepted;
        return this;
    }

    public Object getAreaName() {
        return areaName;
    }

    public void setAreaName(Object areaName) {
        this.areaName = areaName;
    }

    public Datum withAreaName(Object areaName) {
        this.areaName = areaName;
        return this;
    }

    public Object getScheduledMinutes() {
        return scheduledMinutes;
    }

    public void setScheduledMinutes(Object scheduledMinutes) {
        this.scheduledMinutes = scheduledMinutes;
    }

    public Datum withScheduledMinutes(Object scheduledMinutes) {
        this.scheduledMinutes = scheduledMinutes;
        return this;
    }

    public Object getSlaTimeScheduledMinutes() {
        return slaTimeScheduledMinutes;
    }

    public void setSlaTimeScheduledMinutes(Object slaTimeScheduledMinutes) {
        this.slaTimeScheduledMinutes = slaTimeScheduledMinutes;
    }

    public Datum withSlaTimeScheduledMinutes(Object slaTimeScheduledMinutes) {
        this.slaTimeScheduledMinutes = slaTimeScheduledMinutes;
        return this;
    }

    public int getWorkLogMinutesTotal() {
        return workLogMinutesTotal;
    }

    public void setWorkLogMinutesTotal(int workLogMinutesTotal) {
        this.workLogMinutesTotal = workLogMinutesTotal;
    }

    public Datum withWorkLogMinutesTotal(int workLogMinutesTotal) {
        this.workLogMinutesTotal = workLogMinutesTotal;
        return this;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public Datum withModified(String modified) {
        this.modified = modified;
        return this;
    }

    public Object getMileStoneId() {
        return mileStoneId;
    }

    public void setMileStoneId(Object mileStoneId) {
        this.mileStoneId = mileStoneId;
    }

    public Datum withMileStoneId(Object mileStoneId) {
        this.mileStoneId = mileStoneId;
        return this;
    }

    public Object getMileStoneText() {
        return mileStoneText;
    }

    public void setMileStoneText(Object mileStoneText) {
        this.mileStoneText = mileStoneText;
    }

    public Datum withMileStoneText(Object mileStoneText) {
        this.mileStoneText = mileStoneText;
        return this;
    }

    public Object getStateReports() {
        return stateReports;
    }

    public void setStateReports(Object stateReports) {
        this.stateReports = stateReports;
    }

    public Datum withStateReports(Object stateReports) {
        this.stateReports = stateReports;
        return this;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Datum withCompleted(boolean completed) {
        this.completed = completed;
        return this;
    }

    public boolean isInProcess() {
        return inProcess;
    }

    public void setInProcess(boolean inProcess) {
        this.inProcess = inProcess;
    }

    public Datum withInProcess(boolean inProcess) {
        this.inProcess = inProcess;
        return this;
    }

    public boolean isPaused() {
        return paused;
    }

    public void setPaused(boolean paused) {
        this.paused = paused;
    }

    public Datum withPaused(boolean paused) {
        this.paused = paused;
        return this;
    }

    public Object getParentId() {
        return parentId;
    }

    public void setParentId(Object parentId) {
        this.parentId = parentId;
    }

    public Datum withParentId(Object parentId) {
        this.parentId = parentId;
        return this;
    }

    public boolean isHasChilds() {
        return hasChilds;
    }

    public void setHasChilds(boolean hasChilds) {
        this.hasChilds = hasChilds;
    }

    public Datum withHasChilds(boolean hasChilds) {
        this.hasChilds = hasChilds;
        return this;
    }

    public int getChildsCount() {
        return childsCount;
    }

    public void setChildsCount(int childsCount) {
        this.childsCount = childsCount;
    }

    public Datum withChildsCount(int childsCount) {
        this.childsCount = childsCount;
        return this;
    }

    public int getFirstLevelChildsCount() {
        return firstLevelChildsCount;
    }

    public void setFirstLevelChildsCount(int firstLevelChildsCount) {
        this.firstLevelChildsCount = firstLevelChildsCount;
    }

    public Datum withFirstLevelChildsCount(int firstLevelChildsCount) {
        this.firstLevelChildsCount = firstLevelChildsCount;
        return this;
    }

    public boolean isNotFitFilter() {
        return notFitFilter;
    }

    public void setNotFitFilter(boolean notFitFilter) {
        this.notFitFilter = notFitFilter;
    }

    public Datum withNotFitFilter(boolean notFitFilter) {
        this.notFitFilter = notFitFilter;
        return this;
    }

    public int getDueDateStatus() {
        return dueDateStatus;
    }

    public void setDueDateStatus(int dueDateStatus) {
        this.dueDateStatus = dueDateStatus;
    }

    public Datum withDueDateStatus(int dueDateStatus) {
        this.dueDateStatus = dueDateStatus;
        return this;
    }

    public Object getSlaStatusTitle() {
        return slaStatusTitle;
    }

    public void setSlaStatusTitle(Object slaStatusTitle) {
        this.slaStatusTitle = slaStatusTitle;
    }

    public Datum withSlaStatusTitle(Object slaStatusTitle) {
        this.slaStatusTitle = slaStatusTitle;
        return this;
    }

    public Object getMinStartDateChildIssue() {
        return minStartDateChildIssue;
    }

    public void setMinStartDateChildIssue(Object minStartDateChildIssue) {
        this.minStartDateChildIssue = minStartDateChildIssue;
    }

    public Datum withMinStartDateChildIssue(Object minStartDateChildIssue) {
        this.minStartDateChildIssue = minStartDateChildIssue;
        return this;
    }

    public Object getMinStartDateParentIssue() {
        return minStartDateParentIssue;
    }

    public void setMinStartDateParentIssue(Object minStartDateParentIssue) {
        this.minStartDateParentIssue = minStartDateParentIssue;
    }

    public Datum withMinStartDateParentIssue(Object minStartDateParentIssue) {
        this.minStartDateParentIssue = minStartDateParentIssue;
        return this;
    }

    public Object getMaxDueDateChildIssue() {
        return maxDueDateChildIssue;
    }

    public void setMaxDueDateChildIssue(Object maxDueDateChildIssue) {
        this.maxDueDateChildIssue = maxDueDateChildIssue;
    }

    public Datum withMaxDueDateChildIssue(Object maxDueDateChildIssue) {
        this.maxDueDateChildIssue = maxDueDateChildIssue;
        return this;
    }

    public Object getMaxDueDateParentIssue() {
        return maxDueDateParentIssue;
    }

    public void setMaxDueDateParentIssue(Object maxDueDateParentIssue) {
        this.maxDueDateParentIssue = maxDueDateParentIssue;
    }

    public Datum withMaxDueDateParentIssue(Object maxDueDateParentIssue) {
        this.maxDueDateParentIssue = maxDueDateParentIssue;
        return this;
    }

    public int getChildScheduledMinutes() {
        return childScheduledMinutes;
    }

    public void setChildScheduledMinutes(int childScheduledMinutes) {
        this.childScheduledMinutes = childScheduledMinutes;
    }

    public Datum withChildScheduledMinutes(int childScheduledMinutes) {
        this.childScheduledMinutes = childScheduledMinutes;
        return this;
    }

    public Object getFieldValues() {
        return fieldValues;
    }

    public void setFieldValues(Object fieldValues) {
        this.fieldValues = fieldValues;
    }

    public Datum withFieldValues(Object fieldValues) {
        this.fieldValues = fieldValues;
        return this;
    }

}
