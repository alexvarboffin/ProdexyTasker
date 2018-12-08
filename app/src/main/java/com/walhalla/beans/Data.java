
package com.walhalla.beans;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("Key")
    @Expose
    private Object key;
    @SerializedName("Value")
    @Expose
    private Object value;
    @SerializedName("ExtValue")
    @Expose
    private Object extValue;
    @SerializedName("Values")
    @Expose
    private List<Value> values = new ArrayList<Value>();

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Data withKey(Object key) {
        this.key = key;
        return this;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Data withValue(Object value) {
        this.value = value;
        return this;
    }

    public Object getExtValue() {
        return extValue;
    }

    public void setExtValue(Object extValue) {
        this.extValue = extValue;
    }

    public Data withExtValue(Object extValue) {
        this.extValue = extValue;
        return this;
    }

    public List<Value> getValues() {
        return values;
    }

    public void setValues(List<Value> values) {
        this.values = values;
    }

    public Data withValues(List<Value> values) {
        this.values = values;
        return this;
    }

}
