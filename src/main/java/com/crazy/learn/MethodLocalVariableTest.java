package com.crazy.learn;

/**
 * @Description: 局部变量除形参之外，都必须显式初始化
 * @Author Walter
 * @Date 2021/8/29 13:43
 * @Version 1.0
 */
public class MethodLocalVariableTest {

    public void MethodLocalName(int methodLocalVariableTest) {
//        方法局部变量与形参也不能同名
//        int methodLocalVariableTest  = 1;
    }

    public static void main(String[] args) {
        int a;
//        System.out.println("方法局部变量需要指定初始值，否则不可以访问它们" + a);
        a = 5;
        System.out.println(a);
        {
            int a1 = 8;
        }
        {
            int a1 = 8;
        }
    }
}
