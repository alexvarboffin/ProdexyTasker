
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Comment {

    @SerializedName("Text")
    @Expose
    private String text;
    @SerializedName("Created")
    @Expose
    private String created;
    @SerializedName("Author")
    @Expose
    private Author_____ author;
    @SerializedName("IsFinal")
    @Expose
    private boolean isFinal;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Comment withText(String text) {
        this.text = text;
        return this;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public Comment withCreated(String created) {
        this.created = created;
        return this;
    }

    public Author_____ getAuthor() {
        return author;
    }

    public void setAuthor(Author_____ author) {
        this.author = author;
    }

    public Comment withAuthor(Author_____ author) {
        this.author = author;
        return this;
    }

    public boolean isIsFinal() {
        return isFinal;
    }

    public void setIsFinal(boolean isFinal) {
        this.isFinal = isFinal;
    }

    public Comment withIsFinal(boolean isFinal) {
        this.isFinal = isFinal;
        return this;
    }

}
