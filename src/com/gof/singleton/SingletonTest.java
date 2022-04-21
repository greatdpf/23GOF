package com.gof.singleton;

import java.util.Calendar;

/**
 * className: SingletonTest
 * description: 单例模式：只有一个实例对象
 * author: staring
 * createDate: 2022/4/19
 * version: 1.0
 */

/**
 * 饿汉式：立即加载，效率高，不能延时加载
 */
class HungrySingleton {
    private static HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton() {
    }
    public static HungrySingleton getHungrySingleton() {
        return hungrySingleton;
    }
}

/**
 * 懒汉式：延迟加载，由于同步，导致效率较低
 */
class LazySingleton {
    private static LazySingleton lazySingleton;
    private LazySingleton() {
    }
    public static synchronized LazySingleton getLazySingleton() {
        if (lazySingleton==null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}

/**
 * 静态内部类式：立即加载
 */
class StaticSingleton {
    public static class Singleton {
        private static StaticSingleton staticSingleton = new StaticSingleton();
    }
    private StaticSingleton() {

    }

    public static StaticSingleton getInstance() {
        return Singleton.staticSingleton;
    }
}

class SingletonTest {
    public static void main(String[] args) {
        // 测试，如果懒汉式不加同步会发生什么，导致创建的对象不唯一
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                LazySingleton lazySingleton = LazySingleton.getLazySingleton();
                System.out.println(lazySingleton);
            }
        };
        Thread thread1 = new Thread(runnable);
        thread1.start();
        Thread thread2 = new Thread(runnable);
        thread2.start();
        Thread thread3 = new Thread(runnable);
        thread3.start();
        Thread thread4 = new Thread(runnable);
        thread4.start();
        System.out.println(StaticSingleton.getInstance());
        System.out.println(StaticSingleton.getInstance());
    }
}