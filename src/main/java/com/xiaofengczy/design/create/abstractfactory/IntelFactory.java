package com.xiaofengczy.design.create.abstractfactory;

import sun.plugin2.gluegen.runtime.CPU;

/**
 * FileName: IntelFactory Description:
 *
 * @author caozhongyu
 * @create 19-10-11
 */
public class IntelFactory implements ComputerFactory {

  @Override
  public CPU makeCpu() {
    return new IntelComputer();
  }

  @Override
  public MainBoard makeMainBoard() {
    return new IntelMainBoard();
  }
}
