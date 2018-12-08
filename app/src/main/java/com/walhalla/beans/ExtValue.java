
package com.walhalla.beans;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExtValue {

    @SerializedName("EMail")
    @Expose
    private String eMail;
    @SerializedName("UserName")
    @Expose
    private String userName;
    @SerializedName("ActiveDirectorySid")
    @Expose
    private String activeDirectorySid;
    @SerializedName("ActiveDirectoryAccountName")
    @Expose
    private String activeDirectoryAccountName;
    @SerializedName("WindowsDomainFullyQualifiedDomainName")
    @Expose
    private String windowsDomainFullyQualifiedDomainName;
    @SerializedName("Phone")
    @Expose
    private String phone;
    @SerializedName("MobilePhone")
    @Expose
    private String mobilePhone;
    @SerializedName("DepartmentNames")
    @Expose
    private List<Object> departmentNames = new ArrayList<Object>();
    @SerializedName("RoleName")
    @Expose
    private Object roleName;
    @SerializedName("AreaName")
    @Expose
    private Object areaName;
    @SerializedName("PositionName")
    @Expose
    private Object positionName;
    @SerializedName("GroupNames")
    @Expose
    private List<String> groupNames = new ArrayList<String>();

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public ExtValue withEMail(String eMail) {
        this.eMail = eMail;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ExtValue withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public String getActiveDirectorySid() {
        return activeDirectorySid;
    }

    public void setActiveDirectorySid(String activeDirectorySid) {
        this.activeDirectorySid = activeDirectorySid;
    }

    public ExtValue withActiveDirectorySid(String activeDirectorySid) {
        this.activeDirectorySid = activeDirectorySid;
        return this;
    }

    public String getActiveDirectoryAccountName() {
        return activeDirectoryAccountName;
    }

    public void setActiveDirectoryAccountName(String activeDirectoryAccountName) {
        this.activeDirectoryAccountName = activeDirectoryAccountName;
    }

    public ExtValue withActiveDirectoryAccountName(String activeDirectoryAccountName) {
        this.activeDirectoryAccountName = activeDirectoryAccountName;
        return this;
    }

    public String getWindowsDomainFullyQualifiedDomainName() {
        return windowsDomainFullyQualifiedDomainName;
    }

    public void setWindowsDomainFullyQualifiedDomainName(String windowsDomainFullyQualifiedDomainName) {
        this.windowsDomainFullyQualifiedDomainName = windowsDomainFullyQualifiedDomainName;
    }

    public ExtValue withWindowsDomainFullyQualifiedDomainName(String windowsDomainFullyQualifiedDomainName) {
        this.windowsDomainFullyQualifiedDomainName = windowsDomainFullyQualifiedDomainName;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ExtValue withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public ExtValue withMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public List<Object> getDepartmentNames() {
        return departmentNames;
    }

    public void setDepartmentNames(List<Object> departmentNames) {
        this.departmentNames = departmentNames;
    }

    public ExtValue withDepartmentNames(List<Object> departmentNames) {
        this.departmentNames = departmentNames;
        return this;
    }

    public Object getRoleName() {
        return roleName;
    }

    public void setRoleName(Object roleName) {
        this.roleName = roleName;
    }

    public ExtValue withRoleName(Object roleName) {
        this.roleName = roleName;
        return this;
    }

    public Object getAreaName() {
        return areaName;
    }

    public void setAreaName(Object areaName) {
        this.areaName = areaName;
    }

    public ExtValue withAreaName(Object areaName) {
        this.areaName = areaName;
        return this;
    }

    public Object getPositionName() {
        return positionName;
    }

    public void setPositionName(Object positionName) {
        this.positionName = positionName;
    }

    public ExtValue withPositionName(Object positionName) {
        this.positionName = positionName;
        return this;
    }

    public List<String> getGroupNames() {
        return groupNames;
    }

    public void setGroupNames(List<String> groupNames) {
        this.groupNames = groupNames;
    }

    public ExtValue withGroupNames(List<String> groupNames) {
        this.groupNames = groupNames;
        return this;
    }

}
