package com.xiaofengczy.design.create.abstractfactory;

import sun.plugin2.gluegen.runtime.CPU;

/**
 * FileName: AMDFactory
 * Description:
 *
 * @author caozhongyu
 * @create 19-10-11
 */
public class AMDFactory implements ComputerFactory {

  @Override
  public CPU makeCpu() {
    System.out.println("使用amdcpu");
    return new Amdcpu();
  }

  @Override
  public MainBoard makeMainBoard() {
    System.out.println("使用amdboard");
    return new AMDBoard();
  }
}
