package com.crazy.learn;

/**
 * @Description:
 * @Author Walter
 * @Date 2021/12/12 23:15
 * @Version 1.0
 */
public class MethodCall {

    public static void staticClass1() {
        System.out.println("staticClass1");
    }

    public static void staticClass2() {
        staticClass1();
    }

    public static void staticClass3() {
        System.out.println("static修饰的方法中不能使用this引用");
//        this.staticClass1();
    }

    public void disStaticClass1() {
        System.out.println("disStaticClass1");
    }

    public void disStaticClass2() {
        disStaticClass1();
    }

    public void disStaticClass3() {
        this.disStaticClass1();
    }

    public static void main(String[] args) {
        MethodCall whydemo1 = new MethodCall();

        staticClass2();
        staticClass3();
//        不建议使用实例调用，建议使用类调用
        whydemo1.staticClass2();
        whydemo1.staticClass3();
        MethodCall.staticClass2();
        MethodCall.staticClass3();

//        需要实例调用
//        disStaticClass2();
//        disStaticClass3();
        whydemo1.disStaticClass2();
        whydemo1.disStaticClass3();
//        需要实例调用
//        MethodCall.disStaticClass2();
//        MethodCall.disStaticClass3();
    }

}
