package com.xiaofengczy.design.create.singlefactory;

/**
 * FileName: IUser Description:
 *
 * @author caozhongyu
 * @create 19-10-11
 */
public class User {

  private User(){}

  private static User instance = new User();

  public static User getInstance(){
    System.out.println("创建用户对象");
    return instance;
  }

}
