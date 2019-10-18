package com.xiaofengczy.design.create.abstractfactory.demo;

/**
 * FileName: MysqlFactory Description:
 *
 * @author caozhongyu
 * @create 19-10-14
 */
public class MysqlFactory implements DBFactory {

  @Override
  public IUser createIUser() {
    return new MysqlIUser();
  }
}
