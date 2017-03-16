package com.cqcb.develop.gentleman;

import android.app.Application;

import com.cqcb.develop.net.MrService;

/**
 * Created by chen on 2017/3/15.
 */

public class App extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        MrService.Builder.newBuilder(this)
                .baseUrl("http://gank.io/api/")
                .devMod(true)
                .build();

    }
}
