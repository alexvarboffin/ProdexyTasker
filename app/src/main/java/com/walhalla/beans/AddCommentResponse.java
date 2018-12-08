
package com.walhalla.beans;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class AddCommentResponse {

    @SerializedName("Fields")
    @Expose
    private List<Field_> fields = new ArrayList<Field_>();
    @SerializedName("NewComments")
    @Expose
    private List<NewComment> newComments = new ArrayList<NewComment>();
    @SerializedName("DeletedCommentsIds")
    @Expose
    private Object deletedCommentsIds;
    @SerializedName("HistoryItems")
    @Expose
    private List<HistoryItem_> historyItems = new ArrayList<HistoryItem_>();
    @SerializedName("Author")
    @Expose
    private Object author;

    public List<Field_> getFields() {
        return fields;
    }

    public void setFields(List<Field_> fields) {
        this.fields = fields;
    }

    public AddCommentResponse withFields(List<Field_> fields) {
        this.fields = fields;
        return this;
    }

    public List<NewComment> getNewComments() {
        return newComments;
    }

    public void setNewComments(List<NewComment> newComments) {
        this.newComments = newComments;
    }

    public AddCommentResponse withNewComments(List<NewComment> newComments) {
        this.newComments = newComments;
        return this;
    }

    public Object getDeletedCommentsIds() {
        return deletedCommentsIds;
    }

    public void setDeletedCommentsIds(Object deletedCommentsIds) {
        this.deletedCommentsIds = deletedCommentsIds;
    }

    public AddCommentResponse withDeletedCommentsIds(Object deletedCommentsIds) {
        this.deletedCommentsIds = deletedCommentsIds;
        return this;
    }

    public List<HistoryItem_> getHistoryItems() {
        return historyItems;
    }

    public void setHistoryItems(List<HistoryItem_> historyItems) {
        this.historyItems = historyItems;
    }

    public AddCommentResponse withHistoryItems(List<HistoryItem_> historyItems) {
        this.historyItems = historyItems;
        return this;
    }

    public Object getAuthor() {
        return author;
    }

    public void setAuthor(Object author) {
        this.author = author;
    }

    public AddCommentResponse withAuthor(Object author) {
        this.author = author;
        return this;
    }

}
