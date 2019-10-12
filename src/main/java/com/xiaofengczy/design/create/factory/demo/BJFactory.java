package com.xiaofengczy.design.create.factory.demo;

/**
 * FileName: BJFactory Description:
 *
 * @author caozhongyu
 * @create 19-10-12
 */
public class BJFactory implements CarFactory {

  @Override
  public Car createCar() {
    System.out.println("生产宝骏汽车");
    return new BJCar();
  }
}
