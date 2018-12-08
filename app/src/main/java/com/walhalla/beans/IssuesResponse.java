
package com.walhalla.beans;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IssuesResponse {

    @SerializedName("Id")
    @Expose
    private int id;
    @SerializedName("Fields")
    @Expose
    private List<Field> fields = new ArrayList<Field>();
    @SerializedName("Author")
    @Expose
    private Author author;
    @SerializedName("Access")
    @Expose
    private Access access;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public IssuesResponse withId(int id) {
        this.id = id;
        return this;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }

    public IssuesResponse withFields(List<Field> fields) {
        this.fields = fields;
        return this;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public IssuesResponse withAuthor(Author author) {
        this.author = author;
        return this;
    }

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

    public IssuesResponse withAccess(Access access) {
        this.access = access;
        return this;
    }

}
