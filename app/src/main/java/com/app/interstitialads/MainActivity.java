package com.app.interstitialads;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.app.interstitialads.Models.Fruit_Models;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private InterstitialAd mInterstitialAd;
    Button Ads;
    String adMobAppOpen,adMobBanner,adMobInterstitial,adMobRewarded,adMobANative;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Ads=findViewById(R.id.Ads);
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });

        Fruit_Instance.CallAPI().callMain(adMobAppOpen,adMobBanner,adMobInterstitial,adMobRewarded,adMobANative).enqueue(new Callback<Fruit_Models>() {
            @Override
            public void onResponse(Call<Fruit_Models> call, Response<Fruit_Models> response) {
                Log.d("TTT", "onResponse:response======= "+response.body());

                Ads.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (mInterstitialAd != null) {
                            mInterstitialAd.show(MainActivity.this);
                        } else {
                            Log.d("TAG", "The interstitial ad wasn't ready yet.");
                        }

                    }
                });


                AdRequest adRequest = new AdRequest.Builder().build();

                InterstitialAd.load(MainActivity.this,response.body().getAdMobInterstitial(), adRequest,
                        new InterstitialAdLoadCallback() {
                            @Override
                            public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                                // The mInterstitialAd reference will be null until
                                // an ad is loaded.
                                mInterstitialAd = interstitialAd;
                                mInterstitialAd.setFullScreenContentCallback(new FullScreenContentCallback(){
                                    @Override
                                    public void onAdClicked() {
                                        // Called when a click is recorded for an ad.
                                        Log.d(TAG, "Ad was clicked.");

                                    }

                                    @Override
                                    public void onAdDismissedFullScreenContent() {
                                        // Called when ad is dismissed.
                                        // Set the ad reference to null so you don't show the ad a second time.native
                                        Log.d(TAG, "Ad dismissed fullscreen content.");

                                    }

                                    @Override
                                    public void onAdFailedToShowFullScreenContent(AdError adError) {
                                        // Called when ad fails to show.
                                        Log.e(TAG, "Ad failed to show fullscreen content.");
                                        mInterstitialAd = null;
                                    }

                                    @Override
                                    public void onAdImpression() {
                                        // Called when an impression is recorded for an ad.
                                        Log.d(TAG, "Ad recorded an impression.");
                                    }

                                    @Override
                                    public void onAdShowedFullScreenContent() {
                                        // Called when ad is shown.
                                        Log.d(TAG, "Ad showed fullscreen content.");
                                    }
                                });
                            }

                            @Override
                            public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                                // Handle the error
                                Log.d("TAG", loadAdError.toString());
                                mInterstitialAd = null;
                            }
                        });


            }

            @Override
            public void onFailure(Call<Fruit_Models> call, Throwable t) {
                Log.d("TTT", "onFailure: Error"+t.getLocalizedMessage());
                Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
            }
        });



    }
}