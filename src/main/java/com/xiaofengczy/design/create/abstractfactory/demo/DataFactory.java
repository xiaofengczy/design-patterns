package com.xiaofengczy.design.create.abstractfactory.demo;

/**
 * FileName: DataFactory Description:
 *
 * @author caozhongyu
 * @create 19-10-14
 */
public class DataFactory {

  public static IUser createUser(String clazzName)
      throws ClassNotFoundException, IllegalAccessException, InstantiationException {
    Class<?> aClass = Class.forName(clazzName);
    return (IUser) aClass.newInstance();
  }
}
