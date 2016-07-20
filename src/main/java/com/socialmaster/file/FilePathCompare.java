package com.socialmaster.file;

import java.io.File;
/**
 * Created by liuxiaojun on 2016/7/20.
 */
public class FilePathCompare {
    public static void main(String[] args) {
        File file1 = new File("/tmp/demo1.txt");
        File file2 = new File("/tmp/demo1.txt");
        if(file1.compareTo(file2) == 0) {
            System.out.println("文件路径一致！");
        } else {
            System.out.println("文件路径不一致！");
        }
    }
}
