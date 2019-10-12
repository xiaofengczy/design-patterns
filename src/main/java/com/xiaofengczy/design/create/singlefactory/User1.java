package com.xiaofengczy.design.create.singlefactory;

/**
 * FileName: User1 Description:
 *
 * @author caozhongyu
 * @create 19-10-11
 */
public class User1 {
  private User1(){

  }
  private static User1 instance = null;

  public static User1 getInstance(){
    if(null==instance){
      synchronized (User1.class){
        if(null==instance){
          instance = new User1();
        }
      }
    }
    return instance;
  }
}
