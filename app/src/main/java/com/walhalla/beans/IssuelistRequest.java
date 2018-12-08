
package com.walhalla.beans;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IssuelistRequest {

    @SerializedName("AddChilds")
    @Expose
    private boolean addChilds;
    @SerializedName("Criterias")
    @Expose
    private List<Criteria> criterias = new ArrayList<Criteria>();
    @SerializedName("DataSourceRequest")
    @Expose
    private DataSourceRequest dataSourceRequest;
    @SerializedName("IssueFieldValueCriterias")
    @Expose
    private IssueFieldValueCriterias issueFieldValueCriterias;

    public boolean isAddChilds() {
        return addChilds;
    }

    public void setAddChilds(boolean addChilds) {
        this.addChilds = addChilds;
    }

    public IssuelistRequest withAddChilds(boolean addChilds) {
        this.addChilds = addChilds;
        return this;
    }

    public List<Criteria> getCriterias() {
        return criterias;
    }

    public void setCriterias(List<Criteria> criterias) {
        this.criterias = criterias;
    }

    public IssuelistRequest withCriterias(List<Criteria> criterias) {
        this.criterias = criterias;
        return this;
    }

    public DataSourceRequest getDataSourceRequest() {
        return dataSourceRequest;
    }

    public void setDataSourceRequest(DataSourceRequest dataSourceRequest) {
        this.dataSourceRequest = dataSourceRequest;
    }

    public IssuelistRequest withDataSourceRequest(DataSourceRequest dataSourceRequest) {
        this.dataSourceRequest = dataSourceRequest;
        return this;
    }

    public IssueFieldValueCriterias getIssueFieldValueCriterias() {
        return issueFieldValueCriterias;
    }

    public void setIssueFieldValueCriterias(IssueFieldValueCriterias issueFieldValueCriterias) {
        this.issueFieldValueCriterias = issueFieldValueCriterias;
    }

    public IssuelistRequest withIssueFieldValueCriterias(IssueFieldValueCriterias issueFieldValueCriterias) {
        this.issueFieldValueCriterias = issueFieldValueCriterias;
        return this;
    }

}
