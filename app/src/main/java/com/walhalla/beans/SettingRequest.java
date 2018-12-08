
package com.walhalla.beans;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SettingRequest {

    @SerializedName("NotifierShowDuration")
    @Expose
    private int notifierShowDuration;
    @SerializedName("MaxCommentsNestingLevel")
    @Expose
    private int maxCommentsNestingLevel;
    @SerializedName("DownloadHandlerUrl")
    @Expose
    private String downloadHandlerUrl;
    @SerializedName("PhoneMask")
    @Expose
    private String phoneMask;
    @SerializedName("ImagesPath")
    @Expose
    private String imagesPath;
    @SerializedName("UserInfo")
    @Expose
    private UserInfo userInfo;
    @SerializedName("SiteMainEmailAddress")
    @Expose
    private String siteMainEmailAddress;
    @SerializedName("Header")
    @Expose
    private String header;
    @SerializedName("Version")
    @Expose
    private String version;
    @SerializedName("MaxFilesCount")
    @Expose
    private int maxFilesCount;
    @SerializedName("MaxFileSize")
    @Expose
    private int maxFileSize;
    @SerializedName("WorkLogEditablePeriodMinutes")
    @Expose
    private int workLogEditablePeriodMinutes;
    @SerializedName("AllowedExtensions")
    @Expose
    private List<String> allowedExtensions = new ArrayList<String>();
    @SerializedName("ControlPointStatusIsRequired")
    @Expose
    private boolean controlPointStatusIsRequired;
    @SerializedName("FileVersioningAllowed")
    @Expose
    private boolean fileVersioningAllowed;
    @SerializedName("DefaultThemeName")
    @Expose
    private String defaultThemeName;
    @SerializedName("AllowToChangeThemes")
    @Expose
    private boolean allowToChangeThemes;
    @SerializedName("SerializedClientPortalSettings")
    @Expose
    private String serializedClientPortalSettings;
    @SerializedName("LogoPath")
    @Expose
    private String logoPath;
    @SerializedName("MassOperationsAllowed")
    @Expose
    private boolean massOperationsAllowed;
    @SerializedName("PageSizeSettings")
    @Expose
    private String pageSizeSettings;
    @SerializedName("PageStartSizeSettings")
    @Expose
    private int pageStartSizeSettings;
    @SerializedName("CreateProtocolAllowed")
    @Expose
    private boolean createProtocolAllowed;
    @SerializedName("DeleteProtocolAllowed")
    @Expose
    private boolean deleteProtocolAllowed;
    @SerializedName("DetachProtocolIssuesAllowed")
    @Expose
    private boolean detachProtocolIssuesAllowed;
    @SerializedName("ManageFiltersAllowed")
    @Expose
    private boolean manageFiltersAllowed;

    public int getNotifierShowDuration() {
        return notifierShowDuration;
    }

    public void setNotifierShowDuration(int notifierShowDuration) {
        this.notifierShowDuration = notifierShowDuration;
    }

    public SettingRequest withNotifierShowDuration(int notifierShowDuration) {
        this.notifierShowDuration = notifierShowDuration;
        return this;
    }

    public int getMaxCommentsNestingLevel() {
        return maxCommentsNestingLevel;
    }

    public void setMaxCommentsNestingLevel(int maxCommentsNestingLevel) {
        this.maxCommentsNestingLevel = maxCommentsNestingLevel;
    }

    public SettingRequest withMaxCommentsNestingLevel(int maxCommentsNestingLevel) {
        this.maxCommentsNestingLevel = maxCommentsNestingLevel;
        return this;
    }

    public String getDownloadHandlerUrl() {
        return downloadHandlerUrl;
    }

    public void setDownloadHandlerUrl(String downloadHandlerUrl) {
        this.downloadHandlerUrl = downloadHandlerUrl;
    }

    public SettingRequest withDownloadHandlerUrl(String downloadHandlerUrl) {
        this.downloadHandlerUrl = downloadHandlerUrl;
        return this;
    }

    public String getPhoneMask() {
        return phoneMask;
    }

    public void setPhoneMask(String phoneMask) {
        this.phoneMask = phoneMask;
    }

    public SettingRequest withPhoneMask(String phoneMask) {
        this.phoneMask = phoneMask;
        return this;
    }

    public String getImagesPath() {
        return imagesPath;
    }

    public void setImagesPath(String imagesPath) {
        this.imagesPath = imagesPath;
    }

    public SettingRequest withImagesPath(String imagesPath) {
        this.imagesPath = imagesPath;
        return this;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public SettingRequest withUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
        return this;
    }

    public String getSiteMainEmailAddress() {
        return siteMainEmailAddress;
    }

    public void setSiteMainEmailAddress(String siteMainEmailAddress) {
        this.siteMainEmailAddress = siteMainEmailAddress;
    }

    public SettingRequest withSiteMainEmailAddress(String siteMainEmailAddress) {
        this.siteMainEmailAddress = siteMainEmailAddress;
        return this;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public SettingRequest withHeader(String header) {
        this.header = header;
        return this;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public SettingRequest withVersion(String version) {
        this.version = version;
        return this;
    }

    public int getMaxFilesCount() {
        return maxFilesCount;
    }

    public void setMaxFilesCount(int maxFilesCount) {
        this.maxFilesCount = maxFilesCount;
    }

    public SettingRequest withMaxFilesCount(int maxFilesCount) {
        this.maxFilesCount = maxFilesCount;
        return this;
    }

    public int getMaxFileSize() {
        return maxFileSize;
    }

    public void setMaxFileSize(int maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    public SettingRequest withMaxFileSize(int maxFileSize) {
        this.maxFileSize = maxFileSize;
        return this;
    }

    public int getWorkLogEditablePeriodMinutes() {
        return workLogEditablePeriodMinutes;
    }

    public void setWorkLogEditablePeriodMinutes(int workLogEditablePeriodMinutes) {
        this.workLogEditablePeriodMinutes = workLogEditablePeriodMinutes;
    }

    public SettingRequest withWorkLogEditablePeriodMinutes(int workLogEditablePeriodMinutes) {
        this.workLogEditablePeriodMinutes = workLogEditablePeriodMinutes;
        return this;
    }

    public List<String> getAllowedExtensions() {
        return allowedExtensions;
    }

    public void setAllowedExtensions(List<String> allowedExtensions) {
        this.allowedExtensions = allowedExtensions;
    }

    public SettingRequest withAllowedExtensions(List<String> allowedExtensions) {
        this.allowedExtensions = allowedExtensions;
        return this;
    }

    public boolean isControlPointStatusIsRequired() {
        return controlPointStatusIsRequired;
    }

    public void setControlPointStatusIsRequired(boolean controlPointStatusIsRequired) {
        this.controlPointStatusIsRequired = controlPointStatusIsRequired;
    }

    public SettingRequest withControlPointStatusIsRequired(boolean controlPointStatusIsRequired) {
        this.controlPointStatusIsRequired = controlPointStatusIsRequired;
        return this;
    }

    public boolean isFileVersioningAllowed() {
        return fileVersioningAllowed;
    }

    public void setFileVersioningAllowed(boolean fileVersioningAllowed) {
        this.fileVersioningAllowed = fileVersioningAllowed;
    }

    public SettingRequest withFileVersioningAllowed(boolean fileVersioningAllowed) {
        this.fileVersioningAllowed = fileVersioningAllowed;
        return this;
    }

    public String getDefaultThemeName() {
        return defaultThemeName;
    }

    public void setDefaultThemeName(String defaultThemeName) {
        this.defaultThemeName = defaultThemeName;
    }

    public SettingRequest withDefaultThemeName(String defaultThemeName) {
        this.defaultThemeName = defaultThemeName;
        return this;
    }

    public boolean isAllowToChangeThemes() {
        return allowToChangeThemes;
    }

    public void setAllowToChangeThemes(boolean allowToChangeThemes) {
        this.allowToChangeThemes = allowToChangeThemes;
    }

    public SettingRequest withAllowToChangeThemes(boolean allowToChangeThemes) {
        this.allowToChangeThemes = allowToChangeThemes;
        return this;
    }

    public String getSerializedClientPortalSettings() {
        return serializedClientPortalSettings;
    }

    public void setSerializedClientPortalSettings(String serializedClientPortalSettings) {
        this.serializedClientPortalSettings = serializedClientPortalSettings;
    }

    public SettingRequest withSerializedClientPortalSettings(String serializedClientPortalSettings) {
        this.serializedClientPortalSettings = serializedClientPortalSettings;
        return this;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    public SettingRequest withLogoPath(String logoPath) {
        this.logoPath = logoPath;
        return this;
    }

    public boolean isMassOperationsAllowed() {
        return massOperationsAllowed;
    }

    public void setMassOperationsAllowed(boolean massOperationsAllowed) {
        this.massOperationsAllowed = massOperationsAllowed;
    }

    public SettingRequest withMassOperationsAllowed(boolean massOperationsAllowed) {
        this.massOperationsAllowed = massOperationsAllowed;
        return this;
    }

    public String getPageSizeSettings() {
        return pageSizeSettings;
    }

    public void setPageSizeSettings(String pageSizeSettings) {
        this.pageSizeSettings = pageSizeSettings;
    }

    public SettingRequest withPageSizeSettings(String pageSizeSettings) {
        this.pageSizeSettings = pageSizeSettings;
        return this;
    }

    public int getPageStartSizeSettings() {
        return pageStartSizeSettings;
    }

    public void setPageStartSizeSettings(int pageStartSizeSettings) {
        this.pageStartSizeSettings = pageStartSizeSettings;
    }

    public SettingRequest withPageStartSizeSettings(int pageStartSizeSettings) {
        this.pageStartSizeSettings = pageStartSizeSettings;
        return this;
    }

    public boolean isCreateProtocolAllowed() {
        return createProtocolAllowed;
    }

    public void setCreateProtocolAllowed(boolean createProtocolAllowed) {
        this.createProtocolAllowed = createProtocolAllowed;
    }

    public SettingRequest withCreateProtocolAllowed(boolean createProtocolAllowed) {
        this.createProtocolAllowed = createProtocolAllowed;
        return this;
    }

    public boolean isDeleteProtocolAllowed() {
        return deleteProtocolAllowed;
    }

    public void setDeleteProtocolAllowed(boolean deleteProtocolAllowed) {
        this.deleteProtocolAllowed = deleteProtocolAllowed;
    }

    public SettingRequest withDeleteProtocolAllowed(boolean deleteProtocolAllowed) {
        this.deleteProtocolAllowed = deleteProtocolAllowed;
        return this;
    }

    public boolean isDetachProtocolIssuesAllowed() {
        return detachProtocolIssuesAllowed;
    }

    public void setDetachProtocolIssuesAllowed(boolean detachProtocolIssuesAllowed) {
        this.detachProtocolIssuesAllowed = detachProtocolIssuesAllowed;
    }

    public SettingRequest withDetachProtocolIssuesAllowed(boolean detachProtocolIssuesAllowed) {
        this.detachProtocolIssuesAllowed = detachProtocolIssuesAllowed;
        return this;
    }

    public boolean isManageFiltersAllowed() {
        return manageFiltersAllowed;
    }

    public void setManageFiltersAllowed(boolean manageFiltersAllowed) {
        this.manageFiltersAllowed = manageFiltersAllowed;
    }

    public SettingRequest withManageFiltersAllowed(boolean manageFiltersAllowed) {
        this.manageFiltersAllowed = manageFiltersAllowed;
        return this;
    }

}
