package com.crazy.learn;

/**
 * @Description:
 * @Author Walter
 * @Date 2021/12/25 0:24
 * @Version 1.0
 */
public class ReturnThis {
    public int age;

    public ReturnThis grow() {
        age++;
        return this;
    }

    public static void main(String[] args) {
        var rt = new ReturnThis();
        rt.grow().grow().grow();
        System.out.println(rt.age);
    }
}
