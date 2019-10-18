package com.xiaofengczy.design.create.abstractfactory.demo;


/**
 * FileName: MysqlIUser Description:
 *
 * @author caozhongyu
 * @create 19-10-14
 */
public class MysqlIUser implements IUser {

  @Override
  public void addUser(User user) {
    System.out.println("向mysql插入一条用户数据");
  }

  @Override
  public User getUser(Integer userId) {
    System.out.println("获取一条mysql用户数据");
    return null;
  }
}
