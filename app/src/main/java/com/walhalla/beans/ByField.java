
package com.walhalla.beans;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ByField {

    @SerializedName("SearchingValue")
    @Expose
    private boolean searchingValue;
    @SerializedName("FieldId")
    @Expose
    private int fieldId;
    @SerializedName("DataType")
    @Expose
    private int dataType;
    @SerializedName("SearchingItems")
    @Expose
    private List<String> searchingItems = new ArrayList<String>();

    public boolean isSearchingValue() {
        return searchingValue;
    }

    public void setSearchingValue(boolean searchingValue) {
        this.searchingValue = searchingValue;
    }

    public ByField withSearchingValue(boolean searchingValue) {
        this.searchingValue = searchingValue;
        return this;
    }

    public int getFieldId() {
        return fieldId;
    }

    public void setFieldId(int fieldId) {
        this.fieldId = fieldId;
    }

    public ByField withFieldId(int fieldId) {
        this.fieldId = fieldId;
        return this;
    }

    public int getDataType() {
        return dataType;
    }

    public void setDataType(int dataType) {
        this.dataType = dataType;
    }

    public ByField withDataType(int dataType) {
        this.dataType = dataType;
        return this;
    }

    public List<String> getSearchingItems() {
        return searchingItems;
    }

    public void setSearchingItems(List<String> searchingItems) {
        this.searchingItems = searchingItems;
    }

    public ByField withSearchingItems(List<String> searchingItems) {
        this.searchingItems = searchingItems;
        return this;
    }

}
