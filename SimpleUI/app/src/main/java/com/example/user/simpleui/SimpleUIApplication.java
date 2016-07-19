package com.example.user.simpleui;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

import java.lang.reflect.ParameterizedType;

/**
 * Created by user on 2016/7/19.
 */
public class SimpleUIApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Order.class);
        ParseObject.registerSubclass(Drink.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("JC0qBXVi3BOFPQ6z6AwbDsHmkUaCSbIpv2KIl2Aq")
                .server("https://parseapi.back4app.com/")
                .clientKey("FxmjczMf7a9mKVwxG5LcB67iDZdFh3dgLMW7QJSj")
                .enableLocalDataStore()
                .build());
    }
}
