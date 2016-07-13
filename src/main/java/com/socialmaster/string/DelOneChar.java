package com.socialmaster.string;

/**
 * Created by liuxiaojun on 2016/7/13.
 */
public class DelOneChar {
    public static void main(String args[]) {
        String str = "this is Java";
        System.out.println(removeCharAt(str, 3));
    }
    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
