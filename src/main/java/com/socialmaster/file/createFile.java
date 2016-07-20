package com.socialmaster.file;

import java.io.File;

/**
 * Created by liuxiaojun on 2016/7/20.
 */
public class createFile {
    public static void main(String[] args) throws Exception{
        File file = new File("D:/filename.txt");
        if(file.createNewFile())
            System.out.println("文件创建成功！");
        else
            System.out.println("出错了，改文件已经存在。");
    }
}
