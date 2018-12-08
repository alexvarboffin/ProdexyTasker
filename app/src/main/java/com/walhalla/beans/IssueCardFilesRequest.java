
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IssueCardFilesRequest {

    @SerializedName("key")
    @Expose
    private int key;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public IssueCardFilesRequest withKey(int key) {
        this.key = key;
        return this;
    }

}
