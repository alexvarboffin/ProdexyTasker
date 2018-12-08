
package com.walhalla.beans;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IssueFieldValueCriterias {

    @SerializedName("ByDictionary")
    @Expose
    private List<Object> byDictionary = new ArrayList<Object>();
    @SerializedName("ByField")
    @Expose
    private List<ByField> byField = new ArrayList<ByField>();

    public List<Object> getByDictionary() {
        return byDictionary;
    }

    public void setByDictionary(List<Object> byDictionary) {
        this.byDictionary = byDictionary;
    }

    public IssueFieldValueCriterias withByDictionary(List<Object> byDictionary) {
        this.byDictionary = byDictionary;
        return this;
    }

    public List<ByField> getByField() {
        return byField;
    }

    public void setByField(List<ByField> byField) {
        this.byField = byField;
    }

    public IssueFieldValueCriterias withByField(List<ByField> byField) {
        this.byField = byField;
        return this;
    }

}
