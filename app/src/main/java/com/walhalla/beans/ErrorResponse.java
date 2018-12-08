
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ErrorResponse {

    @SerializedName("Message")
    @Expose
    private String message;
    @SerializedName("Result")
    @Expose
    private int result;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public ErrorResponse withResult(int result) {
        this.result = result;
        return this;
    }

}
