package com.xiaofengczy.design.create.abstractfactory.demo2;

/**
 * FileName: BLogo Description:
 *
 * @author caozhongyu
 * @create 19-10-14
 */
public class BLogo implements Logo {

  @Override
  public void logo() {
    System.out.println("我是B汽车Logo");
  }
}
