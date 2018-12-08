
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IssuesRequest {

    @SerializedName("key")
    @Expose
    private int key;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public IssuesRequest withKey(int key) {
        this.key = key;
        return this;
    }

}
