package com.xiaofengczy.design.structural.strategy.demo01;

/**
 * @author caozhongyu
 * @FileName: AStrategy
 * @Description:
 * @create 19-10-22
 */
public class AStrategy implements AlgorithmStrategy{

  @Override
  public void algorithm() {
    System.out.println("A算法计算公式");
  }
}
