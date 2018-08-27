package com.xutli.cn;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * @author 张海洋
 * @Date on 2018/08/27.
 * @org 上海某某有限公司
 * @describe SharedPreferences
 * 存储类型  String int float boolean   clear
 */
public class RxSp {

    public static SharedPreferences mSp;

    /**
     * SP中写入String类型value
     *
     * @param key   键
     * @param value 值
     */
    public static void putString(Context mContext, String key, String value) {
        if (mSp == null) {
            mSp = mContext.getSharedPreferences(RxConstant.SP_FLAG, Context.MODE_PRIVATE);
        }
        mSp.edit().putString(key, value).apply();
    }

    /**
     * SP中读取String
     *
     * @param key 键
     * @return 存在返回对应值，不存在返回默认值{@code defaultValue}
     */
    public static String getString(Context mContext, String key, String defValue) {
        if (mSp == null) {
            mSp = mContext.getSharedPreferences(RxConstant.SP_FLAG, Context.MODE_PRIVATE);
        }
        return mSp.getString(key, defValue);
    }

    /**
     * SP中写入Int类型value
     *
     * @param key   键
     * @param value 值
     */
    public static void putInt(Context mContext, String key, int value) {
        if (mSp == null) {
            mSp = mContext.getSharedPreferences(RxConstant.SP_FLAG, Context.MODE_PRIVATE);
        }
        mSp.edit().putInt(key, value).apply();
    }

    /**
     * SP中读取Int
     *
     * @param key 键
     * @return 存在返回对应值，不存在返回默认值{@code defaultValue}
     */
    public static int getInt(Context mContext, String key, int defValue) {
        if (mSp == null) {
            mSp = mContext.getSharedPreferences(RxConstant.SP_FLAG, Context.MODE_PRIVATE);
        }
        return mSp.getInt(key, defValue);
    }

    /**
     * SP中写入float类型value
     *
     * @param key   键
     * @param value 值
     */
    public static void putFloat(Context mContext, String key, float value) {
        if (mSp == null) {
            mSp = mContext.getSharedPreferences(RxConstant.SP_FLAG, Context.MODE_PRIVATE);
        }
        mSp.edit().putFloat(key, value).apply();
    }

    /**
     * SP中读取float
     *
     * @param key 键
     * @return 存在返回对应值，不存在返回默认值{@code defaultValue}
     */
    public static float getFloat(Context mContext, String key, float defValue) {
        if (mSp == null) {
            mSp = mContext.getSharedPreferences(RxConstant.SP_FLAG, Context.MODE_PRIVATE);
        }
        return mSp.getFloat(key, defValue);
    }


    /**
     * SP中写入boolean类型value
     *
     * @param key   键
     * @param value 值
     */
    public static void putBoolean(Context mContext, String key, boolean value) {
        if (mSp == null) {
            mSp = mContext.getSharedPreferences(RxConstant.SP_FLAG, Context.MODE_PRIVATE);
        }
        mSp.edit().
                putBoolean(key, value)
                .apply();
    }

    /**
     * SP中读取boolean
     *
     * @param key 键
     * @return 存在返回对应值，不存在返回默认值{@code defaultValue}
     */
    public static boolean getBoolean(Context mContext, String key) {
        if (mSp == null) {
            mSp = mContext.getSharedPreferences(RxConstant.SP_FLAG, Context.MODE_PRIVATE);
        }
        return mSp.getBoolean(key, false);
    }


    /**
     * SP中移除该key
     *
     * @param key 键
     */
    public static void remove(Context mContext, String key) {
        if (mSp == null) {
            mSp = mContext.getSharedPreferences(RxConstant.SP_FLAG, Context.MODE_PRIVATE);
        }
        mSp.edit().remove(key).apply();
    }


}
