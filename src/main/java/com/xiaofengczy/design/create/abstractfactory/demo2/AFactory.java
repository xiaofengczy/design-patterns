package com.xiaofengczy.design.create.abstractfactory.demo2;

/**
 * FileName: AFactory Description:
 *
 * @author caozhongyu
 * @create 19-10-14
 */
public class AFactory implements CarFactory{


  @Override
  public Engine getEngine() {
    return new AEngine();
  }

  @Override
  public Logo getLogo() {
    return new ALogo();
  }
}
