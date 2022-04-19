package com.gof.abstractFactory;

/**
 * className: AbstractFactoryTest
 * description: 抽象工厂设计模式：将关联零件组装成产品
 * author: staring
 * createDate: 2022/4/19
 * version: 1.0
 */
public class AbstractFactoryTest {
    // 手机
    interface Phone {
        void play();
        void phoneType();
    }

    // iphone 产品
    static class Iphone implements Phone {
        @Override
        public void play() {
            System.out.println("iphone play");
        }

        @Override
        public void phoneType() {
            System.out.println(" Iphone ");
        }
    }

    // android 产品
    static class Android implements Phone {
        @Override
        public void play() {
            System.out.println("iphone play");
        }

        @Override
        public void phoneType() {
            System.out.println(" android ");
        }
    }

    // 抽象工厂，将创建对象这个方法抽象出来，根据不同的对象工厂创建
    abstract static  class AbstractPhoneFactory {
        abstract Phone createPhone();
    }

    // Android 工厂，生产 android
    static class AndroidFactory extends AbstractPhoneFactory {

        @Override
        Phone createPhone() {
            return new Android();
        }
    }

    // iphone 工厂，生产 iphone
    static class IphoneFactory extends AbstractPhoneFactory {

        @Override
        Phone createPhone() {
            return new Iphone();
        }
    }



    public static void main(String[] args) {
        AbstractPhoneFactory factory = new AndroidFactory();
        Android android = (Android) factory.createPhone();
        android.phoneType();
        AbstractPhoneFactory factory2 = new IphoneFactory();
        Iphone iphone = (Iphone) factory2.createPhone();
        iphone.phoneType();


    }
}
