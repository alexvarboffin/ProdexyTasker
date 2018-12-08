
package com.walhalla.beans;

import android.graphics.drawable.Drawable;
import android.net.Uri;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.pchmn.materialchips.model.ChipInterface;

public class Criteria implements ChipInterface {

    @SerializedName("BrokenSla")
    @Expose
    private boolean brokenSla;
    @SerializedName("DatePostponement")
    @Expose
    private boolean datePostponement;
    @SerializedName("Completed")
    @Expose
    private boolean completed;
    @SerializedName("Assignee")
    @Expose
    private List<Integer> assignee = new ArrayList<Integer>();

    public Criteria(String assignee,Object ints) {
    }

    public boolean isBrokenSla() {
        return brokenSla;
    }

    public void setBrokenSla(boolean brokenSla) {
        this.brokenSla = brokenSla;
    }

    public Criteria withBrokenSla(boolean brokenSla) {
        this.brokenSla = brokenSla;
        return this;
    }

    public boolean isDatePostponement() {
        return datePostponement;
    }

    public void setDatePostponement(boolean datePostponement) {
        this.datePostponement = datePostponement;
    }

    public Criteria withDatePostponement(boolean datePostponement) {
        this.datePostponement = datePostponement;
        return this;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Criteria withCompleted(boolean completed) {
        this.completed = completed;
        return this;
    }

    public List<Integer> getAssignee() {
        return assignee;
    }

    public void setAssignee(List<Integer> assignee) {
        this.assignee = assignee;
    }

    public Criteria withAssignee(List<Integer> assignee) {
        this.assignee = assignee;
        return this;
    }

    @Override
    public Object getId() {
        return null;
    }

    @Override
    public Uri getAvatarUri() {
        return null;
    }

    @Override
    public Drawable getAvatarDrawable() {
        return null;
    }

    @Override
    public String getLabel() {
        return null;
    }

    @Override
    public String getInfo() {
        return null;
    }
}
