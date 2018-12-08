
package com.walhalla.beans;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserInfo {

    @SerializedName("IsAdmin")
    @Expose
    private boolean isAdmin;
    @SerializedName("FullName")
    @Expose
    private String fullName;
    @SerializedName("Login")
    @Expose
    private String login;
    @SerializedName("Roles")
    @Expose
    private List<Role> roles = new ArrayList<Role>();
    @SerializedName("UserId")
    @Expose
    private int userId;

    public boolean isIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public UserInfo withIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public UserInfo withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public UserInfo withLogin(String login) {
        this.login = login;
        return this;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

    public UserInfo withRoles(List<Role> roles) {
        this.roles = roles;
        return this;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public UserInfo withUserId(int userId) {
        this.userId = userId;
        return this;
    }

}
