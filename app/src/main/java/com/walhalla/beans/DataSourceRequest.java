
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DataSourceRequest {

    @SerializedName("Skip")
    @Expose
    private int skip;
    @SerializedName("Take")
    @Expose
    private int take;

    public int getSkip() {
        return skip;
    }

    public void setSkip(int skip) {
        this.skip = skip;
    }

    public DataSourceRequest withSkip(int skip) {
        this.skip = skip;
        return this;
    }

    public int getTake() {
        return take;
    }

    public void setTake(int take) {
        this.take = take;
    }

    public DataSourceRequest withTake(int take) {
        this.take = take;
        return this;
    }

}
