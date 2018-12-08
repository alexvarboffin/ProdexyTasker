
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data_ {

    @SerializedName("Key")
    @Expose
    private Object key;
    @SerializedName("Value")
    @Expose
    private String value;
    @SerializedName("ExtValue")
    @Expose
    private Object extValue;
    @SerializedName("Values")
    @Expose
    private Object values;

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Data_ withKey(Object key) {
        this.key = key;
        return this;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Data_ withValue(String value) {
        this.value = value;
        return this;
    }

    public Object getExtValue() {
        return extValue;
    }

    public void setExtValue(Object extValue) {
        this.extValue = extValue;
    }

    public Data_ withExtValue(Object extValue) {
        this.extValue = extValue;
        return this;
    }

    public Object getValues() {
        return values;
    }

    public void setValues(Object values) {
        this.values = values;
    }

    public Data_ withValues(Object values) {
        this.values = values;
        return this;
    }

}
