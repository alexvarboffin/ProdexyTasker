package com.walhalla.prodexytasker.rest;

import com.walhalla.beans.CommentsBlockRequest;
import com.walhalla.beans.CommentsBlockResponse;
import com.walhalla.beans.GetExtendedUserInfoRequest;
import com.walhalla.beans.GetExtendedUserInfoResponse;
import com.walhalla.beans.IssuelistRequest;
import com.walhalla.beans.IssuelistResponse;
import com.walhalla.beans.IssuesResponse;
import com.walhalla.beans.SettingRequest;
import com.walhalla.beans.SignInRequest;
import com.walhalla.beans.SignInResponse;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface NetworkService {

    @POST("/api/account/login")
    Call<SignInResponse> signIn(@Body SignInRequest loginData);


    @POST("/api/account/logout")
    Call<Object> logout();//Empty response

    @GET("/api/commoninfo/Settings/")
    Call<SettingRequest> settings(

    );

    //API списка задач
    @POST("/api/issuelist")
    Call<IssuelistResponse> issueList(@Body IssuelistRequest data);


    @GET("/api/issues/")
    Call<IssuesResponse> issues(@Query("key") int key);//# send issue id


    @POST("/api/Subscription/GetUserStickerFiltersShortInfo")
    Call<GetExtendedUserInfoResponse> getExtendedUserInfoResponse(
            @Body GetExtendedUserInfoRequest data
    );


    @GET("/api/commentsBlock")
    Call<List<CommentsBlockResponse>> commentsBlock(
            @Query("key") CommentsBlockRequest data
    );
}
