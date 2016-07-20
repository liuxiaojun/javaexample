package com.socialmaster.file;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by liuxiaojun on 2016/7/20.
 */
public class ReadContents {
    public static void main(String[] args) throws Exception{
        BufferedReader in = new BufferedReader
                (new FileReader("D:/newfile1.txt"));
        String str;
        while ((str = in.readLine()) != null) {
            System.out.println(str);
        }
    }
}
