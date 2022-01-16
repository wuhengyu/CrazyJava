package com.crazy.learn;

/**
 * @Description: 方法重载
 * @Author Walter
 * @Date 2021/8/28 21:01
 * @Version 1.0
 */


//如果同一个类中包含了两个或两个以上方法的方法名相同，但形参列表不同，则被称为方法重载
public class Overload {
    public void test() {
        System.out.println("无参数");
    }

    public void test(String msg) {
        System.out.println("有参数" + msg);
    }

    public static void main(String[] args) {
        var ol = new Overload();
        ol.test();
        ol.test("重名重载方法");
    }
}
