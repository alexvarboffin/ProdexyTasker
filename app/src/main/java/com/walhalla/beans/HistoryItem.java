
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HistoryItem {

    @SerializedName("Id")
    @Expose
    private int id;
    @SerializedName("ObjectId")
    @Expose
    private int objectId;
    @SerializedName("Action")
    @Expose
    private Action action;
    @SerializedName("Created")
    @Expose
    private String created;
    @SerializedName("Issue")
    @Expose
    private Issue issue;
    @SerializedName("Author")
    @Expose
    private Author_ author;
    @SerializedName("ViewedByCurrentUser")
    @Expose
    private boolean viewedByCurrentUser;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HistoryItem withId(int id) {
        this.id = id;
        return this;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public HistoryItem withObjectId(int objectId) {
        this.objectId = objectId;
        return this;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public HistoryItem withAction(Action action) {
        this.action = action;
        return this;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public HistoryItem withCreated(String created) {
        this.created = created;
        return this;
    }

    public Issue getIssue() {
        return issue;
    }

    public void setIssue(Issue issue) {
        this.issue = issue;
    }

    public HistoryItem withIssue(Issue issue) {
        this.issue = issue;
        return this;
    }

    public Author_ getAuthor() {
        return author;
    }

    public void setAuthor(Author_ author) {
        this.author = author;
    }

    public HistoryItem withAuthor(Author_ author) {
        this.author = author;
        return this;
    }

    public boolean isViewedByCurrentUser() {
        return viewedByCurrentUser;
    }

    public void setViewedByCurrentUser(boolean viewedByCurrentUser) {
        this.viewedByCurrentUser = viewedByCurrentUser;
    }

    public HistoryItem withViewedByCurrentUser(boolean viewedByCurrentUser) {
        this.viewedByCurrentUser = viewedByCurrentUser;
        return this;
    }

}
