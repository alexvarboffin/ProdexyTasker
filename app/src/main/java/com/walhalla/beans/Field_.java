
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Field_ {

    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Schema")
    @Expose
    private Schema_ schema;
    @SerializedName("Data")
    @Expose
    private Data_ data;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Field_ withName(String name) {
        this.name = name;
        return this;
    }

    public Schema_ getSchema() {
        return schema;
    }

    public void setSchema(Schema_ schema) {
        this.schema = schema;
    }

    public Field_ withSchema(Schema_ schema) {
        this.schema = schema;
        return this;
    }

    public Data_ getData() {
        return data;
    }

    public void setData(Data_ data) {
        this.data = data;
    }

    public Field_ withData(Data_ data) {
        this.data = data;
        return this;
    }

}
