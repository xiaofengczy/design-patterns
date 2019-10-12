package com.xiaofengczy.design.create.singlefactory;

/**
 * FileName: User2 Description:
 *
 * @author caozhongyu
 * @create 19-10-11
 */
public class User2 {

  private User2(){}

  private static class Holder{
    private static User2  user2 = new User2();
  }
  public static User2 getInstance(){
    return Holder.user2;
  }
}
