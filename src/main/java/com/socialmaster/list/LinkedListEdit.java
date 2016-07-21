package com.socialmaster.list;
import java.util.LinkedList;
/**
 * Created by liuxiaojun on 2016/7/21.
 */
public class LinkedListEdit {
    public static void main(String[] args) {
        LinkedList officers = new LinkedList();
        officers.add("B");
        officers.add("B");
        officers.add("T");
        officers.add("H");
        officers.add("P");
        System.out.println(officers);
        officers.set(2, "M");
        System.out.println(officers);
    }
}
