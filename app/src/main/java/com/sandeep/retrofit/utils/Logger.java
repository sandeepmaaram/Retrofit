package com.sandeep.retrofit.utils;

import android.util.Log;

/**
 * Created by sandeep on 24/5/16.
 */
public class Logger {
    private static final String TAG = "===Retrofit===";

    public static void showLogInfo(String string) {
        Log.i(TAG, "==" + string + "==");
    }

    public static void showError(String string) {
        Log.e(TAG, "==" + string + "==");
    }
}
