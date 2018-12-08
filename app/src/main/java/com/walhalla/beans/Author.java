
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Author {

    @SerializedName("Id")
    @Expose
    private int id;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("EMail")
    @Expose
    private String eMail;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Author withId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Author withName(String name) {
        this.name = name;
        return this;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public Author withEMail(String eMail) {
        this.eMail = eMail;
        return this;
    }

}
