
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Author_____ {

    @SerializedName("FullName")
    @Expose
    private String fullName;
    @SerializedName("LastName")
    @Expose
    private String lastName;
    @SerializedName("FirstName")
    @Expose
    private String firstName;
    @SerializedName("MiddleName")
    @Expose
    private Object middleName;
    @SerializedName("Id")
    @Expose
    private int id;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Author_____ withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Author_____ withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Author_____ withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Object getMiddleName() {
        return middleName;
    }

    public void setMiddleName(Object middleName) {
        this.middleName = middleName;
    }

    public Author_____ withMiddleName(Object middleName) {
        this.middleName = middleName;
        return this;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Author_____ withId(int id) {
        this.id = id;
        return this;
    }

}
