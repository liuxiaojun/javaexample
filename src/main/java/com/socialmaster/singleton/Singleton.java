package com.socialmaster.singleton;

/**
 * Created by liuxiaojun on 16/3/9.
 */
public class Singleton {
    private Singleton(){
        System.out.println("Singleton is create");
    }

    private static Singleton instance = new Singleton();
    public static Singleton getInstance(){
        return instance;
    }
}


/**
 首先单例必须要有一个private 访问级别的构造函数,只有这样才能确保单例不会在系统中的其它代码实例化,
 其次, instance 成员变量和 getInstance() 方法必须是 static
 */