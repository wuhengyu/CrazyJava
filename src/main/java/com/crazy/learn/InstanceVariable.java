package com.crazy.learn;

/**
 * @Description: 实例也可访问类变量，同一个类的所有实例访问类变量时，实际上访问的是该类本身的同一个变量，访问了同一片内存区。
 * @Author Walter
 * @Date 2021/12/26 16:45
 * @Version 1.0
 */
public class InstanceVariable {

    public static double price;
    public int age;

    public static void main(String[] args) {

        var instanceVariable1 = new InstanceVariable();
        var instanceVariable2 = new InstanceVariable();

        instanceVariable1.age = 5;

        InstanceVariable.price = 10;
        instanceVariable1.price = 10;
        price = 100;

        System.out.println(instanceVariable1.age);
        System.out.println(price);

//        实例变量不初始化时，默认是0。
        System.out.println(instanceVariable2.age);

//        实例变量初始化
        instanceVariable2.age = 50;
        System.out.println(instanceVariable2.age);

//        所有实例访问的是同一类变量内存区
        System.out.println(instanceVariable2.price);
        System.out.println(InstanceVariable.price);

    }
}
