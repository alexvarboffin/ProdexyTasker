
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SignInRequest {

    @SerializedName("UserName")
    @Expose
    private String userName;
    @SerializedName("Password")
    @Expose
    private String password;
//    @SerializedName("url")
//    @Expose
//    private String url;

    /**
     * No args constructor for use in serialization
     *
     */
    public SignInRequest() {
    }

    /**
     *
     * @param password
     * @param userName
     * @p\\aram url
     */
    public SignInRequest(String userName, String password/*, String url*/) {
        super();
        this.userName = userName;
        this.password = password;
//        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public SignInRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public SignInRequest withPassword(String password) {
        this.password = password;
        return this;
    }

//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }
//
//    public SignInRequest withUrl(String url) {
//        this.url = url;
//        return this;
//    }

}
