package com.softdesign.devintensive.utils;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Вызывается в момент запуска приложения.
 * Используется для инициализации базы данных при старте приложения, чтобы можно было бы получить
 * компоненты и т.д.
 * @author ryabykh_ms
 */
public class DevIntensiveApplication extends Application {

    public static SharedPreferences sSharedPreferences;
    public static Context sContext;

    @Override
    public void onCreate() {
        super.onCreate();
        sSharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);
        sContext = this;
    }

    public static SharedPreferences getSharedPreferences() {
        return sSharedPreferences;
    }

    public static Context getContext() {
        return sContext;
    }
}
