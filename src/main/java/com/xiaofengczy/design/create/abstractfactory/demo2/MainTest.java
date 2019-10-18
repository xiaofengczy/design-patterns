package com.xiaofengczy.design.create.abstractfactory.demo2;

/**
 * FileName: MainTest Description:
 *
 * @author caozhongyu
 * @create 19-10-14
 */
public class MainTest {

  public static void main(String[] args)
      throws IllegalAccessException, InstantiationException, ClassNotFoundException {
    CarFactory factory = AbstractCarFactory
        .getFactory("com.xiaofengczy.design.create.abstractfactory.demo2.AFactory");
    Engine engine = factory.getEngine();
    engine.engine();
    Logo logo = factory.getLogo();
    logo.logo();

    CarFactory factory1 = AbstractCarFactory
        .getFactory("com.xiaofengczy.design.create.abstractfactory.demo2.BFactory");
    Engine engine1 = factory1.getEngine();
    engine1.engine();
    Logo logo1 = factory1.getLogo();
    logo1.logo();
  }
}
