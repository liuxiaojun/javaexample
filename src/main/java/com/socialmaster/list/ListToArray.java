package com.socialmaster.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liuxiaojun on 2016/7/21.
 */
public class ListToArray {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        String[] s1 = list.toArray(new String[0]);
        for(int i = 0; i < s1.length; ++i){
            String contents = s1[i];
            System.out.print(contents);
        }
    }
}
