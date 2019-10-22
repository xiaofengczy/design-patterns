package com.xiaofengczy.design.create.singlefactory;

import java.io.Serializable;

/**
 * FileName: IUser Description:
 *
 * @author caozhongyu
 * @create 19-10-11
 */
public class User implements Serializable {

  private User(){
//    if(instance!=null){
//      throw new RuntimeException();
//    }
  }

  private static User instance = new User();

  public static User getInstance(){
    System.out.println("创建用户对象");
    return instance;
  }

  private Object readResolve(){
    return instance;
  }

}
