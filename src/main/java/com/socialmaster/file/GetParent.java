package com.socialmaster.file;

import java.io.File;

/**
 * Created by liuxiaojun on 2016/7/21.
 */
public class GetParent {
    public static void main(String[] args) {
        File file = new File("D:/a/b/c.txt");
        String strParentDirectory = file.getParent();
        System.out.println("文件的上级目录为 : " + strParentDirectory);
    }
}
