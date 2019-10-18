package com.xiaofengczy.design.create.abstractfactory.demo2;

/**
 * FileName: CarFactory Description:
 *
 * @author caozhongyu
 * @create 19-10-14
 */
public interface CarFactory {

  Engine getEngine();

  Logo getLogo();
}
