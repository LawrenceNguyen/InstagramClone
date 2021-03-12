package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    //Initializes Parse SDk as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("WM8idaBzpFdkQ8xtSmeTdbpx22FricNZkDRBCyLY")
                .clientKey("PAaF3XZbljLIfhepvcss4rqwHgR6Dy6SsqFo6aua")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
