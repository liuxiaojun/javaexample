package com.socialmaster.file;

import java.io.File;
import java.io.IOException;

/**
 * 在指定目录创建文件
 * Created by liuxiaojun on 2016/7/20.
 */
public class CreateFileByDir {
    public static void main(String[] args) throws NullPointerException, IOException {
        File file = null;
        File dir = new File("D:/");
        file.createTempFile("JavaTemp",".java",dir);
    }
}
