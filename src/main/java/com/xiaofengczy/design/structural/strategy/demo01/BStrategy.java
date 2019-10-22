package com.xiaofengczy.design.structural.strategy.demo01;

/**
 * @author caozhongyu
 * @FileName: BStrategy
 * @Description:
 * @create 19-10-22
 */
public class BStrategy implements AlgorithmStrategy {

  @Override
  public void algorithm() {
    System.out.println("B算法计算公式");
  }
}
