package com.alemacedo.a13mobincrivelfirebase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;

public class MainActivity extends AppCompatActivity {

        private FirebaseAnalytics mFirebaseAnalytics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Fabric.width(this, Crashlytics());
        setContentView(R.layout.activity_main);

        mFirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        FirebaseMessaging.getInstance().subscribeToTopic("MOB");
    }

public void clickMe (View v) {
    Bundle params = new Bundle();
    params.putString("NOME", "Alexandre");
    mFirebaseAnalytics.logEvent("clique me", params);
}

    public void forcarCrash (View v) {
        Bundle params = new Bundle();
        params.putString("NOME", "Alexandre");
        mFirebaseAnalytics.logEvent("CRASH ", params);
    }
}
