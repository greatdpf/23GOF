package com.gof.factory;

import java.io.Serializable;

/**
 * className: FactoryMethodTest
 * description: 工厂方法模式：将实例的生成交给工厂
 * author: staring
 * createDate: 2022/4/18
 * version: 1.0
 */
public class FactoryMethodTest {
    // 手机制作厂
    interface Phone {
    }

    static class Iphone implements Phone {
    }

    static class PhoneFactory {
        public static Phone createPhone() {
            return new Iphone();
        }
    }

    public static void main(String[] args) {
        Phone phone1 = PhoneFactory.createPhone();
        System.out.println(phone1);
        Phone phone2 = PhoneFactory.createPhone();
        System.out.println(phone2);
        System.out.println(phone1 == phone2);
    }
}
