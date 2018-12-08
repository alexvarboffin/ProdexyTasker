
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DeleteRequest {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("hubClientId")
    @Expose
    private String hubClientId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DeleteRequest withId(int id) {
        this.id = id;
        return this;
    }

    public String getHubClientId() {
        return hubClientId;
    }

    public void setHubClientId(String hubClientId) {
        this.hubClientId = hubClientId;
    }

    public DeleteRequest withHubClientId(String hubClientId) {
        this.hubClientId = hubClientId;
        return this;
    }

}
