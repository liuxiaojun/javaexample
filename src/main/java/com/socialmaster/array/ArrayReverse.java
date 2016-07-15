package com.socialmaster.array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by liuxiaojun on 2016/7/15.
 */
public class ArrayReverse {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        System.out.println("翻转前排序: "+ arrayList);
        Collections.reverse(arrayList);
        System.out.println("翻转后排序: "+ arrayList);
    }
}
