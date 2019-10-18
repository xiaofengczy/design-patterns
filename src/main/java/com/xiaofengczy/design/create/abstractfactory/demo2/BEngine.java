package com.xiaofengczy.design.create.abstractfactory.demo2;

/**
 * FileName: BEngine Description:
 *
 * @author caozhongyu
 * @create 19-10-14
 */
public class BEngine implements Engine {
  @Override
  public void engine() {
    System.out.println("我是B汽车引擎");
  }
}
