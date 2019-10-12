package com.xiaofengczy.design.create.abstractfactory;

import sun.plugin2.gluegen.runtime.CPU;

/**
 * FileName: ComputerFactory Description:
 *
 * @author caozhongyu
 * @create 19-10-11
 */
public interface ComputerFactory {
  CPU makeCpu();

  MainBoard makeMainBoard();
}
