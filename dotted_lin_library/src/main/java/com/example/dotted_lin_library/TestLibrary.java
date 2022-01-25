package com.example.dotted_lin_library;

import android.content.Context;

public class TestLibrary {

    private static Context appContext;

    public static void init(Context context) {
        if (null != context) {
            appContext = context;
        }

    }
}
