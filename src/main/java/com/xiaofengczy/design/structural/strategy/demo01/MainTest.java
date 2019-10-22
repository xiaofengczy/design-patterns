package com.xiaofengczy.design.structural.strategy.demo01;

/**
 * @author caozhongyu
 * @FileName: MainTest
 * @Description:
 * @create 19-10-22
 */
public class MainTest {

  public static void main(String[] args) throws Exception {
    StrategyContent ca = new StrategyContent(new AStrategy());
    ca.calculat();

    StrategyContent cb = new StrategyContent(new BStrategy());
    cb.calculat();

    //使用工厂模式加反射实现
    AlgorithmStrategy strategyA = StrategyFactory
        .getStrategy("com.xiaofengczy.design.structural.strategy.demo01.AStrategy");
    strategyA.algorithm();

    AlgorithmStrategy strategyB = StrategyFactory
        .getStrategy("com.xiaofengczy.design.structural.strategy.demo01.BStrategy");
    strategyB.algorithm();

  }
}
