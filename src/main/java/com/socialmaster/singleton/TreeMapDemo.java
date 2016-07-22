package com.socialmaster.singleton;

import java.util.TreeMap;

/**
 * Created by liuxiaojun on 2016/7/22.
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        TreeMap treeMap = new TreeMap();
        treeMap.put(1, "Sunday");
        treeMap.put(2, "Monday");
        treeMap.put(3, "Tuesday");
        treeMap.put(4, "Wednesday");
        treeMap.put(5, "Thursday");
        treeMap.put(6, "Friday");
        treeMap.put(7, "Saturday");

        System.out.println("TreeMap 键：" + treeMap.keySet());
        System.out.println("TreeMap 值：" + treeMap.values());

        System.out.println("键为5的值为：" + treeMap.get(5) + "\n" );


    }

}
