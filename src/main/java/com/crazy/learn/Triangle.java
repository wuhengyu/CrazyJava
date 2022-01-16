package com.crazy.learn;

/**
 * @Description: 实现Shape所有的抽象方法
 * @Author Walter
 * @Date 2021/8/29 22:23
 * @Version 1.0
 */
public class Triangle extends Shape {

    private double a, b, c;

    @Override
    public double calPerimeter() {
        return 0;
    }

    @Override
    public String getType() {
        return null;
    }

    private Triangle(String color, double a, double b, double c) {
        super(color);
    }
}
