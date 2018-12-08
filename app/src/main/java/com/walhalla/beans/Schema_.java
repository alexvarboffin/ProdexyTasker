
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Schema_ {

    @SerializedName("DisplayName")
    @Expose
    private String displayName;
    @SerializedName("IsVisible")
    @Expose
    private boolean isVisible;
    @SerializedName("IsEnabled")
    @Expose
    private boolean isEnabled;

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Schema_ withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public boolean isIsVisible() {
        return isVisible;
    }

    public void setIsVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }

    public Schema_ withIsVisible(boolean isVisible) {
        this.isVisible = isVisible;
        return this;
    }

    public boolean isIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public Schema_ withIsEnabled(boolean isEnabled) {
        this.isEnabled = isEnabled;
        return this;
    }

}
