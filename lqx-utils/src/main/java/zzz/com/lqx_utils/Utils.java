package zzz.com.lqx_utils;

import android.content.Context;

public final class Utils {

    private static Context context;

    private Utils() {
    }

    /**
     * 初始化工具类,在Application中oncreat里面初始化
     */
    public static void init(Context context) {
        Utils.context = context.getApplicationContext();
    }

    /**
     * 获取ApplicationContext
     */
    public static Context getContext() {
        if (context != null) return context;
        throw new NullPointerException("You should be initialized");
    }
}