package com.gof.template;

import java.io.InputStream;

/**
 * className: TemplateMethodTest
 * description: 模板方法模式：将具体处理交给子类
 * author: staring
 * createDate: 2022/4/18
 * version: 1.0
 */
// 所有手机都必须有以下功能，才能称为手机
abstract class Phone {
    protected void start() {
        System.out.println("开机");
    }

    // 钩子方法：执行时，挂哪个子类，就执行哪个子类
    protected abstract void use();

    protected void close() {
        System.out.println("关机");
    }

    // 玩手机就必须经过以下流程，开机，然后使用，最后关机
    public final void play() {
        start();
        // 钩子
        use();
        close();
    }
}

// iphone 以此为模板，然后实现更多功能
class Iphone extends Phone {
    void playGame() {
        System.out.println("iphone 玩游戏");
    }

    void listenMusic() {
        System.out.println("iphone 听歌");
    }

    @Override
    public void start() {
        System.out.println("iphone 开机");
    }

    /**
     * 自定义如何实现钩子方法，但无法定义调用顺序
     */
    @Override
    public void use() {
        playGame();
        listenMusic();
    }

    @Override
    public void close() {
        System.out.println("iphone 关机");
    }
}
public class TemplateMethodTest {
    public static void main(String[] args) {
        Phone phone = new Iphone();
        phone.play();
    }
}
