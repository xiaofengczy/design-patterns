package com.xiaofengczy.design.create.factory;

/**
 * FileName: CarFactory Description:
 *
 * @author caozhongyu
 * @create 19-10-10
 */
public class CarFactory {

  public Car makeCar(String type){
    System.out.println("生成型号:"+type+"汽车");
    return new Car();
  }

}
