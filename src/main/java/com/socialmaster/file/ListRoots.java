package com.socialmaster.file;

import java.io.File;

/**
 * Created by liuxiaojun on 2016/7/21.
 */
public class ListRoots {
    public static void main(String[] args) {
        File[] roots = File.listRoots();
        System.out.println("----");
        for (int i = 0; i < roots.length; i++ ){
            System.out.println(roots[i]);
        }
    }
}
