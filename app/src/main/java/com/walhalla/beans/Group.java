
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Group {

    @SerializedName("Id")
    @Expose
    private int id;
    @SerializedName("GroupName")
    @Expose
    private String groupName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Group withId(int id) {
        this.id = id;
        return this;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Group withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

}
