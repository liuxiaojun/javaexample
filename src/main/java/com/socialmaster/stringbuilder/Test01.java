package com.socialmaster.stringbuilder;

/**
 * Created by liuxiaojun on 16/3/5.
 * 预测可变字符序列, StringBuilder(线程不安全,效率高.) StringBuffer (线程安全,效率低.)
 * String 不可变字符序列
 */
public class Test01 {
    public static void main(String[] args){
        StringBuilder stringBuilder = new StringBuilder();  //字符数组长度默认是16

        StringBuilder stringBuilder1 = new StringBuilder("abcd");  //字符数组长是16+4

        stringBuilder1.append("efg");
        System.out.println(stringBuilder1);

        stringBuilder1.append(true).append("123").append("alafate");
        System.out.println(stringBuilder1);

        stringBuilder1.delete(3,5);
        System.out.println(stringBuilder1);

    }
}
