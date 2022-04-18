package com.gof.adapter;

import com.sun.javaws.exceptions.OfflineLaunchException;

/**
 * className: AdapterTest
 * description: 适配器模式
 * 自我实现适配器模式
 * author: staring
 * createDate: 2022/4/17
 * version: 1.0
 */
public class AdapterTest {

    // 耳机孔（扁的）
    interface Hole {
        void flat();
    }

    // 耳机孔（扁的）
    static class Flat implements Hole {

        @Override
        public void flat() {
            System.out.println("扁头插入，放音乐");
        }
    }

    // 耳机线（圆头）
    static class Circle {
        void circle() {
            System.out.println("圆头插入，放音乐");
        }
    }

    // 适配器
    static class MyAdapter extends Circle implements Hole {
        @Override
        public void flat() {
            circle();
        }
    }

    public static void main(String[] args) {
        // 直接匹配，无需适配器的情况
        Hole hole1 = new Flat();
        hole1.flat();
        // 需要适配器的情况
        Hole hole2 = new MyAdapter();
        hole2.flat();


    }
}
