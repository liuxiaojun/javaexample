package com.socialmaster.file;

import java.io.File;

/**
 * 检查文件是否存在
 * Created by liuxiaojun on 2016/7/20.
 */
public class FileExists {
    public static void main(String[] args) {
        File file = new File("D:/filename.txt");
        System.out.println(file.exists());
    }
}
