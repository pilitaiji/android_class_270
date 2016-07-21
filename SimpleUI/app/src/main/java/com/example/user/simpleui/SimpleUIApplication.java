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

//        Parse.initialize(new Parse.Configuration.Builder(this)
//                .applicationId("76ee57f8e5f8bd628cc9586e93d428d5")
//                .server("http://parseserver-ps662-env.us-east-1.elasticbeanstalk.com/parse/")
//                //.clientKey("FxmjczMf7a9mKVwxG5LcB67iDZdFh3dgLMW7QJSj")
//                .enableLocalDataStore()
//                .build());

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("JC0qBXVi3BOFPQ6z6AwbDsHmkUaCSbIpv2KIl2Aq")
                .server("https://parseapi.back4app.com/")
                .clientKey("FxmjczMf7a9mKVwxG5LcB67iDZdFh3dgLMW7QJSj")
                .enableLocalDataStore()
                .build());
    }
}
