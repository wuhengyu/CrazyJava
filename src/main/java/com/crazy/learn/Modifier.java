package com.crazy.learn;

/**
 * @Description: 通过使用合理的访问控制符 来定义一个Person类，这个Person类实现了良好的封装
 * @Author Walter
 * @Date 2022/1/16 20:43
 * @Version 1.0
 */

/*该类的name和age两个成员变量只有 在Person类内才可以操作和访问，
在Person类之外只能通过各自对应 的setter和getter方法来操作和访问它们*/

public class Modifier {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
//        执行合理性校验，要求用户名必须在2-6位之间
        if (name.length() > 6 || name.length() < 2) {
            System.out.println("您设置的人名不符合要求");
//            return;
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
//        执行合理性校验，要求用户年龄必须在0-100之间
        if (age > 100 || age < 0) {
            System.out.println("您设置的年龄不合法");
//            return;
        } else {
            this.age = age;
        }
    }

}
