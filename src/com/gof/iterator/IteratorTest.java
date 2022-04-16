package com.gof.iterator;

import java.util.*;

/**
 * className: IteratorTest
 * description: 迭代器模式
 * 自行实现迭代器
 * author: staring
 * createDate: 2022/4/14
 * version: 1.0
 */
public class IteratorTest {
    // 创建自我迭代器
    interface MyIterator {
        boolean hasNext();
        Object next();
    }

    // 实现创建的自我迭代器
    static class MyItr implements MyIterator {
        CarParking carParking;
        int index = 0;

        public MyItr(CarParking carParking) {
            this.carParking = carParking;
        }

        @Override
        public boolean hasNext() {
            Car[] car = carParking.getCar();
            return car[index] != null;
        }

        @Override
        public Object next() {
            return carParking.getCar()[index++].getCarName();
        }
    }

    static class Car {
        String carName;
        public Car(String carName) {
            this.carName = carName;
        }

        public String getCarName() {
            return carName;
        }
    }

    static class CarParking {
        Car[] car;
        int carNumber = 0;
        int index = 0;

        public CarParking(int maxSize) {
            car = new Car[maxSize];
        }

        public void setCar(Car c) {
            if (index < car.length) {
                car[index++] = c;
                carNumber++;
            }
        }

        public Car[] getCar() {
            return car;
        }

        public int getCarNumber() {
            return carNumber;
        }

        public int getIndex() {
            return index;
        }

        MyIterator getIterator() {
            return new MyItr(this);
        }
    }

    public static void main(String[] args) {
        Car car1 = new Car("1");
        Car car2 = new Car("2");
        Car car3 = new Car("3");
        CarParking carParking = new CarParking(10);
        carParking.setCar(car1);
        carParking.setCar(car2);
        carParking.setCar(car3);
        System.out.println(carParking.carNumber);
        MyIterator myIterator = carParking.getIterator();
        System.out.println(myIterator.hasNext());
        while (myIterator.hasNext()) {
            System.out.print(myIterator.next() + " ");
        }
        System.out.println();

    }
}