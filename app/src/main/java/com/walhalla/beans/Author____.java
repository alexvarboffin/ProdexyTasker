
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Author____ {

    @SerializedName("UserId")
    @Expose
    private int userId;
    @SerializedName("FirstName")
    @Expose
    private String firstName;
    @SerializedName("LastName")
    @Expose
    private String lastName;
    @SerializedName("FullName")
    @Expose
    private String fullName;
    @SerializedName("UserContacts")
    @Expose
    private UserContacts_ userContacts;
    @SerializedName("EMail")
    @Expose
    private String eMail;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Author____ withUserId(int userId) {
        this.userId = userId;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Author____ withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Author____ withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Author____ withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public UserContacts_ getUserContacts() {
        return userContacts;
    }

    public void setUserContacts(UserContacts_ userContacts) {
        this.userContacts = userContacts;
    }

    public Author____ withUserContacts(UserContacts_ userContacts) {
        this.userContacts = userContacts;
        return this;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public Author____ withEMail(String eMail) {
        this.eMail = eMail;
        return this;
    }

}
