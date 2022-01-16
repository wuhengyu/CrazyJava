package com.crazy.learn;

/**
 * @Description: 成员变量对比
 * @Author Walter
 * @Date 2021/8/29 0:33
 * @Version 1.0
 */

class Person {
    public String Name;
    public static String staticName;

    public void setAge(int i) {
    }
}

public class PersonTest {
    public static void main(String[] args) {
//        System.out.println("类.普通变量，错误" + Person.Name);
        System.out.println("类.静态变量:" + Person.staticName);
        var p = new Person();
//        初始化前输出
        System.out.println("实例.普通变量:" + p.Name + ", 实例.静态变量:" + p.staticName);
//        初始化
        p.Name = "p.Name";
        p.staticName = "p.staticName";
//        初始化后输出
        System.out.println("类.静态变量:" + Person.staticName);
        System.out.println("实例.普通变量:" + p.Name + ", 实例.静态变量:" + p.staticName);

    }
}
