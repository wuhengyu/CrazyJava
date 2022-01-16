package com.crazy.learn;

/**
 * @Description: 局部变量会覆盖成员变量, 则可使用this作为调用者来限定访问成员变量
 * @Author Walter
 * @Date 2021/8/29 20:03
 * @Version 1.0
 */
public class VariableOverrideTest {

    public String name = "邓紫棋";
    public static double price = 100;

    public void info() {
//        同名局部变量覆盖成员实例变量
        var name = "李健";
        System.out.println("同名时使用局部变量:" + name);
        System.out.println("同名时使用成员实例成员变量:" + this.name);
    }

    public static void main(String[] args) {
//        同名局部变量覆盖成员类变量
        var price = 101;
        System.out.println("同名时使用局部变量:" + price);
//        类调用同名成员类变量
        System.out.println("同名时使用类static变量:" + VariableOverrideTest.price);
        new VariableOverrideTest().info();
    }
}
