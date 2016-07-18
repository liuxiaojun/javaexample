package com.socialmaster.date;

/**
 * Created by liuxiaojun on 2016/7/18.
 */
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args){
        Date date = new Date();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println(sdf.format(date));
    }
}
