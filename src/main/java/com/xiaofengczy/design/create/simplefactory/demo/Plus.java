package com.xiaofengczy.design.create.simplefactory.demo;

/**
 * FileName: Plus Description:
 *
 * @author caozhongyu
 * @create 19-10-11
 */
public class Plus implements Arithmetic {

  @Override
  public double calute(double arg1, double arg2) {
    return arg1 + arg2;
  }
}
