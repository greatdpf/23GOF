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
    interface FlatHole {
        // 扁头耳机空
        void flat();
    }

    // 耳机头（扁的）
    static class FlatAir implements FlatHole {

        // 扁头耳机线实现
        @Override
        public void flat() {
            System.out.println("扁头插入，放音乐");
        }
    }

    // 耳机头（圆的）
    static class CircleAir {
        // 圆头耳机线实现
        void circle() {
            System.out.println("圆头插入，放音乐");
        }
    }

    // 适配器：继承圆头耳机的特性，但是实现扁头耳机的要求
    static class MyAdapter extends CircleAir implements FlatHole {
        // 实现扁头耳机的要求
        @Override
        public void flat() {
            // 继承圆头耳机的特性
            circle();
        }
    }

    public static void main(String[] args) {
        // 直接匹配，无需适配器的情况
        FlatHole hole1 = new FlatAir();
        hole1.flat();
        // 需要适配器的情况
        FlatHole hole2 = new MyAdapter();
        hole2.flat();


    }
}
