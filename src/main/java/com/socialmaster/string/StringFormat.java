package com.socialmaster.string;
import java.util.*;
/**
 * Created by liuxiaojun on 2016/7/14.
 */
public class StringFormat {
    public static void main(String[] args) {
        double e = Math.E;
        System.out.format("%f%n", e);
        System.out.format(Locale.GERMANY, "%-10.4f%n%n", e);  //指定本地为德国（GERMANY）
    }
}
