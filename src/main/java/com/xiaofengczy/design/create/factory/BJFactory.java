package com.xiaofengczy.design.create.factory;

import java.util.Objects;

/**
 * FileName: BJFactory Description:
 *
 * @author caozhongyu
 * @create 19-10-10
 */
public class BJFactory extends CarFactory {

  @Override
  public Car makeCar(String type) {
    if (Objects.equals(type, "x1")) {
      return new BJCar1();
    } else if (Objects.equals(type, "x2")) {
      return new BJCar2();
    }
    return null;
  }
}
