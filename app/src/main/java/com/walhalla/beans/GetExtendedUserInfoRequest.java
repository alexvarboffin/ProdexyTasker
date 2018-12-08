
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetExtendedUserInfoRequest {

    @SerializedName("UserId")
    @Expose
    private int userId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public GetExtendedUserInfoRequest withUserId(int userId) {
        this.userId = userId;
        return this;
    }

}
