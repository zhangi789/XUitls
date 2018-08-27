package com.xutli.cn;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.view.Gravity;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

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





    /**
     * 1  获得系统的时间
     *
     * @return
     */
    public static String getSystemTime() {


        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");//设置日期格式
        String sh = df.format(new Date());
        String[] split = sh.split("-");
        return split[0] + "-" + split[1] + "-" + split[2] + " " + split[3] + ":" + split[4] + ":" + split[5] + ":";
    }


    //获取版本号
    public static String getVersionName(Context context) {
        String version = "0.0.0";

        PackageManager packageManager = context.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(
                    context.getPackageName(), 0);
            version = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
        }
        return version;
    }


}
