package com.xiaofengczy.design.create.abstractfactory.demo;

/**
 * FileName: OracleUser Description:
 *
 * @author caozhongyu
 * @create 19-10-14
 */
public class OracleUser implements IUser {

  @Override
  public void addUser(User user) {
    System.out.println("向oracle数据库插入用户");
  }

  @Override
  public User getUser(Integer userId) {
    System.out.println("从oracle数据库获取用户");
    return null;
  }
}
