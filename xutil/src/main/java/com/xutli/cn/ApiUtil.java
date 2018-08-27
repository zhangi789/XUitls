package com.xutli.cn;

import android.content.Context;
import android.view.Gravity;
import android.widget.Toast;

/**
 * @author 张海洋
 * @Date on 2018/08/27.
 * @org 上海相舆科技有限公司
 * @describe
 */


public class ApiUtil {

    private static ApiUtil instance = null;

    private ApiUtil() {
    }
    public static ApiUtil Init() {
        if (instance == null) {
            instance = new ApiUtil();
        }
        return instance;
    }

    /**
     * Show the view or text notification for a long period of time.  This time
     *
     * @param mMsg
     */
    public static void showLToast(Context mContext, String mMsg) {
        Toast toast = Toast.makeText(mContext, mMsg, Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }

    /**
     * Show the view or text notification for a short period of time.  This time
     *
     * @param mMsg
     */
    public static void showSToast(Context mContext, String mMsg) {
        Toast toast = Toast.makeText(mContext, mMsg, Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }


}
