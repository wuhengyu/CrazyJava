package com.crazy.learn;

/**
 * @Description: 形参个数可变的参数
 * @Author Walter
 * @Date 2021/8/28 15:18
 * @Version 1.0
 */
public class Varargs {

    public static void test1(int a, String... books) {

        for (var temp : books
        ) {
            System.out.println(temp);
        }
        System.out.println(a);
    }

    public static void test2(int a, String[] books) {

        for (var temp : books
        ) {
            System.out.println(temp);
        }
        System.out.println(a);
    }


    public static void main(String[] args) {
        test1(5);
        test1(5, "形参个数可变1");
        test1(5, "形参个数可变2", "形参个数可变3");
        test1(5, new String[]{"哈哈1"});
        test1(5, new String[]{"哈哈2", "哈哈3"});
        test2(50, new String[]{"我我", "们们"});
    }
}
