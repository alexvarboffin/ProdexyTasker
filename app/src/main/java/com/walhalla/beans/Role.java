
package com.walhalla.beans;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Role {

    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Id")
    @Expose
    private int id;
    @SerializedName("AccessParameters")
    @Expose
    private List<String> accessParameters = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Role withName(String name) {
        this.name = name;
        return this;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Role withId(int id) {
        this.id = id;
        return this;
    }

    public List<String> getAccessParameters() {
        return accessParameters;
    }

    public void setAccessParameters(List<String> accessParameters) {
        this.accessParameters = accessParameters;
    }

    public Role withAccessParameters(List<String> accessParameters) {
        this.accessParameters = accessParameters;
        return this;
    }

}
