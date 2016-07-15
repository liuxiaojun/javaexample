package com.socialmaster.array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by liuxiaojun on 2016/7/15.
 */
public class Merge {
    public static void main(String[] args) {
        String a[] = {"A", "B", "C"};
        String b[] = {"D", "E", "F"};
        List list = new ArrayList(Arrays.asList(a));
        list.addAll(Arrays.asList(b));
        Object[] c = list.toArray();
        System.out.println(Arrays.toString(c));
    }
}
