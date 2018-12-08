
package com.walhalla.beans;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CommentsBlockResponse {

    @SerializedName("Id")
    @Expose
    private int id;
    @SerializedName("CommentText")
    @Expose
    private String commentText;
    @SerializedName("AdditionalText")
    @Expose
    private Object additionalText;
    @SerializedName("DateJobCreated")
    @Expose
    private Object dateJobCreated;
    @SerializedName("IssueId")
    @Expose
    private int issueId;
    @SerializedName("ParentId")
    @Expose
    private Object parentId;
    @SerializedName("WorkLogId")
    @Expose
    private Object workLogId;
    @SerializedName("Created")
    @Expose
    private String created;
    @SerializedName("Author")
    @Expose
    private Author___ author;
    @SerializedName("ToUser")
    @Expose
    private Object toUser;
    @SerializedName("CcUsers")
    @Expose
    private Object ccUsers;
    @SerializedName("Kind")
    @Expose
    private int kind;
    @SerializedName("DisplayDate")
    @Expose
    private String displayDate;
    @SerializedName("Comments")
    @Expose
    private List<Object> comments = new ArrayList<Object>();
    @SerializedName("Files")
    @Expose
    private Object files;
    @SerializedName("IsFinal")
    @Expose
    private boolean isFinal;
    @SerializedName("CompletionPercentage")
    @Expose
    private int completionPercentage;
    @SerializedName("ControlPoint")
    @Expose
    private Object controlPoint;
    @SerializedName("ProtocolId")
    @Expose
    private Object protocolId;
    @SerializedName("ProtocolIdentifier")
    @Expose
    private Object protocolIdentifier;
    @SerializedName("ProtocolSignDate")
    @Expose
    private Object protocolSignDate;
    @SerializedName("ControlPointStatus")
    @Expose
    private Object controlPointStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CommentsBlockResponse withId(int id) {
        this.id = id;
        return this;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public CommentsBlockResponse withCommentText(String commentText) {
        this.commentText = commentText;
        return this;
    }

    public Object getAdditionalText() {
        return additionalText;
    }

    public void setAdditionalText(Object additionalText) {
        this.additionalText = additionalText;
    }

    public CommentsBlockResponse withAdditionalText(Object additionalText) {
        this.additionalText = additionalText;
        return this;
    }

    public Object getDateJobCreated() {
        return dateJobCreated;
    }

    public void setDateJobCreated(Object dateJobCreated) {
        this.dateJobCreated = dateJobCreated;
    }

    public CommentsBlockResponse withDateJobCreated(Object dateJobCreated) {
        this.dateJobCreated = dateJobCreated;
        return this;
    }

    public int getIssueId() {
        return issueId;
    }

    public void setIssueId(int issueId) {
        this.issueId = issueId;
    }

    public CommentsBlockResponse withIssueId(int issueId) {
        this.issueId = issueId;
        return this;
    }

    public Object getParentId() {
        return parentId;
    }

    public void setParentId(Object parentId) {
        this.parentId = parentId;
    }

    public CommentsBlockResponse withParentId(Object parentId) {
        this.parentId = parentId;
        return this;
    }

    public Object getWorkLogId() {
        return workLogId;
    }

    public void setWorkLogId(Object workLogId) {
        this.workLogId = workLogId;
    }

    public CommentsBlockResponse withWorkLogId(Object workLogId) {
        this.workLogId = workLogId;
        return this;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public CommentsBlockResponse withCreated(String created) {
        this.created = created;
        return this;
    }

    public Author___ getAuthor() {
        return author;
    }

    public void setAuthor(Author___ author) {
        this.author = author;
    }

    public CommentsBlockResponse withAuthor(Author___ author) {
        this.author = author;
        return this;
    }

    public Object getToUser() {
        return toUser;
    }

    public void setToUser(Object toUser) {
        this.toUser = toUser;
    }

    public CommentsBlockResponse withToUser(Object toUser) {
        this.toUser = toUser;
        return this;
    }

    public Object getCcUsers() {
        return ccUsers;
    }

    public void setCcUsers(Object ccUsers) {
        this.ccUsers = ccUsers;
    }

    public CommentsBlockResponse withCcUsers(Object ccUsers) {
        this.ccUsers = ccUsers;
        return this;
    }

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public CommentsBlockResponse withKind(int kind) {
        this.kind = kind;
        return this;
    }

    public String getDisplayDate() {
        return displayDate;
    }

    public void setDisplayDate(String displayDate) {
        this.displayDate = displayDate;
    }

    public CommentsBlockResponse withDisplayDate(String displayDate) {
        this.displayDate = displayDate;
        return this;
    }

    public List<Object> getComments() {
        return comments;
    }

    public void setComments(List<Object> comments) {
        this.comments = comments;
    }

    public CommentsBlockResponse withComments(List<Object> comments) {
        this.comments = comments;
        return this;
    }

    public Object getFiles() {
        return files;
    }

    public void setFiles(Object files) {
        this.files = files;
    }

    public CommentsBlockResponse withFiles(Object files) {
        this.files = files;
        return this;
    }

    public boolean isIsFinal() {
        return isFinal;
    }

    public void setIsFinal(boolean isFinal) {
        this.isFinal = isFinal;
    }

    public CommentsBlockResponse withIsFinal(boolean isFinal) {
        this.isFinal = isFinal;
        return this;
    }

    public int getCompletionPercentage() {
        return completionPercentage;
    }

    public void setCompletionPercentage(int completionPercentage) {
        this.completionPercentage = completionPercentage;
    }

    public CommentsBlockResponse withCompletionPercentage(int completionPercentage) {
        this.completionPercentage = completionPercentage;
        return this;
    }

    public Object getControlPoint() {
        return controlPoint;
    }

    public void setControlPoint(Object controlPoint) {
        this.controlPoint = controlPoint;
    }

    public CommentsBlockResponse withControlPoint(Object controlPoint) {
        this.controlPoint = controlPoint;
        return this;
    }

    public Object getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Object protocolId) {
        this.protocolId = protocolId;
    }

    public CommentsBlockResponse withProtocolId(Object protocolId) {
        this.protocolId = protocolId;
        return this;
    }

    public Object getProtocolIdentifier() {
        return protocolIdentifier;
    }

    public void setProtocolIdentifier(Object protocolIdentifier) {
        this.protocolIdentifier = protocolIdentifier;
    }

    public CommentsBlockResponse withProtocolIdentifier(Object protocolIdentifier) {
        this.protocolIdentifier = protocolIdentifier;
        return this;
    }

    public Object getProtocolSignDate() {
        return protocolSignDate;
    }

    public void setProtocolSignDate(Object protocolSignDate) {
        this.protocolSignDate = protocolSignDate;
    }

    public CommentsBlockResponse withProtocolSignDate(Object protocolSignDate) {
        this.protocolSignDate = protocolSignDate;
        return this;
    }

    public Object getControlPointStatus() {
        return controlPointStatus;
    }

    public void setControlPointStatus(Object controlPointStatus) {
        this.controlPointStatus = controlPointStatus;
    }

    public CommentsBlockResponse withControlPointStatus(Object controlPointStatus) {
        this.controlPointStatus = controlPointStatus;
        return this;
    }

}
