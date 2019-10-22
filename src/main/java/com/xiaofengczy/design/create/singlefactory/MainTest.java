package com.xiaofengczy.design.create.singlefactory;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * FileName: MainTest Description:
 *
 * @author caozhongyu
 * @create 19-10-11
 */
public class MainTest {

  public static void main(String[] args)
      throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, ClassNotFoundException, IOException {
    User instance = User.getInstance();
    User instance1 = User.getInstance();
    System.out.println(instance==instance1);

    User1 instance2 = User1.getInstance();
    User1 instance3 = User1.getInstance();
    System.out.println(instance2==instance3);

    User2 instance4 = User2.getInstance();
    User2 instance5 = User2.getInstance();
    System.out.println(instance4==instance5);

    //传统单例模式存在的常见问题
//    1.反射创建多个实例
    Class<User> aClass = (Class<User>) Class.forName("com.xiaofengczy.design.create.singlefactory.User");
    Constructor<User> declaredConstructor = aClass.getDeclaredConstructor(null);
    declaredConstructor.setAccessible(true);
    User user = declaredConstructor.newInstance();
    User user1 = declaredConstructor.newInstance();
    System.out.println(user==user1);

    //2.序列化破解问题

    FileOutputStream fos = new FileOutputStream("/home/zycao/Desktop/1.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(instance);
    oos.close();
    fos.close();
    ObjectInputStream ois = new ObjectInputStream(
        new FileInputStream("/home/zycao/Desktop/1.txt"));

    User u = (User) ois.readObject();
    System.out.println(instance==instance1);
    System.out.println(instance==u);


    System.out.println(User3.getInstance()== User3.getInstance());
  }

}
