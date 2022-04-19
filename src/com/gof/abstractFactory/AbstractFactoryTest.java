package com.gof.abstractFactory;

/**
 * className: AbstractFactoryTest
 * description: 抽象工厂设计模式：将关联零件组装成产品
 * author: staring
 * createDate: 2022/4/19
 * version: 1.0
 */
// 手机由屏幕，电池，芯片零件构成，不同的零件构成不同的手机产品
interface Phone {
}

// 屏幕
interface Screen {
    void show();
}

// iphone 屏幕
class IphoneScreen implements Screen {

    @Override
    public void show() {
        System.out.println("Iphone 屏幕显示");
    }
}

// 电池
interface Battery {
    void charge();
}

// iphone 电池
class IphoneBattery implements Battery {

    @Override
    public void charge() {
        System.out.println("Iphone 电池供电");
    }
}

// 芯片
interface Chip {
    void calculate();
}

// iphone 芯片
class IphoneChip implements Chip {

    @Override
    public void calculate() {
        System.out.println("Iphone 芯片计算");
    }
}

// 手机工厂
abstract class PhoneFactory {
    abstract Screen createScreen();
    abstract Battery createBattery();
    abstract Chip createChip();
    abstract Phone createPhone();
}

// iphone 手机工厂
class IphoneFactory extends PhoneFactory {

    @Override
    IphoneScreen createScreen() {
        return new IphoneScreen();
    }

    @Override
    IphoneBattery createBattery() {
        return new IphoneBattery();
    }

    @Override
    IphoneChip createChip() {
        return new IphoneChip();
    }

    // 组装 iphone 手机
    @Override
    Phone createPhone() {
        return new Iphone(new IphoneScreen(),new IphoneBattery(),new IphoneChip());
    }
}

// iphone 产品
class Iphone implements Phone {
    private IphoneScreen screen;
    private IphoneBattery battery;
    private IphoneChip chip;

    public Iphone(IphoneScreen screen, IphoneBattery battery, IphoneChip chip) {
        this.screen = screen;
        this.battery = battery;
        this.chip = chip;
    }

    void start() {
        battery.charge();
        chip.calculate();
        screen.show();
    }
}

public class AbstractFactoryTest {
    public static void main(String[] args) {
        IphoneFactory iphoneFactory = new IphoneFactory();
        IphoneBattery battery = (IphoneBattery) iphoneFactory.createBattery();
        battery.charge();
        IphoneScreen screen = (IphoneScreen) iphoneFactory.createScreen();
        screen.show();
        IphoneChip chip = (IphoneChip) iphoneFactory.createChip();
        chip.calculate();
        Iphone iphone = (Iphone) iphoneFactory.createPhone();
        iphone.start();
    }
}
