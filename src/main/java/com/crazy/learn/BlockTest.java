package com.crazy.learn;

/**
 * @Description: 代码块局部变量
 * @Author Walter
 * @Date 2021/8/29 13:37
 * @Version 1.0
 */
public class BlockTest {

    public static void main(String[] args) {
        {
            int a;
//        System.out.println("方法局部变量和代码块局部变量指定初始值，否则不可以访问它们" + a);
            a = 5;
            System.out.println(a);
        }
//        System.out.println("只要离开了代码块局部变量所在的代码块，这个局部变量就立即被销毁，变为不可见。" + a);
    }
}
