package com.socialmaster.file;

import java.io.File;

/**
 * Created by liuxiaojun on 2016/7/21.
 */
public class IsHidden {
    public static void main(String[] args) {
        File file = new File("C:/Demo1213.txt");
        System.out.println(file.isHidden());
    }
}
