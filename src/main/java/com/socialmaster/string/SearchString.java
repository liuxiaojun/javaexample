package com.socialmaster.string;

/**
 * Created by liuxiaojun on 2016/7/14.
 */
public class SearchString {
    public static void main(String[] args) {
        String strOrig = "Hello baby";
        int intIndex = strOrig.indexOf("Hello");
        if(intIndex == - 1){
            System.out.println("Hello not found");
        }else{
            System.out.println("Found Hello at index " + intIndex);
        }
    }
}
