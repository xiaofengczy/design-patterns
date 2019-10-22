package com.xiaofengczy.design.create.builderfactory;

/**
 * @author caozhongyu
 * @FileName: User
 * @Description:
 * @create 19-10-22
 */
public class User {
  private String name;

  private String password;

  private String nickName;

  private int age;

  private User(String name, String password, String nickName, int age) {
    this.name = name;
    this.password = password;
    this.nickName = nickName;
    this.age = age;
  }

  public static UserBuilder builder(){
    return new UserBuilder();
  }

  private static class UserBuilder {
    private String name;

    private String password;

    private String nickName;

    private int age;

    private  UserBuilder() {
    }

    public UserBuilder name(String name){
      this.name = name;
      return this;
    }

    public UserBuilder nickName(String nickName){
      this.nickName = nickName;
      return this;
    }

    public UserBuilder password(String password){
      this.password = password;
      return this;
    }

    public UserBuilder age(int age){
      this.age = age;
      return this;
    }

    public User build(){
      return new User(name, password, nickName, age);
    }
  }

  @Override
  public String toString() {
    return "User{" +
        "name='" + name + '\'' +
        ", password='" + password + '\'' +
        ", nickName='" + nickName + '\'' +
        ", age=" + age +
        '}';
  }

  public static void main(String[] args) {
    User build = User.builder().name("张三").nickName("张小三").password("123456").age(18).build();
    System.out.println(build);
  }
}
