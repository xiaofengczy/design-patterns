package com.xiaofengczy.design.create.simplefactory;

import java.util.Objects;

/**
 * FileName: SimpleFactoryMode
 * Description:简单工厂模式
 *
 * @author caozhongyu
 * @create 19-10-10
 */
public class SimpleFactoryMode {

  public static Food makeFood(String name) {
    if (Objects.equals(name, "火锅")) {
      CQHGFood cqhgFood = new CQHGFood();
      cqhgFood.addSpicy("辣椒");
      return cqhgFood;
    } else if (Objects.equals(name, "麻辣烫")) {
      CCFood ccFood = new CCFood();
      ccFood.addPepper("花椒");
      return ccFood;
    }
    return null;
  }

}
