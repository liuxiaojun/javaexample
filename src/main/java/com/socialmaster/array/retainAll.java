package com.socialmaster.array;

import java.util.ArrayList;

/**
 * Created by liuxiaojun on 2016/7/15.
 */
public class retainAll {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList();
        ArrayList a2 = new ArrayList();

        a1.add(0,"common1");
        a1.add(1,"common2");
        a1.add(2,"notcommon");
        a1.add(3,"notcommon1");
        a2.add(0,"common1");
        a2.add(1,"common2");
        a2.add(2,"notcommon2");
        System.out.println("a1 数组元素："+a1);
        System.out.println("a1 数组元素："+a2);
        a1.retainAll(a2);
        System.out.println("a1 & a2 数组交集为："+a1);
    }
}
