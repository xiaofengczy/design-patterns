package com.xiaofengczy.design.create.abstractfactory.demo2;

/**
 * FileName: ALogo Description:
 *
 * @author caozhongyu
 * @create 19-10-14
 */
public class ALogo implements Logo {

  @Override
  public void logo() {
    System.out.println("我是A汽车Logo");
  }
}
