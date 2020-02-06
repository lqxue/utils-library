package com.zzz.jniproject;

/**
 * 这个类名不能变
 */
public class MainActivity {

    public String onCreate() {
        return  testJni();
    }

    static {
        System.loadLibrary("MyLibrary");
    }

    public native String testJni();

}
