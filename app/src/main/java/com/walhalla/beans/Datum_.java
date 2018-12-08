
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum_ {

    @SerializedName("FilterJSON")
    @Expose
    private String filterJSON;
    @SerializedName("Id")
    @Expose
    private int id;
    @SerializedName("Title")
    @Expose
    private String title;
    @SerializedName("Order")
    @Expose
    private int order;
    @SerializedName("SubscriptionId")
    @Expose
    private Object subscriptionId;
    @SerializedName("SubscriptionType")
    @Expose
    private String subscriptionType;
    @SerializedName("AllowEditSubscriptionType")
    @Expose
    private boolean allowEditSubscriptionType;

    public String getFilterJSON() {
        return filterJSON;
    }

    public void setFilterJSON(String filterJSON) {
        this.filterJSON = filterJSON;
    }

    public Datum_ withFilterJSON(String filterJSON) {
        this.filterJSON = filterJSON;
        return this;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Datum_ withId(int id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Datum_ withTitle(String title) {
        this.title = title;
        return this;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public Datum_ withOrder(int order) {
        this.order = order;
        return this;
    }

    public Object getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(Object subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public Datum_ withSubscriptionId(Object subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public Datum_ withSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
        return this;
    }

    public boolean isAllowEditSubscriptionType() {
        return allowEditSubscriptionType;
    }

    public void setAllowEditSubscriptionType(boolean allowEditSubscriptionType) {
        this.allowEditSubscriptionType = allowEditSubscriptionType;
    }

    public Datum_ withAllowEditSubscriptionType(boolean allowEditSubscriptionType) {
        this.allowEditSubscriptionType = allowEditSubscriptionType;
        return this;
    }

}
