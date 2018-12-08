
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UploadRequest {

    @SerializedName("issueKey")
    @Expose
    private int issueKey;
    @SerializedName("hubClientId")
    @Expose
    private String hubClientId;

    public int getIssueKey() {
        return issueKey;
    }

    public void setIssueKey(int issueKey) {
        this.issueKey = issueKey;
    }

    public UploadRequest withIssueKey(int issueKey) {
        this.issueKey = issueKey;
        return this;
    }

    public String getHubClientId() {
        return hubClientId;
    }

    public void setHubClientId(String hubClientId) {
        this.hubClientId = hubClientId;
    }

    public UploadRequest withHubClientId(String hubClientId) {
        this.hubClientId = hubClientId;
        return this;
    }

}
