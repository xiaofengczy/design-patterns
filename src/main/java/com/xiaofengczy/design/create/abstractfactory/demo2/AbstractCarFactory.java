package com.xiaofengczy.design.create.abstractfactory.demo2;

/**
 * FileName: AbstractCarFactory Description:
 *
 * @author caozhongyu
 * @create 19-10-14
 */
public class AbstractCarFactory {

  public static CarFactory getFactory(String clazzName)
      throws ClassNotFoundException, IllegalAccessException, InstantiationException {
    Class<?> aClass = Class.forName(clazzName);
    return (CarFactory) aClass.newInstance();
  }
}
