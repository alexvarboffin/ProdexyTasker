
package com.walhalla.beans;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetUserStickerFiltersShortInfoRequest {

    @SerializedName("take")
    @Expose
    private int take;
    @SerializedName("skip")
    @Expose
    private int skip;

    public int getTake() {
        return take;
    }

    public void setTake(int take) {
        this.take = take;
    }

    public GetUserStickerFiltersShortInfoRequest withTake(int take) {
        this.take = take;
        return this;
    }

    public int getSkip() {
        return skip;
    }

    public void setSkip(int skip) {
        this.skip = skip;
    }

    public GetUserStickerFiltersShortInfoRequest withSkip(int skip) {
        this.skip = skip;
        return this;
    }

}
