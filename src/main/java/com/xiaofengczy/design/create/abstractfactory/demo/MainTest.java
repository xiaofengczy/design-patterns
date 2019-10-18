package com.xiaofengczy.design.create.abstractfactory.demo;


/**
 * FileName: MainTest Description:
 *
 * @author caozhongyu
 * @create 19-10-14
 */
public class MainTest {

  public static void main(String[] args)
      throws IllegalAccessException, InstantiationException, ClassNotFoundException {
    User user = new User();
    IUser iUser1 = DataFactory
        .createUser("com.xiaofengczy.design.create.abstractfactory.demo.MysqlIUser");
    iUser1.addUser(user);
    iUser1.getUser(1);

    IUser iUser2 = DataFactory
        .createUser("com.xiaofengczy.design.create.abstractfactory.demo.OracleUser");
    iUser2.addUser(user);
    iUser2.getUser(2);
  }

}
