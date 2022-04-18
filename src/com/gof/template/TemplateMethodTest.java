package com.gof.template;

import java.io.InputStream;

/**
 * className: TemplateMethodTest
 * description: 模板方法模式：将具体处理交给子类
 * author: staring
 * createDate: 2022/4/18
 * version: 1.0
 */
public class TemplateMethodTest {

    // phone 父类
    abstract static class Phone {
        protected abstract void start();
        protected abstract void use();
        protected abstract void close();
        public final void play() {
            start();
            use();
            close();
        }

    }

    // iphone 以此为模板，然后实现更多功能
    static class Iphone extends Phone {

        void playGame() {
            System.out.println("iphone玩游戏");
        }

        void listenMusic() {
            System.out.println("iphone听歌");
        }

        @Override
        public void start() {
            System.out.println("iphone开机");
        }

        @Override
        public void use() {
            playGame();
            listenMusic();
        }

        @Override
        public void close() {
            System.out.println("iphone关机");
        }
    }

    // Andriod 同样以此为模板，但是功能不同
    static class Android extends Phone {

        void playGame() {
            System.out.println("Android玩游戏");
        }

        void listenMusic() {
            System.out.println("Android听歌");
        }

        @Override
        public void start() {
            System.out.println("Android开机");
        }

        @Override
        public void use() {
            playGame();
            listenMusic();
        }

        @Override
        public void close() {
            System.out.println("Android关机");
        }
    }

    public static void main(String[] args) {
        Phone phone = new Iphone();
        phone.play();
        Phone phone2 = new Android();
        phone2.play();
    }
}
