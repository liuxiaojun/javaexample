package com.socialmaster.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by liuxiaojun on 2016/7/22.
 */
public class ListReplaceAll {
    public static void main(String[] args) {
        List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
        System.out.println("List :"+list);
        Collections.replaceAll(list, "one", "hundread");
        System.out.println("replaceAll: " + list);
    }
}
