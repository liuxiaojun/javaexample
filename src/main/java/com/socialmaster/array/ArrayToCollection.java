package com.socialmaster.array;

import java.util.Arrays;
import java.util.List;

/**
 * Created by liuxiaojun on 2016/7/21.
 */
public class ArrayToCollection {
    public static void main(String[] args) throws Exception{
        String[] name = {"a","b","c"};

        List<String> list = Arrays.asList(name);
        System.out.println();
        for(String li: list){
            String str = li;
            System.out.print(str + " ");
        }
    }
}
