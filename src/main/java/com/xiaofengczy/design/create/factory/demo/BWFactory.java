package com.xiaofengczy.design.create.factory.demo;

/**
 * FileName: BWFactory Description:
 *
 * @author caozhongyu
 * @create 19-10-12
 */
public class BWFactory implements CarFactory {

  @Override
  public Car createCar() {
    System.out.println("生产宝沃汽车");
    return new BWCar();
  }
}
