package com.socialmaster.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by liuxiaojun on 2016/7/19.
 */
public class TimeStampToString {
    public static void main(String[] args) {
        Long timeStamp = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String sd = sdf.format(new Date(Long.parseLong(String.valueOf(timeStamp))));   // 时间戳转换成时间
        System.out.println(sd);
    }
}
