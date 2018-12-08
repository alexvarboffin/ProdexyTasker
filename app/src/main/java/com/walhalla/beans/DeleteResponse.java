
package com.walhalla.beans;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeleteResponse {

    @SerializedName("Id")
    @Expose
    private int id;
    @SerializedName("HistoryItems")
    @Expose
    private List<HistoryItem> historyItems = new ArrayList<HistoryItem>();
    @SerializedName("HistoryCount")
    @Expose
    private int historyCount;
    @SerializedName("Author")
    @Expose
    private Author__ author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DeleteResponse withId(int id) {
        this.id = id;
        return this;
    }

    public List<HistoryItem> getHistoryItems() {
        return historyItems;
    }

    public void setHistoryItems(List<HistoryItem> historyItems) {
        this.historyItems = historyItems;
    }

    public DeleteResponse withHistoryItems(List<HistoryItem> historyItems) {
        this.historyItems = historyItems;
        return this;
    }

    public int getHistoryCount() {
        return historyCount;
    }

    public void setHistoryCount(int historyCount) {
        this.historyCount = historyCount;
    }

    public DeleteResponse withHistoryCount(int historyCount) {
        this.historyCount = historyCount;
        return this;
    }

    public Author__ getAuthor() {
        return author;
    }

    public void setAuthor(Author__ author) {
        this.author = author;
    }

    public DeleteResponse withAuthor(Author__ author) {
        this.author = author;
        return this;
    }

}
