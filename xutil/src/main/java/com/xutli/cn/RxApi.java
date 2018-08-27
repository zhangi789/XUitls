package com.xutli.cn;

import android.content.Context;

/**
 * @author 张海洋
 * @Date on 2018/08/27.
 * @org 上海某某有限公司
 * @describe
 */


public class RxApi {
    private static Context context;

    /**
     * 初始化工具类
     *
     * @param context 上下文
     */
    public static void init(Context context) {
        RxApi.context = context.getApplicationContext();
    }


    /**
     * 在某种获取不到 Context 的情况下，即可以使用才方法获取 Context
     * <p>
     * 获取ApplicationContext
     *
     * @return ApplicationContext
     */
    public static Context getContext() {
        if (context != null) {
            return context;
        }
        throw new NullPointerException("请先调用init()方法");
    }
}
