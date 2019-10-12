package com.xiaofengczy.design.create.simplefactory.demo;

/**
 * FileName: ArithmeticFactory Description: 算法父类
 *
 * @author caozhongyu
 * @create 19-10-11
 */
public class ArithmeticFactory {

  public static Arithmetic getArithmetic(String operator){
    switch (operator){
      case "+":
        return new Plus();
      case "-":
        return new Substruction();
      case "*":
        return new Multiplication();
      case "/":
        return new Division();
      default:
        throw new RuntimeException("输入运算符有误");
    }
  }
}
