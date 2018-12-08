
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Author_ {

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

    public Author_ withId(int id) {
        this.id = id;
        return this;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public Author_ withEMail(String eMail) {
        this.eMail = eMail;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Author_ withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Author_ withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Object getMiddleName() {
        return middleName;
    }

    public void setMiddleName(Object middleName) {
        this.middleName = middleName;
    }

    public Author_ withMiddleName(Object middleName) {
        this.middleName = middleName;
        return this;
    }

}
