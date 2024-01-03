package com.app.interstitialads;

import com.app.interstitialads.Models.Fruit_Models;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Fruit_Interface {
    @FormUrlEncoded
    @POST("HomeData")
    Call<Fruit_Models> callMain(@Field("adMobAppOpen")String adMobAppOpen,
                                @Field("adMobBanner")String adMobBanner,
                                @Field("adMobInterstitial")String adMobInterstitial,
                                @Field("adMobRewarded")String adMobRewarded,
                                @Field("adMobANative")String adMobANative);
}
