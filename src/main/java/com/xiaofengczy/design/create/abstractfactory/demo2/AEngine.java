package com.xiaofengczy.design.create.abstractfactory.demo2;

/**
 * FileName: AEngine Description:
 *
 * @author caozhongyu
 * @create 19-10-14
 */
public class AEngine implements Engine {

  @Override
  public void engine() {
    System.out.println("我是A汽车引擎");
  }
}
