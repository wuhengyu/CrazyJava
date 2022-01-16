package com.crazy.learn;


/**
 * @Description: Java对于引用类型的参数传递，一样采用的是值传递方式
 * @Author Walter
 * @Date 2021/12/25 16:34
 * @Version 1.0
 */
class DataTransfer {
    int a;
    int b;
}

public class ParameterTransfer {
    //   swap引用了DataTransfer对象地址值
    public static void swap(DataTransfer dw) {
        var tmp = dw.a;
        dw.a = dw.b;
        dw.b = tmp;
        System.out.println("swap:" + dw.a + "," + dw.b);
//        不可再访问堆内存中的DataWraper对象
        dw = null;
    }

    public static void main(String[] args) {
//        main引用了DataTransfer对象地址值
        var dw = new DataTransfer();
        dw.a = 6;
        dw.b = 9;
        swap(dw);
        System.out.println("交换:" + dw.a + "," + dw.b);
    }

}
