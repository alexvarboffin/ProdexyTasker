
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SignInResponse {

    @Override
    public String toString() {
        return "SignInResponse{" +
                "error='" + error + '\'' +
                ", returnUrl='" + returnUrl + '\'' +
                '}';
    }

    @SerializedName("Error")
    @Expose
    private String error;
    @SerializedName("ReturnUrl")
    @Expose
    private String returnUrl;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public SignInResponse withError(String error) {
        this.error = error;
        return this;
    }

    public String getReturnUrl() {
        return returnUrl;
    }

    public void setReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
    }

    public SignInResponse withReturnUrl(String returnUrl) {
        this.returnUrl = returnUrl;
        return this;
    }

}
