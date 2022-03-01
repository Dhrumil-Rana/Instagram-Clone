package com.dhrumilrana1998.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("neg7EUGaL0e925mw7oaI7UPDFzxb4ZXhACqLbpVH")
                .clientKey("WFgrrHvy6cpKszsPw4gCvbrrxquLTQFgOR8IcSwa")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
