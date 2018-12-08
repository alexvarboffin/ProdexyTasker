
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IssueCardFilesResponse {

    @SerializedName("Id")
    @Expose
    private int id;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("IsSystemFile")
    @Expose
    private boolean isSystemFile;
    @SerializedName("SystemFileInfo")
    @Expose
    private Object systemFileInfo;
    @SerializedName("Version")
    @Expose
    private Object version;
    @SerializedName("VersioningAllowed")
    @Expose
    private boolean versioningAllowed;
    @SerializedName("ProviderId")
    @Expose
    private int providerId;
    @SerializedName("AuthorUserName")
    @Expose
    private String authorUserName;
    @SerializedName("AuthorUserId")
    @Expose
    private int authorUserId;
    @SerializedName("CreationDate")
    @Expose
    private String creationDate;
    @SerializedName("Size")
    @Expose
    private int size;
    @SerializedName("IsViewable")
    @Expose
    private boolean isViewable;
    @SerializedName("ImageHeight")
    @Expose
    private int imageHeight;
    @SerializedName("ImageWidth")
    @Expose
    private int imageWidth;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public IssueCardFilesResponse withId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IssueCardFilesResponse withName(String name) {
        this.name = name;
        return this;
    }

    public boolean isIsSystemFile() {
        return isSystemFile;
    }

    public void setIsSystemFile(boolean isSystemFile) {
        this.isSystemFile = isSystemFile;
    }

    public IssueCardFilesResponse withIsSystemFile(boolean isSystemFile) {
        this.isSystemFile = isSystemFile;
        return this;
    }

    public Object getSystemFileInfo() {
        return systemFileInfo;
    }

    public void setSystemFileInfo(Object systemFileInfo) {
        this.systemFileInfo = systemFileInfo;
    }

    public IssueCardFilesResponse withSystemFileInfo(Object systemFileInfo) {
        this.systemFileInfo = systemFileInfo;
        return this;
    }

    public Object getVersion() {
        return version;
    }

    public void setVersion(Object version) {
        this.version = version;
    }

    public IssueCardFilesResponse withVersion(Object version) {
        this.version = version;
        return this;
    }

    public boolean isVersioningAllowed() {
        return versioningAllowed;
    }

    public void setVersioningAllowed(boolean versioningAllowed) {
        this.versioningAllowed = versioningAllowed;
    }

    public IssueCardFilesResponse withVersioningAllowed(boolean versioningAllowed) {
        this.versioningAllowed = versioningAllowed;
        return this;
    }

    public int getProviderId() {
        return providerId;
    }

    public void setProviderId(int providerId) {
        this.providerId = providerId;
    }

    public IssueCardFilesResponse withProviderId(int providerId) {
        this.providerId = providerId;
        return this;
    }

    public String getAuthorUserName() {
        return authorUserName;
    }

    public void setAuthorUserName(String authorUserName) {
        this.authorUserName = authorUserName;
    }

    public IssueCardFilesResponse withAuthorUserName(String authorUserName) {
        this.authorUserName = authorUserName;
        return this;
    }

    public int getAuthorUserId() {
        return authorUserId;
    }

    public void setAuthorUserId(int authorUserId) {
        this.authorUserId = authorUserId;
    }

    public IssueCardFilesResponse withAuthorUserId(int authorUserId) {
        this.authorUserId = authorUserId;
        return this;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public IssueCardFilesResponse withCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public IssueCardFilesResponse withSize(int size) {
        this.size = size;
        return this;
    }

    public boolean isIsViewable() {
        return isViewable;
    }

    public void setIsViewable(boolean isViewable) {
        this.isViewable = isViewable;
    }

    public IssueCardFilesResponse withIsViewable(boolean isViewable) {
        this.isViewable = isViewable;
        return this;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public IssueCardFilesResponse withImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
        return this;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public IssueCardFilesResponse withImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
        return this;
    }

}
