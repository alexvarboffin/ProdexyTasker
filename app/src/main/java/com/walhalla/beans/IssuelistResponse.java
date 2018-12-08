
package com.walhalla.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IssuelistResponse implements Serializable{
    @Override
    public String toString() {
        return "IssuelistResponse{" +
                "data=" + data +
                ", total=" + total +
                ", aggregates=" + aggregates +
                '}';
    }

    @SerializedName("Datum")
    @Expose
    private List<Datum> data = new ArrayList<Datum>();
    @SerializedName("Total")
    @Expose
    private int total;
    @SerializedName("Aggregates")
    @Expose
    private Object aggregates;

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public IssuelistResponse withData(List<Datum> data) {
        this.data = data;
        return this;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public IssuelistResponse withTotal(int total) {
        this.total = total;
        return this;
    }

    public Object getAggregates() {
        return aggregates;
    }

    public void setAggregates(Object aggregates) {
        this.aggregates = aggregates;
    }

    public IssuelistResponse withAggregates(Object aggregates) {
        this.aggregates = aggregates;
        return this;
    }

}
