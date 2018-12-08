
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Action_ {

    @SerializedName("Code")
    @Expose
    private int code;
    @SerializedName("Field")
    @Expose
    private String field;
    @SerializedName("OldValue")
    @Expose
    private Object oldValue;
    @SerializedName("NewValue")
    @Expose
    private NewValue newValue;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Action_ withCode(int code) {
        this.code = code;
        return this;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Action_ withField(String field) {
        this.field = field;
        return this;
    }

    public Object getOldValue() {
        return oldValue;
    }

    public void setOldValue(Object oldValue) {
        this.oldValue = oldValue;
    }

    public Action_ withOldValue(Object oldValue) {
        this.oldValue = oldValue;
        return this;
    }

    public NewValue getNewValue() {
        return newValue;
    }

    public void setNewValue(NewValue newValue) {
        this.newValue = newValue;
    }

    public Action_ withNewValue(NewValue newValue) {
        this.newValue = newValue;
        return this;
    }

}
