package com.xiaofengczy.design.create.simplefactory.demo;

/**
 * FileName: Multiplication Description:
 *
 * @author caozhongyu
 * @create 19-10-11
 */
public class Multiplication implements Arithmetic {

  @Override
  public double calute(double arg1, double arg2) {
    return arg1 * arg2;
  }
}
