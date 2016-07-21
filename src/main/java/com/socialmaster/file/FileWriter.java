package com.socialmaster.file;
import java.io.*;
/**
 * Created by liuxiaojun on 2016/7/21.
 */
public class FileWriter {
    public static void main(String[] args) throws Exception{
        BufferedWriter out = new BufferedWriter(new java.io.FileWriter("D:/tmp.txt"));
        out.write("123321");
        out.close();
        System.out.println("文件创建写入成功");
    }
}
