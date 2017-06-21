package com.packtpub;

import android.app.Application;
import android.util.Log;

/**
 * Created by lion on 17-6-20.
 */

public class App extends Application {
    static {
        System.loadLibrary("com_packtpub_store_Store");
        Log.i("====_", "load library");
    }
}
