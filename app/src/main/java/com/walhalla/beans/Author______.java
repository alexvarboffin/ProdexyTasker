
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Author______ {

    @SerializedName("Id")
    @Expose
    private int id;
    @SerializedName("EMail")
    @Expose
    private String eMail;
    @SerializedName("FirstName")
    @Expose
    private String firstName;
    @SerializedName("LastName")
    @Expose
    private String lastName;
    @SerializedName("MiddleName")
    @Expose
    private Object middleName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Author______ withId(int id) {
        this.id = id;
        return this;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public Author______ withEMail(String eMail) {
        this.eMail = eMail;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Author______ withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Author______ withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Object getMiddleName() {
        return middleName;
    }

    public void setMiddleName(Object middleName) {
        this.middleName = middleName;
    }

    public Author______ withMiddleName(Object middleName) {
        this.middleName = middleName;
        return this;
    }

}
