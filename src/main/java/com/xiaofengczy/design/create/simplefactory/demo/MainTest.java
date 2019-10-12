package com.xiaofengczy.design.create.simplefactory.demo;

/**
 * FileName: MainTest Description:
 *
 * @author caozhongyu
 * @create 19-10-11
 */
public class MainTest {

  public static void main(String[] args) {
    Arithmetic plus = ArithmeticFactory.getArithmetic("+");
    double calute = plus.calute(1, 2);
    System.out.println(calute);

    Arithmetic division = ArithmeticFactory.getArithmetic("/");
    calute = division.calute(1, 0);
    System.out.println(calute);

  }
}
