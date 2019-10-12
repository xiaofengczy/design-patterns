package com.xiaofengczy.design.create.simplefactory.demo;


/**
 * FileName: Division Description:
 *
 * @author caozhongyu
 * @create 19-10-11
 */
public class Division implements Arithmetic {

  @Override
  public double calute(double arg1, double arg2) {
    if (0==arg2){
      throw new RuntimeException("除数不能为0");
    }
    return arg1 / arg2;
  }
}
