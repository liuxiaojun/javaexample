package com.socialmaster.file;

import java.io.File;
import java.util.Date;

/**
 * 获取文件最后的修改时间
 * Created by liuxiaojun on 2016/7/20.
 */
public class GetLastModified {
    public static void main(String[] args) {
        File file = new File("D:/filename.txt");
        Long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println(date);
    }
}
