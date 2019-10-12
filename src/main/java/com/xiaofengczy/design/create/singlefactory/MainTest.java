package com.xiaofengczy.design.create.singlefactory;

/**
 * FileName: MainTest Description:
 *
 * @author caozhongyu
 * @create 19-10-11
 */
public class MainTest {

  public static void main(String[] args) {
    User instance = User.getInstance();
    User instance1 = User.getInstance();
    System.out.println(instance==instance1);

    User1 instance2 = User1.getInstance();
    User1 instance3 = User1.getInstance();
    System.out.println(instance2==instance3);

    User2 instance4 = User2.getInstance();
    User2 instance5 = User2.getInstance();
    System.out.println(instance4==instance5);
  }

}
