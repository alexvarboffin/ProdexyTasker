
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HistoryItem_ {

    @SerializedName("Id")
    @Expose
    private int id;
    @SerializedName("ObjectId")
    @Expose
    private int objectId;
    @SerializedName("Action")
    @Expose
    private Action_ action;
    @SerializedName("Created")
    @Expose
    private String created;
    @SerializedName("Issue")
    @Expose
    private Issue_ issue;
    @SerializedName("Author")
    @Expose
    private Author______ author;
    @SerializedName("ViewedByCurrentUser")
    @Expose
    private boolean viewedByCurrentUser;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HistoryItem_ withId(int id) {
        this.id = id;
        return this;
    }

    public int getObjectId() {
        return objectId;
    }

    public void setObjectId(int objectId) {
        this.objectId = objectId;
    }

    public HistoryItem_ withObjectId(int objectId) {
        this.objectId = objectId;
        return this;
    }

    public Action_ getAction() {
        return action;
    }

    public void setAction(Action_ action) {
        this.action = action;
    }

    public HistoryItem_ withAction(Action_ action) {
        this.action = action;
        return this;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public HistoryItem_ withCreated(String created) {
        this.created = created;
        return this;
    }

    public Issue_ getIssue() {
        return issue;
    }

    public void setIssue(Issue_ issue) {
        this.issue = issue;
    }

    public HistoryItem_ withIssue(Issue_ issue) {
        this.issue = issue;
        return this;
    }

    public Author______ getAuthor() {
        return author;
    }

    public void setAuthor(Author______ author) {
        this.author = author;
    }

    public HistoryItem_ withAuthor(Author______ author) {
        this.author = author;
        return this;
    }

    public boolean isViewedByCurrentUser() {
        return viewedByCurrentUser;
    }

    public void setViewedByCurrentUser(boolean viewedByCurrentUser) {
        this.viewedByCurrentUser = viewedByCurrentUser;
    }

    public HistoryItem_ withViewedByCurrentUser(boolean viewedByCurrentUser) {
        this.viewedByCurrentUser = viewedByCurrentUser;
        return this;
    }

}
