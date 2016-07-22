package com.socialmaster.hashmap;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Created by liuxiaojun on 2016/7/22.
 */
public class EnumerationHashTable {
    public static void main(String[] args) {
        Hashtable ht = new Hashtable();
        ht.put("1", "one");
        ht.put("2", "two");
        ht.put("3", "three");
        Enumeration e = ht.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
