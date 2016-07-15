package com.socialmaster.array;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by liuxiaojun on 2016/7/15.
 */
public class MaxMin {
    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 100, 0};
        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));
        System.out.println("最小值: " + min);
        System.out.println("最大值: " + max);
    }
}
