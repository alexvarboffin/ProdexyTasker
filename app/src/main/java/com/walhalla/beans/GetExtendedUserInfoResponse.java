
package com.walhalla.beans;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetExtendedUserInfoResponse {

    @SerializedName("Id")
    @Expose
    private int id;
    @SerializedName("FullName")
    @Expose
    private String fullName;
    @SerializedName("WorkPhone")
    @Expose
    private Object workPhone;
    @SerializedName("MobilePhone")
    @Expose
    private Object mobilePhone;
    @SerializedName("ActiveDirectoryAccountName")
    @Expose
    private Object activeDirectoryAccountName;
    @SerializedName("AssignedTasksCount")
    @Expose
    private int assignedTasksCount;
    @SerializedName("EMail")
    @Expose
    private String eMail;
    @SerializedName("Roles")
    @Expose
    private List<String> roles = new ArrayList<String>();
    @SerializedName("Groups")
    @Expose
    private List<Group> groups = new ArrayList<Group>();
    @SerializedName("WindowsDomainName")
    @Expose
    private Object windowsDomainName;
    @SerializedName("Info")
    @Expose
    private Object info;
    @SerializedName("Deleted")
    @Expose
    private boolean deleted;
    @SerializedName("AreaId")
    @Expose
    private Object areaId;
    @SerializedName("Area")
    @Expose
    private Object area;
    @SerializedName("LastActivity")
    @Expose
    private String lastActivity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GetExtendedUserInfoResponse withId(int id) {
        this.id = id;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public GetExtendedUserInfoResponse withFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public Object getWorkPhone() {
        return workPhone;
    }

    public void setWorkPhone(Object workPhone) {
        this.workPhone = workPhone;
    }

    public GetExtendedUserInfoResponse withWorkPhone(Object workPhone) {
        this.workPhone = workPhone;
        return this;
    }

    public Object getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(Object mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public GetExtendedUserInfoResponse withMobilePhone(Object mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public Object getActiveDirectoryAccountName() {
        return activeDirectoryAccountName;
    }

    public void setActiveDirectoryAccountName(Object activeDirectoryAccountName) {
        this.activeDirectoryAccountName = activeDirectoryAccountName;
    }

    public GetExtendedUserInfoResponse withActiveDirectoryAccountName(Object activeDirectoryAccountName) {
        this.activeDirectoryAccountName = activeDirectoryAccountName;
        return this;
    }

    public int getAssignedTasksCount() {
        return assignedTasksCount;
    }

    public void setAssignedTasksCount(int assignedTasksCount) {
        this.assignedTasksCount = assignedTasksCount;
    }

    public GetExtendedUserInfoResponse withAssignedTasksCount(int assignedTasksCount) {
        this.assignedTasksCount = assignedTasksCount;
        return this;
    }

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public GetExtendedUserInfoResponse withEMail(String eMail) {
        this.eMail = eMail;
        return this;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public GetExtendedUserInfoResponse withRoles(List<String> roles) {
        this.roles = roles;
        return this;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }

    public GetExtendedUserInfoResponse withGroups(List<Group> groups) {
        this.groups = groups;
        return this;
    }

    public Object getWindowsDomainName() {
        return windowsDomainName;
    }

    public void setWindowsDomainName(Object windowsDomainName) {
        this.windowsDomainName = windowsDomainName;
    }

    public GetExtendedUserInfoResponse withWindowsDomainName(Object windowsDomainName) {
        this.windowsDomainName = windowsDomainName;
        return this;
    }

    public Object getInfo() {
        return info;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public GetExtendedUserInfoResponse withInfo(Object info) {
        this.info = info;
        return this;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public GetExtendedUserInfoResponse withDeleted(boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    public Object getAreaId() {
        return areaId;
    }

    public void setAreaId(Object areaId) {
        this.areaId = areaId;
    }

    public GetExtendedUserInfoResponse withAreaId(Object areaId) {
        this.areaId = areaId;
        return this;
    }

    public Object getArea() {
        return area;
    }

    public void setArea(Object area) {
        this.area = area;
    }

    public GetExtendedUserInfoResponse withArea(Object area) {
        this.area = area;
        return this;
    }

    public String getLastActivity() {
        return lastActivity;
    }

    public void setLastActivity(String lastActivity) {
        this.lastActivity = lastActivity;
    }

    public GetExtendedUserInfoResponse withLastActivity(String lastActivity) {
        this.lastActivity = lastActivity;
        return this;
    }

}
