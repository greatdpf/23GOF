package com.gof.factory;

/**
 * className: FactoryMethodTest
 * description: 工厂方法模式：将实例的生成交给工厂
 * author: staring
 * createDate: 2022/4/18
 * version: 1.0
 */
// 手机制作厂：任何手机都必须有这些功能
interface Phone {
}
// Iphone 手机
class Iphone implements Phone {
    String typeName;
    // 默认构造方法，即：默认创建手机 1.0
    public Iphone() {
        typeName = "Iphone 1.0";
    }

    public Iphone(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }
}

// Iphone 手机工厂
class IPhoneFactory {
    // 由工厂创建对象
    public static Phone createPhone() {
        return new Iphone();
    }
    public static Phone createPhone(String typeName) {
        return new Iphone(typeName);
    }
}

// 如果有新产品，可以在加工厂，比如说华为手机，便可以加华为手机工厂，创建手机

public class FactoryMethodTest {
    public static void main(String[] args) {
        // 不用工厂方法模式
        // 负责创建对象，对象参数复杂，知道的东西就越多，创建越麻烦
        Iphone iphone = new Iphone();
        System.out.println(iphone.getTypeName());

        /**
         * 工厂方法设计模式
         * 无需创建对象，只需要知道对应工厂即可
         * 如有参数，就相当于自定义手机，可以把手机参数传给工厂，
         * 工厂进行创建，然后把对象传给需要人
         */
        Iphone phone1 = (Iphone) IPhoneFactory.createPhone();
        System.out.println(phone1.getTypeName());
        Iphone phone2 = (Iphone) IPhoneFactory.createPhone("iphone 2.0");
        System.out.println(phone2.getTypeName());
    }
}
