package com.xiaofengczy.design.create.factory;

import java.util.Objects;

/**
 * FileName: BMWFactory Description:
 *
 * @author caozhongyu
 * @create 19-10-10
 */
public class BMWFactory extends CarFactory {

  @Override
  public Car makeCar(String type) {
    if (Objects.equals(type, "x1")) {
      return new BMWCar1();
    } else if (Objects.equals(type, "x2")) {
      return new BMWCar2();
    }
    return null;
  }
}
