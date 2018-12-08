
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OldValue {

    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("Source")
    @Expose
    private String source;
    @SerializedName("FileId")
    @Expose
    private String fileId;
    @SerializedName("Version")
    @Expose
    private Object version;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OldValue withName(String name) {
        this.name = name;
        return this;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public OldValue withSource(String source) {
        this.source = source;
        return this;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public OldValue withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    public Object getVersion() {
        return version;
    }

    public void setVersion(Object version) {
        this.version = version;
    }

    public OldValue withVersion(Object version) {
        this.version = version;
        return this;
    }

}
