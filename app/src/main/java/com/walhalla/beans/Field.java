
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Field {

    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Schema")
    @Expose
    private Schema schema;
    @SerializedName("Data")
    @Expose
    private Data data;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Field withName(String name) {
        this.name = name;
        return this;
    }

    public Schema getSchema() {
        return schema;
    }

    public void setSchema(Schema schema) {
        this.schema = schema;
    }

    public Field withSchema(Schema schema) {
        this.schema = schema;
        return this;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Field withData(Data data) {
        this.data = data;
        return this;
    }

}
