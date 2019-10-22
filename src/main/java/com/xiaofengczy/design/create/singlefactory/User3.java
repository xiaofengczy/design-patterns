package com.xiaofengczy.design.create.singlefactory;

/**
 * @author caozhongyu
 * @FileName: User3
 * @Description:
 * @create 19-10-22
 */
public class User3 {

  private User3(){}

  enum  User3Enum{
    INSTANCE;
    private User3 user3;

    User3Enum(){
      user3 = new User3();
    }
    public User3 getInstance(){
      return user3;
    }
  }

  public static User3 getInstance(){
    return User3Enum.INSTANCE.getInstance();
  }

}
