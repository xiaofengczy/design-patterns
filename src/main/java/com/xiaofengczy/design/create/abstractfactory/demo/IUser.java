package com.xiaofengczy.design.create.abstractfactory.demo;

/**
 * FileName: IUser Description:
 *
 * @author caozhongyu
 * @create 19-10-14
 */
public interface IUser {

  void addUser(User user);

  User getUser(Integer userId);

}
