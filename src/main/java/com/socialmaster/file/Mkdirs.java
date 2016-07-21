package com.socialmaster.file;

import java.io.File;

/**
 * Created by liuxiaojun on 2016/7/21.
 */
public class Mkdirs {
    public static void main(String[] args){
        String directories = "D:\\\\a\\\\b\\\\c\\\\d\\\\e\\\\f\\\\g\\\\h";
        File file = new File(directories);
        boolean result = file.mkdirs();
        System.out.println("Status = " + result);

    }
}
