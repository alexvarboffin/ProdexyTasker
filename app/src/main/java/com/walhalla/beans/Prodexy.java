
package com.walhalla.beans;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Prodexy {
    @Override
    public String toString() {
        return "Prodexy{" +
                "signInRequest=" + signInRequest +
                ", signInResponse=" + signInResponse +
                ", logoutRequest=" + logoutRequest +
                ", settingRequest=" + settingRequest +
                ", issuelistRequest=" + issuelistRequest +
                ", issuelistResponse=" + issuelistResponse +
                ", errorResponse=" + errorResponse +
                ", issuesRequest=" + issuesRequest +
                ", issuesResponse=" + issuesResponse +
                ", issueCardFilesRequest=" + issueCardFilesRequest +
                ", issueCardFilesResponse=" + issueCardFilesResponse +
                ", uploadRequest=" + uploadRequest +
                ", uploadResponse=" + uploadResponse +
                ", deleteRequest=" + deleteRequest +
                ", deleteResponse=" + deleteResponse +
                ", commentsBlockRequest=" + commentsBlockRequest +
                ", commentsBlockResponse=" + commentsBlockResponse +
                ", addCommentRequest=" + addCommentRequest +
                ", addCommentResponse=" + addCommentResponse +
                ", getExtendedUserInfoRequest=" + getExtendedUserInfoRequest +
                ", getExtendedUserInfoResponse=" + getExtendedUserInfoResponse +
                ", getUserStickerFiltersShortInfoRequest=" + getUserStickerFiltersShortInfoRequest +
                ", getUserStickerFiltersShortInfoResponse=" + getUserStickerFiltersShortInfoResponse +
                '}';
    }

    @SerializedName("SignInRequest")
    @Expose
    private SignInRequest signInRequest;
    @SerializedName("SignInResponse")
    @Expose
    private SignInResponse signInResponse;
    @SerializedName("LogoutRequest")
    @Expose
    private LogoutRequest logoutRequest;
    @SerializedName("SettingRequest")
    @Expose
    private SettingRequest settingRequest;
    @SerializedName("IssuelistRequest")
    @Expose
    private IssuelistRequest issuelistRequest;
    @SerializedName("IssuelistResponse")
    @Expose
    private IssuelistResponse issuelistResponse;
    @SerializedName("ErrorResponse")
    @Expose
    private ErrorResponse errorResponse;
    @SerializedName("IssuesRequest")
    @Expose
    private IssuesRequest issuesRequest;
    @SerializedName("IssuesResponse")
    @Expose
    private IssuesResponse issuesResponse;
    @SerializedName("IssueCardFilesRequest")
    @Expose
    private IssueCardFilesRequest issueCardFilesRequest;
    @SerializedName("IssueCardFilesResponse")
    @Expose
    private List<IssueCardFilesResponse> issueCardFilesResponse = new ArrayList<IssueCardFilesResponse>();
    @SerializedName("UploadRequest")
    @Expose
    private UploadRequest uploadRequest;
    @SerializedName("UploadResponse")
    @Expose
    private List<UploadResponse> uploadResponse = new ArrayList<UploadResponse>();
    @SerializedName("DeleteRequest")
    @Expose
    private DeleteRequest deleteRequest;
    @SerializedName("DeleteResponse")
    @Expose
    private DeleteResponse deleteResponse;
    @SerializedName("CommentsBlockRequest")
    @Expose
    private CommentsBlockRequest commentsBlockRequest;
    @SerializedName("CommentsBlockResponse")
    @Expose
    private List<CommentsBlockResponse> commentsBlockResponse = new ArrayList<CommentsBlockResponse>();
    @SerializedName("AddCommentRequest")
    @Expose
    private AddCommentRequest addCommentRequest;
    @SerializedName("AddCommentResponse")
    @Expose
    private AddCommentResponse addCommentResponse;
    @SerializedName("GetExtendedUserInfoRequest")
    @Expose
    private GetExtendedUserInfoRequest getExtendedUserInfoRequest;
    @SerializedName("GetExtendedUserInfoResponse")
    @Expose
    private GetExtendedUserInfoResponse getExtendedUserInfoResponse;
    @SerializedName("GetUserStickerFiltersShortInfoRequest")
    @Expose
    private GetUserStickerFiltersShortInfoRequest getUserStickerFiltersShortInfoRequest;
    @SerializedName("GetUserStickerFiltersShortInfoResponse")
    @Expose
    private GetUserStickerFiltersShortInfoResponse getUserStickerFiltersShortInfoResponse;

    public SignInRequest getSignInRequest() {
        return signInRequest;
    }

    public void setSignInRequest(SignInRequest signInRequest) {
        this.signInRequest = signInRequest;
    }

    public Prodexy withSignInRequest(SignInRequest signInRequest) {
        this.signInRequest = signInRequest;
        return this;
    }

    public SignInResponse getSignInResponse() {
        return signInResponse;
    }

    public void setSignInResponse(SignInResponse signInResponse) {
        this.signInResponse = signInResponse;
    }

    public Prodexy withSignInResponse(SignInResponse signInResponse) {
        this.signInResponse = signInResponse;
        return this;
    }

    public LogoutRequest getLogoutRequest() {
        return logoutRequest;
    }

    public void setLogoutRequest(LogoutRequest logoutRequest) {
        this.logoutRequest = logoutRequest;
    }

    public Prodexy withLogoutRequest(LogoutRequest logoutRequest) {
        this.logoutRequest = logoutRequest;
        return this;
    }

    public SettingRequest getSettingRequest() {
        return settingRequest;
    }

    public void setSettingRequest(SettingRequest settingRequest) {
        this.settingRequest = settingRequest;
    }

    public Prodexy withSettingRequest(SettingRequest settingRequest) {
        this.settingRequest = settingRequest;
        return this;
    }

    public IssuelistRequest getIssuelistRequest() {
        return issuelistRequest;
    }

    public void setIssuelistRequest(IssuelistRequest issuelistRequest) {
        this.issuelistRequest = issuelistRequest;
    }

    public Prodexy withIssuelistRequest(IssuelistRequest issuelistRequest) {
        this.issuelistRequest = issuelistRequest;
        return this;
    }

    public IssuelistResponse getIssuelistResponse() {
        return issuelistResponse;
    }

    public void setIssuelistResponse(IssuelistResponse issuelistResponse) {
        this.issuelistResponse = issuelistResponse;
    }

    public Prodexy withIssuelistResponse(IssuelistResponse issuelistResponse) {
        this.issuelistResponse = issuelistResponse;
        return this;
    }

    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }

    public void setErrorResponse(ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
    }

    public Prodexy withErrorResponse(ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }

    public IssuesRequest getIssuesRequest() {
        return issuesRequest;
    }

    public void setIssuesRequest(IssuesRequest issuesRequest) {
        this.issuesRequest = issuesRequest;
    }

    public Prodexy withIssuesRequest(IssuesRequest issuesRequest) {
        this.issuesRequest = issuesRequest;
        return this;
    }

    public IssuesResponse getIssuesResponse() {
        return issuesResponse;
    }

    public void setIssuesResponse(IssuesResponse issuesResponse) {
        this.issuesResponse = issuesResponse;
    }

    public Prodexy withIssuesResponse(IssuesResponse issuesResponse) {
        this.issuesResponse = issuesResponse;
        return this;
    }

    public IssueCardFilesRequest getIssueCardFilesRequest() {
        return issueCardFilesRequest;
    }

    public void setIssueCardFilesRequest(IssueCardFilesRequest issueCardFilesRequest) {
        this.issueCardFilesRequest = issueCardFilesRequest;
    }

    public Prodexy withIssueCardFilesRequest(IssueCardFilesRequest issueCardFilesRequest) {
        this.issueCardFilesRequest = issueCardFilesRequest;
        return this;
    }

    public List<IssueCardFilesResponse> getIssueCardFilesResponse() {
        return issueCardFilesResponse;
    }

    public void setIssueCardFilesResponse(List<IssueCardFilesResponse> issueCardFilesResponse) {
        this.issueCardFilesResponse = issueCardFilesResponse;
    }

    public Prodexy withIssueCardFilesResponse(List<IssueCardFilesResponse> issueCardFilesResponse) {
        this.issueCardFilesResponse = issueCardFilesResponse;
        return this;
    }

    public UploadRequest getUploadRequest() {
        return uploadRequest;
    }

    public void setUploadRequest(UploadRequest uploadRequest) {
        this.uploadRequest = uploadRequest;
    }

    public Prodexy withUploadRequest(UploadRequest uploadRequest) {
        this.uploadRequest = uploadRequest;
        return this;
    }

    public List<UploadResponse> getUploadResponse() {
        return uploadResponse;
    }

    public void setUploadResponse(List<UploadResponse> uploadResponse) {
        this.uploadResponse = uploadResponse;
    }

    public Prodexy withUploadResponse(List<UploadResponse> uploadResponse) {
        this.uploadResponse = uploadResponse;
        return this;
    }

    public DeleteRequest getDeleteRequest() {
        return deleteRequest;
    }

    public void setDeleteRequest(DeleteRequest deleteRequest) {
        this.deleteRequest = deleteRequest;
    }

    public Prodexy withDeleteRequest(DeleteRequest deleteRequest) {
        this.deleteRequest = deleteRequest;
        return this;
    }

    public DeleteResponse getDeleteResponse() {
        return deleteResponse;
    }

    public void setDeleteResponse(DeleteResponse deleteResponse) {
        this.deleteResponse = deleteResponse;
    }

    public Prodexy withDeleteResponse(DeleteResponse deleteResponse) {
        this.deleteResponse = deleteResponse;
        return this;
    }

    public CommentsBlockRequest getCommentsBlockRequest() {
        return commentsBlockRequest;
    }

    public void setCommentsBlockRequest(CommentsBlockRequest commentsBlockRequest) {
        this.commentsBlockRequest = commentsBlockRequest;
    }

    public Prodexy withCommentsBlockRequest(CommentsBlockRequest commentsBlockRequest) {
        this.commentsBlockRequest = commentsBlockRequest;
        return this;
    }

    public List<CommentsBlockResponse> getCommentsBlockResponse() {
        return commentsBlockResponse;
    }

    public void setCommentsBlockResponse(List<CommentsBlockResponse> commentsBlockResponse) {
        this.commentsBlockResponse = commentsBlockResponse;
    }

    public Prodexy withCommentsBlockResponse(List<CommentsBlockResponse> commentsBlockResponse) {
        this.commentsBlockResponse = commentsBlockResponse;
        return this;
    }

    public AddCommentRequest getAddCommentRequest() {
        return addCommentRequest;
    }

    public void setAddCommentRequest(AddCommentRequest addCommentRequest) {
        this.addCommentRequest = addCommentRequest;
    }

    public Prodexy withAddCommentRequest(AddCommentRequest addCommentRequest) {
        this.addCommentRequest = addCommentRequest;
        return this;
    }

    public AddCommentResponse getAddCommentResponse() {
        return addCommentResponse;
    }

    public void setAddCommentResponse(AddCommentResponse addCommentResponse) {
        this.addCommentResponse = addCommentResponse;
    }

    public Prodexy withAddCommentResponse(AddCommentResponse addCommentResponse) {
        this.addCommentResponse = addCommentResponse;
        return this;
    }

    public GetExtendedUserInfoRequest getGetExtendedUserInfoRequest() {
        return getExtendedUserInfoRequest;
    }

    public void setGetExtendedUserInfoRequest(GetExtendedUserInfoRequest getExtendedUserInfoRequest) {
        this.getExtendedUserInfoRequest = getExtendedUserInfoRequest;
    }

    public Prodexy withGetExtendedUserInfoRequest(GetExtendedUserInfoRequest getExtendedUserInfoRequest) {
        this.getExtendedUserInfoRequest = getExtendedUserInfoRequest;
        return this;
    }

    public GetExtendedUserInfoResponse getGetExtendedUserInfoResponse() {
        return getExtendedUserInfoResponse;
    }

    public void setGetExtendedUserInfoResponse(GetExtendedUserInfoResponse getExtendedUserInfoResponse) {
        this.getExtendedUserInfoResponse = getExtendedUserInfoResponse;
    }

    public Prodexy withGetExtendedUserInfoResponse(GetExtendedUserInfoResponse getExtendedUserInfoResponse) {
        this.getExtendedUserInfoResponse = getExtendedUserInfoResponse;
        return this;
    }

    public GetUserStickerFiltersShortInfoRequest getGetUserStickerFiltersShortInfoRequest() {
        return getUserStickerFiltersShortInfoRequest;
    }

    public void setGetUserStickerFiltersShortInfoRequest(GetUserStickerFiltersShortInfoRequest getUserStickerFiltersShortInfoRequest) {
        this.getUserStickerFiltersShortInfoRequest = getUserStickerFiltersShortInfoRequest;
    }

    public Prodexy withGetUserStickerFiltersShortInfoRequest(GetUserStickerFiltersShortInfoRequest getUserStickerFiltersShortInfoRequest) {
        this.getUserStickerFiltersShortInfoRequest = getUserStickerFiltersShortInfoRequest;
        return this;
    }

    public GetUserStickerFiltersShortInfoResponse getGetUserStickerFiltersShortInfoResponse() {
        return getUserStickerFiltersShortInfoResponse;
    }

    public void setGetUserStickerFiltersShortInfoResponse(GetUserStickerFiltersShortInfoResponse getUserStickerFiltersShortInfoResponse) {
        this.getUserStickerFiltersShortInfoResponse = getUserStickerFiltersShortInfoResponse;
    }

    public Prodexy withGetUserStickerFiltersShortInfoResponse(GetUserStickerFiltersShortInfoResponse getUserStickerFiltersShortInfoResponse) {
        this.getUserStickerFiltersShortInfoResponse = getUserStickerFiltersShortInfoResponse;
        return this;
    }

}
