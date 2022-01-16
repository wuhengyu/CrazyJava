package com.crazy.learn;

/**
 * @Description:
 * @Author Walter
 * @Date 2021/12/12 23:32
 * @Version 1.0
 */
public class OverThisVar {
    public int foo;
    public int foo2;

    public OverThisVar() {
//        局部变量和成员变量重名时，使用this调用成员变量
        int foo = 0;
        this.foo = 6;
//        不重名时，无需使用this
        foo2 = 12;
    }

    public static void main(String[] args) {
        System.out.println(new OverThisVar().foo);
        System.out.println(new OverThisVar().foo2);
    }
}
