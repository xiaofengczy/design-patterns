package com.xiaofengczy.design.create.factory.demo;

/**
 * FileName: BMWFactory Description:
 *
 * @author caozhongyu
 * @create 19-10-12
 */
public class BMWFactory implements CarFactory {

  @Override
  public Car createCar() {
    System.out.println("生成宝马汽车");
    return new BMWCar();
  }
}
