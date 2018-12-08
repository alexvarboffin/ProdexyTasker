
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddCommentRequest {

    @SerializedName("CommentText")
    @Expose
    private String commentText;
    @SerializedName("IsFinal")
    @Expose
    private boolean isFinal;
    @SerializedName("Kind")
    @Expose
    private int kind;
    @SerializedName("IssueKey")
    @Expose
    private int issueKey;
    @SerializedName("HubClientId")
    @Expose
    private int hubClientId;
    @SerializedName("ParentId")
    @Expose
    private int parentId;

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public AddCommentRequest withCommentText(String commentText) {
        this.commentText = commentText;
        return this;
    }

    public boolean isIsFinal() {
        return isFinal;
    }

    public void setIsFinal(boolean isFinal) {
        this.isFinal = isFinal;
    }

    public AddCommentRequest withIsFinal(boolean isFinal) {
        this.isFinal = isFinal;
        return this;
    }

    public int getKind() {
        return kind;
    }

    public void setKind(int kind) {
        this.kind = kind;
    }

    public AddCommentRequest withKind(int kind) {
        this.kind = kind;
        return this;
    }

    public int getIssueKey() {
        return issueKey;
    }

    public void setIssueKey(int issueKey) {
        this.issueKey = issueKey;
    }

    public AddCommentRequest withIssueKey(int issueKey) {
        this.issueKey = issueKey;
        return this;
    }

    public int getHubClientId() {
        return hubClientId;
    }

    public void setHubClientId(int hubClientId) {
        this.hubClientId = hubClientId;
    }

    public AddCommentRequest withHubClientId(int hubClientId) {
        this.hubClientId = hubClientId;
        return this;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    public AddCommentRequest withParentId(int parentId) {
        this.parentId = parentId;
        return this;
    }

}
