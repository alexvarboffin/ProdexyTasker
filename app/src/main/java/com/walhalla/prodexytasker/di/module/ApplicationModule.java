package com.walhalla.prodexytasker.di.module;

import android.content.Context;
import android.support.annotation.NonNull;

import com.walhalla.DEMO_DATA_YEAH;
import com.walhalla.NavigationRouter;
import com.walhalla.prodexytasker.base.ProdexyImpl;
import com.walhalla.prodexytasker.App;
import com.walhalla.prodexytasker.domen.user.UserManager;
import com.walhalla.prodexytasker.rest.NetworkService;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


@Module
public class ApplicationModule {
    private final App application;

    public ApplicationModule(@NonNull App application) {
        this.application = application;
    }

//    @Provides
//    @NonNull
//    @Singleton
//    CalligraphyConfig provideCalligraphyDefaultConfig() {
//        return
//                new CalligraphyConfig.Builder()
//                        .setDefaultFontPath("fonts/source-sans-pro/SourceSansPro-Regular.ttf")
//                        .setFontAttrId(R.attr.fontPath)
//                        .build();
//    }


    @Provides
    @Singleton
    public UserManager provideUserManager() {
        return UserManager.getInstance();
    }


    @Provides
    @Singleton
    public NavigationRouter provideNavigator(Context context) {
        return new NavigationRouter(context);
    }


    @Provides
    @Singleton
    public Context provideContext() {
        return application;
    }

    @Provides
    @Singleton
    public NetworkService provideNetworkService() {
        NetworkService api;


        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        // set your desired log level
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        // add your other interceptors …

        httpClient.readTimeout(60, TimeUnit.SECONDS)
                .connectTimeout(30, TimeUnit.SECONDS);

        // add logging as last interceptor
        httpClient
                .addInterceptor(logging);  // <-- this is the important line!
//                .addInterceptor(chain -> {
//
//                 /*   String uid = "0";
//                    long timestamp = (int) (Calendar.getInstance().getTimeInMillis() / 1000);
//                    String signature = MD5Util.crypt(timestamp + "" + uid + MD5_SIGN);
//                    String base64encode = signature + ":" + timestamp + ":" + uid;
//                    base64encode = Base64.encodeToString(base64encode.getBytes(), Base64.NO_WRAP | Base64.URL_SAFE);
//                */
//                    Request original = chain.request();
//
//
//                    d(String.format("\nRequest:\n%s\nheaders:\n%s",
//                            (original.body() == null) ? null : original.body().toString(),
//                            original.headers()));
//
//                    HttpUrl url = original.url();
////
////                                .newBuilder()
//////                                .addQueryParameter("apikey", "hmiflt4l1ku1ud5lsxz8di3olct1xo2b")
//////                                .addQueryParameter("appid", "0000000000")
////                                //.addQueryParameter("method", "getAliasList")
////                                //.addQueryParameter("kkkkkkk", "00000000000000")
////                                .build();
//
//                    Request request = original.newBuilder()
//                            //.addHeader("Authorization", "zui " + base64encode)
////                                .addHeader("from_client", "sms-reg")
//                            .addHeader("Cache-Control", "no-cache, must-revalidate, max-age=0")
//                            //.url(url)
//                            .build();
//
//
//                    d("initialize: " + url);
//                    d(request.body().toString());
//
//
//                    Response response = chain.proceed(request);
//                    d("Code : " + response.code());
//                    d(response.toString(), response.body().string());
//
//                    if (response.code() == 401) {
//                        // Magic is here ( Handle the error as your way )
//
//                        return response;
//                    }
//                    return response;
//                });


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://www.google.com")
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build())
                .build();
        api = retrofit.create(NetworkService.class);
        return api;
    }

    @Provides
    @Singleton
    public ProdexyImpl provideProdexyRepo(NetworkService networkService) {
        return new ProdexyImpl(networkService);
    }


    @Provides
    @Singleton
    public DEMO_DATA_YEAH provideDEMO_DATA_YEAH(Context context) {
        return new DEMO_DATA_YEAH(context);
    }
}
