
package com.walhalla.beans;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NewComment {

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
    private Author____ author;
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
    private Object completionPercentage;
    @SerializedName("ControlPoint")
    @Expose
    private Object controlPoint;
    @SerializedName("ProtocolId")
    @Expose
    private Object protocolId;
    @SerializedName("ProtocolIdentifier")
    @Expose
    private Object protocolIdentifier;
    @SerializedName("ControlPointStatus")
    @Expose
    private Object controlPointStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NewComment withId(int id) {
        this.id = id;
        return this;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public NewComment withCommentText(String commentText) {
        this.commentText = commentText;
        return this;
    }

    public Object getAdditionalText() {
        return additionalText;
    }

    public void setAdditionalText(Object additionalText) {
        this.additionalText = additionalText;
    }

    public NewComment withAdditionalText(Object additionalText) {
        this.additionalText = additionalText;
        return this;
    }

    public Object getDateJobCreated() {
        return dateJobCreated;
    }

    public void setDateJobCreated(Object dateJobCreated) {
        this.dateJobCreated = dateJobCreated;
    }

    public NewComment withDateJobCreated(Object dateJobCreated) {
        this.dateJobCreated = dateJobCreated;
        return this;
    }

    public int getIssueId() {
        return issueId;
    }

    public void setIssueId(int issueId) {
        this.issueId = issueId;
    }

    public NewComment withIssueId(int issueId) {
        this.issueId = issueId;
        return this;
    }

    public Object getParentId() {
        return parentId;
    }

    public void setParentId(Object parentId) {
        this.parentId = parentId;
    }

    public NewComment withParentId(Object parentId) {
        this.parentId = parentId;
        return this;
    }

    public Object getWorkLogId() {
        return workLogId;
    }

    public void setWorkLogId(Object workLogId) {
        this.workLogId = workLogId;
    }

    public NewComment withWorkLogId(Object workLogId) {
        this.workLogId = workLogId;
        return this;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public NewComment withCreated(String created) {
        this.created = created;
        return this;
    }

    public Author____ getAuthor() {
        return author;
    }

    public void setAuthor(Author____ author) {
        this.author = author;
    }

    public NewComment withAuthor(Author____ author) {
        this.author = author;
        return this;
    }

    public Object getToUser() {
        return toUser;
    }

    public void setToUser(Object toUser) {
        this.toUser = toUser;
    }

    public NewComment withToUser(Object toUser) {
        this.toUser = toUser;
        return this;
    }

    public Object getCcUsers() {
        return ccUsers;
    }

    public void setCcUsers(Object ccUsers) {
        this.ccUsers = ccUsers;
    }

    public NewComment withCcUsers(Object ccUsers) {
        this.ccUsers = ccUsers;
        return this;
    }

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public NewComment withKind(int kind) {
        this.kind = kind;
        return this;
    }

    public String getDisplayDate() {
        return displayDate;
    }

    public void setDisplayDate(String displayDate) {
        this.displayDate = displayDate;
    }

    public NewComment withDisplayDate(String displayDate) {
        this.displayDate = displayDate;
        return this;
    }

    public List<Object> getComments() {
        return comments;
    }

    public void setComments(List<Object> comments) {
        this.comments = comments;
    }

    public NewComment withComments(List<Object> comments) {
        this.comments = comments;
        return this;
    }

    public Object getFiles() {
        return files;
    }

    public void setFiles(Object files) {
        this.files = files;
    }

    public NewComment withFiles(Object files) {
        this.files = files;
        return this;
    }

    public boolean isIsFinal() {
        return isFinal;
    }

    public void setIsFinal(boolean isFinal) {
        this.isFinal = isFinal;
    }

    public NewComment withIsFinal(boolean isFinal) {
        this.isFinal = isFinal;
        return this;
    }

    public Object getCompletionPercentage() {
        return completionPercentage;
    }

    public void setCompletionPercentage(Object completionPercentage) {
        this.completionPercentage = completionPercentage;
    }

    public NewComment withCompletionPercentage(Object completionPercentage) {
        this.completionPercentage = completionPercentage;
        return this;
    }

    public Object getControlPoint() {
        return controlPoint;
    }

    public void setControlPoint(Object controlPoint) {
        this.controlPoint = controlPoint;
    }

    public NewComment withControlPoint(Object controlPoint) {
        this.controlPoint = controlPoint;
        return this;
    }

    public Object getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Object protocolId) {
        this.protocolId = protocolId;
    }

    public NewComment withProtocolId(Object protocolId) {
        this.protocolId = protocolId;
        return this;
    }

    public Object getProtocolIdentifier() {
        return protocolIdentifier;
    }

    public void setProtocolIdentifier(Object protocolIdentifier) {
        this.protocolIdentifier = protocolIdentifier;
    }

    public NewComment withProtocolIdentifier(Object protocolIdentifier) {
        this.protocolIdentifier = protocolIdentifier;
        return this;
    }

    public Object getControlPointStatus() {
        return controlPointStatus;
    }

    public void setControlPointStatus(Object controlPointStatus) {
        this.controlPointStatus = controlPointStatus;
    }

    public NewComment withControlPointStatus(Object controlPointStatus) {
        this.controlPointStatus = controlPointStatus;
        return this;
    }

}
