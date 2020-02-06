package com.zzz.jniproject;

public class MainActivity {

    public String onCreate() {
        return  testJni();
    }

    static {
        System.loadLibrary("MyLibrary");
    }

    public native String testJni();

}
