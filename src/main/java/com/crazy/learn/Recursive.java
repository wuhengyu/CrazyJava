package com.crazy.learn;

/**
 * @Description: 数列递归计算
 * @Author Walter
 * @Date 2021/8/28 20:36
 * @Version 1.0
 */

/*已 知 有 一 个 数 列 ： f(0)=1 ， f(1)=4 ， f(n+2)=2*f(n+1)+f(n)，其中n是大于0的整数，求f(10)的值*/

/*对 于 fn(10) ， 即 等 于 2*fn(9)+fn(8) ， 其 中 fn(9) 又 等 于
2*fn(8)+fn(7)…… 依 此 类 推 ， 最 终 会 计 算 到 fn(2) 等 于
2*fn(1)+fn(0)，即fn(2)是可计算的，然后一路反算回去，就可以最
终得到fn(10)的值。*/

public class Recursive {
    public static int fn1(int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return 4;
        } else {
            return 2 * fn1(n - 1) + fn1(n - 2);
        }
    }

    public static int fn2(int m) {
        if (m == 20) {
            return 1;
        } else if (m == 21) {
            return 4;
        } else {
            return 2 * fn2(m - 1) + fn2(m - 2);
        }
    }

   /* 已知有一个数列：f(20)=1，
    f(21)=4，f(n+2)=2*f(n+1)+f(n)，其中n是大于0的整数，求f(10)的
    值。*/

/*    fn(10)等于
    fn(12)-2*fn(11)，而fn(11)等于fn(13)-2*fn(12)……
    依此类推，直 到fn(19)等于fn(21)-2*fn(20)*/

    public static int fn3(int k) {
        if (k == 20) {
            return 1;
        } else if (k == 21) {
            return 4;
        } else {
            return fn3(k + 2) - 2 * fn3(k + 1);

        }
    }

    public static void main(String[] args) {
//        向下已知方向递归
        System.out.println(fn1(10));
//        向下已知方向递归
        System.out.println(fn2(30));
//        向上已知方向递归
        System.out.println(fn3(10));
    }
}
