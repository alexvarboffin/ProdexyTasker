
package com.walhalla.beans;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Access {

    @SerializedName("Id")
    @Expose
    private int id;
    @SerializedName("CanDelete")
    @Expose
    private boolean canDelete;
    @SerializedName("CanView")
    @Expose
    private boolean canView;
    @SerializedName("FieldAccess")
    @Expose
    private List<FieldAccess> fieldAccess = new ArrayList<FieldAccess>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Access withId(int id) {
        this.id = id;
        return this;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public Access withCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }

    public boolean isCanView() {
        return canView;
    }

    public void setCanView(boolean canView) {
        this.canView = canView;
    }

    public Access withCanView(boolean canView) {
        this.canView = canView;
        return this;
    }

    public List<FieldAccess> getFieldAccess() {
        return fieldAccess;
    }

    public void setFieldAccess(List<FieldAccess> fieldAccess) {
        this.fieldAccess = fieldAccess;
    }

    public Access withFieldAccess(List<FieldAccess> fieldAccess) {
        this.fieldAccess = fieldAccess;
        return this;
    }

}
