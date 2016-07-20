package com.socialmaster.file;

import java.io.File;

/**
 * 重命名文件
 * Created by liuxiaojun on 2016/7/20.
 */
public class Rename {
    public static void main(String[] args) {
        File file = new File("D:/filename.txt");
        file.renameTo(new File("D:/newfile.txt"));

    }
}
