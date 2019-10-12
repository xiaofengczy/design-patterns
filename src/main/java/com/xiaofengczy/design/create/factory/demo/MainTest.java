package com.xiaofengczy.design.create.factory.demo;

/**
 * FileName: MainTest Description:
 *生成宝马汽车
宝马汽车
 * @author caozhongyu
 * @create 19-10-12
 */
public class MainTest {

  public static void main(String[] args) {
    BMWFactory bmwFactory = new BMWFactory();
    Car car = bmwFactory.createCar();
    System.out.println(car.getBrand());

    BJFactory bjFactory = new BJFactory();
    Car car1 = bjFactory.createCar();
    System.out.println(car1.getBrand());

    BWFactory bwFactory = new BWFactory();
    Car car2 = bwFactory.createCar();
    System.out.println(car2.getBrand());

  }
}
