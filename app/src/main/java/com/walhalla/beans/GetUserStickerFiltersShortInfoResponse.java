
package com.walhalla.beans;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GetUserStickerFiltersShortInfoResponse {

    @SerializedName("Data")
    @Expose
    private List<Datum_> data = new ArrayList<Datum_>();
    @SerializedName("Total")
    @Expose
    private int total;
    @SerializedName("Aggregates")
    @Expose
    private Object aggregates;

    public List<Datum_> getData() {
        return data;
    }

    public void setData(List<Datum_> data) {
        this.data = data;
    }

    public GetUserStickerFiltersShortInfoResponse withData(List<Datum_> data) {
        this.data = data;
        return this;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public GetUserStickerFiltersShortInfoResponse withTotal(int total) {
        this.total = total;
        return this;
    }

    public Object getAggregates() {
        return aggregates;
    }

    public void setAggregates(Object aggregates) {
        this.aggregates = aggregates;
    }

    public GetUserStickerFiltersShortInfoResponse withAggregates(Object aggregates) {
        this.aggregates = aggregates;
        return this;
    }

}
