package com.liuzhizeng.dnote.app;

import android.app.Application;

import com.avos.avoscloud.AVOSCloud;

/**
 * Created by XhinLiang on 2017/5/13.
 * xhinliang@gmail.com
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AVOSCloud.initialize(this, "VdIvL6zy3OFM2EkR2kWJ0okD-gzGzoHsz", "LsfupOdkE8OdkqCuihOANUfr");
    }
}
