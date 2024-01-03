
package com.app.interstitialads.Models;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Fruit_Models {

    @SerializedName("adMobAppOpen")
    @Expose
    private String adMobAppOpen;
    @SerializedName("adMobBanner")
    @Expose
    private String adMobBanner;
    @SerializedName("adMobInterstitial")
    @Expose
    private String adMobInterstitial;
    @SerializedName("adMobRewarded")
    @Expose
    private String adMobRewarded;
    @SerializedName("adMobANative")
    @Expose
    private String adMobANative;
    @SerializedName("lovinBannerID")
    @Expose
    private List<String> lovinBannerID;
    @SerializedName("lovinInterstitialID")
    @Expose
    private List<String> lovinInterstitialID;
    @SerializedName("lovinRewardID")
    @Expose
    private List<String> lovinRewardID;
    @SerializedName("lovinAppOpenID")
    @Expose
    private List<String> lovinAppOpenID;
    @SerializedName("lovinNativeID")
    @Expose
    private List<String> lovinNativeID;
    @SerializedName("lovinSmallNativeID")
    @Expose
    private List<String> lovinSmallNativeID;
    @SerializedName("isAppAdShow")
    @Expose
    private String isAppAdShow;
    @SerializedName("WhichOne")
    @Expose
    private String whichOne;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("status")
    @Expose
    private String status;

    public Fruit_Models(String adMobAppOpen, String adMobBanner, String adMobInterstitial, String adMobRewarded, String adMobANative, List<String> lovinBannerID, List<String> lovinInterstitialID, List<String> lovinRewardID, List<String> lovinAppOpenID, List<String> lovinNativeID, List<String> lovinSmallNativeID, String isAppAdShow, String whichOne, String message, String status) {
        this.adMobAppOpen = adMobAppOpen;
        this.adMobBanner = adMobBanner;
        this.adMobInterstitial = adMobInterstitial;
        this.adMobRewarded = adMobRewarded;
        this.adMobANative = adMobANative;
        this.lovinBannerID = lovinBannerID;
        this.lovinInterstitialID = lovinInterstitialID;
        this.lovinRewardID = lovinRewardID;
        this.lovinAppOpenID = lovinAppOpenID;
        this.lovinNativeID = lovinNativeID;
        this.lovinSmallNativeID = lovinSmallNativeID;
        this.isAppAdShow = isAppAdShow;
        this.whichOne = whichOne;
        this.message = message;
        this.status = status;
    }

    public String getAdMobAppOpen() {
        return adMobAppOpen;
    }

    public void setAdMobAppOpen(String adMobAppOpen) {
        this.adMobAppOpen = adMobAppOpen;
    }

    public String getAdMobBanner() {
        return adMobBanner;
    }

    public void setAdMobBanner(String adMobBanner) {
        this.adMobBanner = adMobBanner;
    }

    public String getAdMobInterstitial() {
        return adMobInterstitial;
    }

    public void setAdMobInterstitial(String adMobInterstitial) {
        this.adMobInterstitial = adMobInterstitial;
    }

    public String getAdMobRewarded() {
        return adMobRewarded;
    }

    public void setAdMobRewarded(String adMobRewarded) {
        this.adMobRewarded = adMobRewarded;
    }

    public String getAdMobANative() {
        return adMobANative;
    }

    public void setAdMobANative(String adMobANative) {
        this.adMobANative = adMobANative;
    }

    public List<String> getLovinBannerID() {
        return lovinBannerID;
    }

    public void setLovinBannerID(List<String> lovinBannerID) {
        this.lovinBannerID = lovinBannerID;
    }

    public List<String> getLovinInterstitialID() {
        return lovinInterstitialID;
    }

    public void setLovinInterstitialID(List<String> lovinInterstitialID) {
        this.lovinInterstitialID = lovinInterstitialID;
    }

    public List<String> getLovinRewardID() {
        return lovinRewardID;
    }

    public void setLovinRewardID(List<String> lovinRewardID) {
        this.lovinRewardID = lovinRewardID;
    }

    public List<String> getLovinAppOpenID() {
        return lovinAppOpenID;
    }

    public void setLovinAppOpenID(List<String> lovinAppOpenID) {
        this.lovinAppOpenID = lovinAppOpenID;
    }

    public List<String> getLovinNativeID() {
        return lovinNativeID;
    }

    public void setLovinNativeID(List<String> lovinNativeID) {
        this.lovinNativeID = lovinNativeID;
    }

    public List<String> getLovinSmallNativeID() {
        return lovinSmallNativeID;
    }

    public void setLovinSmallNativeID(List<String> lovinSmallNativeID) {
        this.lovinSmallNativeID = lovinSmallNativeID;
    }

    public String getIsAppAdShow() {
        return isAppAdShow;
    }

    public void setIsAppAdShow(String isAppAdShow) {
        this.isAppAdShow = isAppAdShow;
    }

    public String getWhichOne() {
        return whichOne;
    }

    public void setWhichOne(String whichOne) {
        this.whichOne = whichOne;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Fruit_Models.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("adMobAppOpen");
        sb.append('=');
        sb.append(((this.adMobAppOpen == null)?"<null>":this.adMobAppOpen));
        sb.append(',');
        sb.append("adMobBanner");
        sb.append('=');
        sb.append(((this.adMobBanner == null)?"<null>":this.adMobBanner));
        sb.append(',');
        sb.append("adMobInterstitial");
        sb.append('=');
        sb.append(((this.adMobInterstitial == null)?"<null>":this.adMobInterstitial));
        sb.append(',');
        sb.append("adMobRewarded");
        sb.append('=');
        sb.append(((this.adMobRewarded == null)?"<null>":this.adMobRewarded));
        sb.append(',');
        sb.append("adMobANative");
        sb.append('=');
        sb.append(((this.adMobANative == null)?"<null>":this.adMobANative));
        sb.append(',');
        sb.append("lovinBannerID");
        sb.append('=');
        sb.append(((this.lovinBannerID == null)?"<null>":this.lovinBannerID));
        sb.append(',');
        sb.append("lovinInterstitialID");
        sb.append('=');
        sb.append(((this.lovinInterstitialID == null)?"<null>":this.lovinInterstitialID));
        sb.append(',');
        sb.append("lovinRewardID");
        sb.append('=');
        sb.append(((this.lovinRewardID == null)?"<null>":this.lovinRewardID));
        sb.append(',');
        sb.append("lovinAppOpenID");
        sb.append('=');
        sb.append(((this.lovinAppOpenID == null)?"<null>":this.lovinAppOpenID));
        sb.append(',');
        sb.append("lovinNativeID");
        sb.append('=');
        sb.append(((this.lovinNativeID == null)?"<null>":this.lovinNativeID));
        sb.append(',');
        sb.append("lovinSmallNativeID");
        sb.append('=');
        sb.append(((this.lovinSmallNativeID == null)?"<null>":this.lovinSmallNativeID));
        sb.append(',');
        sb.append("isAppAdShow");
        sb.append('=');
        sb.append(((this.isAppAdShow == null)?"<null>":this.isAppAdShow));
        sb.append(',');
        sb.append("whichOne");
        sb.append('=');
        sb.append(((this.whichOne == null)?"<null>":this.whichOne));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
