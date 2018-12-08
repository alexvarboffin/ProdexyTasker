
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class NewValue {

    @SerializedName("Comment")
    @Expose
    private Comment comment;

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

    public NewValue withComment(Comment comment) {
        this.comment = comment;
        return this;
    }

}
