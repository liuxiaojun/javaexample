package com.socialmaster.array;

import java.util.ArrayList;

/**
 * Created by liuxiaojun on 2016/7/15.
 */
public class Remove {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.clear();
        arrayList.add(0, "第0个元素");
        arrayList.add(1, "第1个元素");
        arrayList.add(2, "第2个元素");
        System.out.println("数组元素删除前:" + arrayList);

        arrayList.remove(1);
        System.out.println("数组元素删除后:" + arrayList);
    }
}
