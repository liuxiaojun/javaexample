package com.socialmaster.array;

/**
 * Created by liuxiaojun on 2016/7/15.
 */
public class ArrayCopy {
    public static void main(String[] args) {
        String[] names = new String[] {"A", "B", "C"};
        String[] extended = new String[5];
        extended[4] = "D";
        extended[5] = "E";
        System.arraycopy(names, 0, extended, 0, names.length);
        for (String str:extended){
            System.out.println(str);
        }
    }
}
