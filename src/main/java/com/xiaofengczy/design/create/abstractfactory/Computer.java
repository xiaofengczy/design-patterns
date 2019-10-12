package com.xiaofengczy.design.create.abstractfactory;

import sun.plugin2.gluegen.runtime.CPU;

/**
 * FileName: Computer Description:
 *
 * @author caozhongyu
 * @create 19-10-11
 */
public class Computer {

  private CPU cpu;

  private MainBoard mainBoard;

  private Computer(CPU cpu, MainBoard mainBoard) {
    this.cpu = cpu;
    this.mainBoard = mainBoard;
  }

  public static CpuBuilder builder(){
    return new CpuBuilder();
  }

  public static class CpuBuilder{
    private  CPU cpu;
    private MainBoard mainBoard;
    private CpuBuilder(){}

    public CpuBuilder cpu(CPU cpu){
      this.cpu = cpu;
      return this;
    }

    public CpuBuilder mainBoard(MainBoard mainBoard){
      this.mainBoard = mainBoard;
      return this;
    }

    public Computer build(){
      return new Computer(cpu, mainBoard);
    }

  }

}
