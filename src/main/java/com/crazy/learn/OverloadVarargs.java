package com.crazy.learn;

/**
 * @Description: 重载形参个数可变的方法
 * @Author Walter
 * @Date 2021/8/29 0:08
 * @Version 1.0
 */

//不推荐重载形参个数可变的方法
public class OverloadVarargs {
    public void test(String msg) {
        System.out.println("只含有一个参数的方法:" + msg);
    }

    //    重载形参个数可变的方法时，不能通过直接传入一个字符串参数来调用，想传入一个字符串参数，则可采用传入字符串数组的形式
    public void test(String... books) {
        for (var temp : books
        ) {
            System.out.println("形参个数可变的方法:" + temp);
        }
    }

    public static void main(String[] args) {
        var olv = new OverloadVarargs();
//        调用test(String... books)
        olv.test();
//        重载test(String msg)
        olv.test("只含有一个参数");
//        调用test(String... books)
        olv.test("形参个数可变的方法1", "形参个数可变的方法2");
//        调用test(String... books)
        olv.test(new String[]{"形参个数可变的方法3", "形参个数可变的方法4"});
        olv.test(new String[]{"重载只有一个参数的形参个数可变的方法,可采用传入字符串数组的形式"});
    }
}
