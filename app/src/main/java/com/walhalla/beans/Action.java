
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Action {

    @SerializedName("Code")
    @Expose
    private int code;
    @SerializedName("Field")
    @Expose
    private String field;
    @SerializedName("OldValue")
    @Expose
    private OldValue oldValue;
    @SerializedName("NewValue")
    @Expose
    private Object newValue;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Action withCode(int code) {
        this.code = code;
        return this;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Action withField(String field) {
        this.field = field;
        return this;
    }

    public OldValue getOldValue() {
        return oldValue;
    }

    public void setOldValue(OldValue oldValue) {
        this.oldValue = oldValue;
    }

    public Action withOldValue(OldValue oldValue) {
        this.oldValue = oldValue;
        return this;
    }

    public Object getNewValue() {
        return newValue;
    }

    public void setNewValue(Object newValue) {
        this.newValue = newValue;
    }

    public Action withNewValue(Object newValue) {
        this.newValue = newValue;
        return this;
    }

}
