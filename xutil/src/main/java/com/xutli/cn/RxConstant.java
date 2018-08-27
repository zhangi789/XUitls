package com.xutli.cn;

/**
 * @author 张海洋
 * @Date on 2018/08/27.
 * @org 上海某某有限公司
 * @describe 工具类抽取公共部分
 */


public class RxConstant {
    //Sp  标识
    public static String SP_FLAG = "SP_FLAG";

    //Date格式
    public static final String DATE_FORMAT_LINK = "yyyyMMddHHmmssSSS";

    //Date格式 常用
    public static final String DATE_FORMAT_DETACH = "yyyy-MM-dd HH:mm:ss";

    //Date格式 带毫秒
    public static final String DATE_FORMAT_DETACH_SSS = "yyyy-MM-dd HH:mm:ss SSS";

    //时间格式 分钟：秒钟 一般用于视频时间显示
    public static final String DATE_FORMAT_MM_SS = "mm:ss";
    /******************** 时间相关常量 ********************/



    /**
     * 毫秒与毫秒的倍数
     */
    public static final int MSEC = 1;
    /**
     * 秒与毫秒的倍数
     */
    public static final int SEC = 1000;
    /**
     * 分与毫秒的倍数
     */
    public static final int MIN = 60000;
    /**
     * 时与毫秒的倍数
     */
    public static final int HOUR = 3600000;
    /**
     * 天与毫秒的倍数
     */
    public static final int DAY = 86400000;

    public static final int REQUEST_ERROR = -1;


    public enum TimeUnit {
        MSEC,
        SEC,
        MIN,
        HOUR,
        DAY
    }
}
