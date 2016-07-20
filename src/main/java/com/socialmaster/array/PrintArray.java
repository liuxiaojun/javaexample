package com.socialmaster.array;

/**
 * Created by liuxiaojun on 2016/7/20.
 */
public class PrintArray {
    public static void print(Integer[] inputArray) {
        for (Integer element : inputArray){
            System.out.printf("%s ", element);
            System.out.println();
        }
    }
    public static void print(Double[] inputArray) {
        for (Double element : inputArray){
            System.out.printf("%s ", element);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Integer[] integerArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 1.2, 1.3, 1.4, 1.5};

        System.out.println("输出整型数组:");
        print(integerArray);
        System.out.println("输出双精度数组:");
        print(doubleArray);

    }
}
