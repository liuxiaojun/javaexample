package com.socialmaster.string;

/**
 * Created by liuxiaojun on 2016/7/14.
 */
public class StringSplit {
    public static void main(String[] args) {
        String str = "www-socialmaster-com";
        String[] temp = str.split("-");
        for(String x :  temp){
            System.out.println(x);
        }

        System.out.println("------ 华丽的分隔符-----");

        for(int i =0; i < temp.length ; i++){
            System.out.println(temp[i]);
        }
    }
}
