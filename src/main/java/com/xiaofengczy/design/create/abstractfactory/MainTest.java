package com.xiaofengczy.design.create.abstractfactory;

import sun.plugin2.gluegen.runtime.CPU;

/**
 * FileName: MainTest Description:
 *
 * @author caozhongyu
 * @create 19-10-11
 */
public class MainTest {

  public static void main(String[] args) {
    AMDFactory amdFactory = new AMDFactory();
    CPU cpu = amdFactory.makeCpu();
    MainBoard mainBoard = amdFactory.makeMainBoard();
    Computer computer = Computer.builder().cpu(cpu).mainBoard(mainBoard).build();
    System.out.println(computer);
  }

}
