
package com.walhalla.beans;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FieldAccess {

    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("CanEdit")
    @Expose
    private boolean canEdit;
    @SerializedName("OtherAccess")
    @Expose
    private List<String> otherAccess = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FieldAccess withName(String name) {
        this.name = name;
        return this;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public FieldAccess withCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
        return this;
    }

    public List<String> getOtherAccess() {
        return otherAccess;
    }

    public void setOtherAccess(List<String> otherAccess) {
        this.otherAccess = otherAccess;
    }

    public FieldAccess withOtherAccess(List<String> otherAccess) {
        this.otherAccess = otherAccess;
        return this;
    }

}
