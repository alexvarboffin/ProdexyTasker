
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Issue {

    @SerializedName("Id")
    @Expose
    private int id;
    @SerializedName("FullKey")
    @Expose
    private String fullKey;
    @SerializedName("Summary")
    @Expose
    private String summary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Issue withId(int id) {
        this.id = id;
        return this;
    }

    public String getFullKey() {
        return fullKey;
    }

    public void setFullKey(String fullKey) {
        this.fullKey = fullKey;
    }

    public Issue withFullKey(String fullKey) {
        this.fullKey = fullKey;
        return this;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Issue withSummary(String summary) {
        this.summary = summary;
        return this;
    }

}
