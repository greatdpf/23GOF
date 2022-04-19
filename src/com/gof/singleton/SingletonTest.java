package com.gof.singleton;

import java.util.Calendar;

/**
 * className: SingletonTest
 * description: 单例模式：只有一个实例对象
 * author: staring
 * createDate: 2022/4/19
 * version: 1.0
 */
public class SingletonTest {
    private static SingletonTest singletonTest = new SingletonTest();
    private SingletonTest() {
        System.out.println("生产一个实例");
    }

    public static SingletonTest getInstance() {
        return singletonTest;
    }
}

class Test {
    public static void main(String[] args) {
        SingletonTest singletonTest1 = SingletonTest.getInstance();
        System.out.println(singletonTest1);
        SingletonTest singletonTest2 = SingletonTest.getInstance();
        System.out.println(singletonTest2);
    }
}
