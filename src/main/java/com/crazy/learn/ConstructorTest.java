package com.crazy.learn;

/**
 * @Description: 构造器
 * @Author Walter
 * @Date 2021/8/23 0:41
 * @Version 1.0
 */
public class ConstructorTest {
    public String name;
    public int count;

    public ConstructorTest(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public static void main(String[] args) {
        var tc = new ConstructorTest("java学习", 888);
//        ConstructorTest tc = new ConstructorTest("java学习", 888);
        System.out.println(tc.name);
        System.out.println(tc.count);
    }
}
