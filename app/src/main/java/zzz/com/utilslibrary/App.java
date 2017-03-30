package zzz.com.utilslibrary;

import android.app.Application;

import zzz.com.lqxutils.utils.Utils;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Utils.init(this);
    }
}
