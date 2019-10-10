package com.xiaofengczy.design.create.factory;

/**
 * FileName: MainTest Description:
 *
 * @author caozhongyu
 * @create 19-10-10
 */
public class MainTest {

  public static void main(String[] args) {
    BMWFactory bmwFactory = new BMWFactory();
    bmwFactory.makeCar("x1");

    BJFactory bjFactory = new BJFactory();
    bjFactory.makeCar("x2");
  }

}
