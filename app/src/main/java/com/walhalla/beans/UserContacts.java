
package com.walhalla.beans;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserContacts {

    @SerializedName("EMail")
    @Expose
    private String eMail;
    @SerializedName("UserName")
    @Expose
    private String userName;
    @SerializedName("ActiveDirectorySid")
    @Expose
    private Object activeDirectorySid;
    @SerializedName("ActiveDirectoryAccountName")
    @Expose
    private Object activeDirectoryAccountName;
    @SerializedName("WindowsDomainFullyQualifiedDomainName")
    @Expose
    private Object windowsDomainFullyQualifiedDomainName;
    @SerializedName("Phone")
    @Expose
    private Object phone;
    @SerializedName("MobilePhone")
    @Expose
    private Object mobilePhone;
    @SerializedName("DepartmentNames")
    @Expose
    private List<String> departmentNames = new ArrayList<String>();
    @SerializedName("RoleName")
    @Expose
    private Object roleName;
    @SerializedName("AreaName")
    @Expose
    private Object areaName;
    @SerializedName("PositionName")
    @Expose
    private String positionName;
    @SerializedName("GroupNames")
    @Expose
    private List<String> groupNames = new ArrayList<String>();

    public String getEMail() {
        return eMail;
    }

    public void setEMail(String eMail) {
        this.eMail = eMail;
    }

    public UserContacts withEMail(String eMail) {
        this.eMail = eMail;
        return this;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserContacts withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    public Object getActiveDirectorySid() {
        return activeDirectorySid;
    }

    public void setActiveDirectorySid(Object activeDirectorySid) {
        this.activeDirectorySid = activeDirectorySid;
    }

    public UserContacts withActiveDirectorySid(Object activeDirectorySid) {
        this.activeDirectorySid = activeDirectorySid;
        return this;
    }

    public Object getActiveDirectoryAccountName() {
        return activeDirectoryAccountName;
    }

    public void setActiveDirectoryAccountName(Object activeDirectoryAccountName) {
        this.activeDirectoryAccountName = activeDirectoryAccountName;
    }

    public UserContacts withActiveDirectoryAccountName(Object activeDirectoryAccountName) {
        this.activeDirectoryAccountName = activeDirectoryAccountName;
        return this;
    }

    public Object getWindowsDomainFullyQualifiedDomainName() {
        return windowsDomainFullyQualifiedDomainName;
    }

    public void setWindowsDomainFullyQualifiedDomainName(Object windowsDomainFullyQualifiedDomainName) {
        this.windowsDomainFullyQualifiedDomainName = windowsDomainFullyQualifiedDomainName;
    }

    public UserContacts withWindowsDomainFullyQualifiedDomainName(Object windowsDomainFullyQualifiedDomainName) {
        this.windowsDomainFullyQualifiedDomainName = windowsDomainFullyQualifiedDomainName;
        return this;
    }

    public Object getPhone() {
        return phone;
    }

    public void setPhone(Object phone) {
        this.phone = phone;
    }

    public UserContacts withPhone(Object phone) {
        this.phone = phone;
        return this;
    }

    public Object getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(Object mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public UserContacts withMobilePhone(Object mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public List<String> getDepartmentNames() {
        return departmentNames;
    }

    public void setDepartmentNames(List<String> departmentNames) {
        this.departmentNames = departmentNames;
    }

    public UserContacts withDepartmentNames(List<String> departmentNames) {
        this.departmentNames = departmentNames;
        return this;
    }

    public Object getRoleName() {
        return roleName;
    }

    public void setRoleName(Object roleName) {
        this.roleName = roleName;
    }

    public UserContacts withRoleName(Object roleName) {
        this.roleName = roleName;
        return this;
    }

    public Object getAreaName() {
        return areaName;
    }

    public void setAreaName(Object areaName) {
        this.areaName = areaName;
    }

    public UserContacts withAreaName(Object areaName) {
        this.areaName = areaName;
        return this;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public UserContacts withPositionName(String positionName) {
        this.positionName = positionName;
        return this;
    }

    public List<String> getGroupNames() {
        return groupNames;
    }

    public void setGroupNames(List<String> groupNames) {
        this.groupNames = groupNames;
    }

    public UserContacts withGroupNames(List<String> groupNames) {
        this.groupNames = groupNames;
        return this;
    }

}
