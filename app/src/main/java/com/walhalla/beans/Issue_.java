
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Issue_ {

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

    public Issue_ withId(int id) {
        this.id = id;
        return this;
    }

    public String getFullKey() {
        return fullKey;
    }

    public void setFullKey(String fullKey) {
        this.fullKey = fullKey;
    }

    public Issue_ withFullKey(String fullKey) {
        this.fullKey = fullKey;
        return this;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Issue_ withSummary(String summary) {
        this.summary = summary;
        return this;
    }

}
