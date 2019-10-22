package com.xiaofengczy.design.structural.strategy.demo01;

/**
 * @author caozhongyu
 * @FileName: StrategyContent
 * @Description:
 * @create 19-10-22
 */
public class StrategyContent {

  private AlgorithmStrategy strategy;

  public StrategyContent(AlgorithmStrategy strategy) {
    this.strategy = strategy;
  }

  public void calculat() {
    this.strategy.algorithm();
  }
}
