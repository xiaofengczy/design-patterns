package com.xiaofengczy.design.structural.strategy.demo01;

/**
 * @author caozhongyu
 * @FileName: StrategyFactory
 * @Description:
 * @create 19-10-22
 */
public class StrategyFactory {

  public static AlgorithmStrategy getStrategy(String className) throws Exception {
    Class<?> aClass = Class.forName(className);
    AlgorithmStrategy algorithmStrategy = (AlgorithmStrategy) aClass.newInstance();
    return algorithmStrategy;
  }
}
