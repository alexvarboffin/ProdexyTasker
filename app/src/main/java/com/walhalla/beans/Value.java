
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Value {

    @SerializedName("Key")
    @Expose
    private String key;
    @SerializedName("Value")
    @Expose
    private String value;
    @SerializedName("ExtValue")
    @Expose
    private ExtValue extValue;
    @SerializedName("Values")
    @Expose
    private Object values;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Value withKey(String key) {
        this.key = key;
        return this;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Value withValue(String value) {
        this.value = value;
        return this;
    }

    public ExtValue getExtValue() {
        return extValue;
    }

    public void setExtValue(ExtValue extValue) {
        this.extValue = extValue;
    }

    public Value withExtValue(ExtValue extValue) {
        this.extValue = extValue;
        return this;
    }

    public Object getValues() {
        return values;
    }

    public void setValues(Object values) {
        this.values = values;
    }

    public Value withValues(Object values) {
        this.values = values;
        return this;
    }

}
