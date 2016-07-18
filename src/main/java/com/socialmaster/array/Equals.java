package com.socialmaster.array;
import java.util.Arrays;
/**
 * Created by liuxiaojun on 2016/7/18.
 */
public class Equals {
    public static void main(String[] args) {
        int[] a1 = {1,2};
        int[] a2 = {1,2};
        int[] a3 = {1,2,3,4};
        System.out.println(Arrays.equals(a1, a2));
        System.out.println(Arrays.equals(a2, a3));
    }
}
