package com.socialmaster.file;

import java.io.File;

/**
 * 设置文件只读
 * Created by liuxiaojun on 2016/7/20.
 */
public class SetReadOnly {
    public static void main(String[] args) {
        File file = new File("D:/filename.txt");
        file.setReadOnly();
        System.out.println(file.canWrite());
    }
}
