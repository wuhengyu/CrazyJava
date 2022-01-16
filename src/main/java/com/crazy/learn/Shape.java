package com.crazy.learn;

/**
 * @Description: 抽象类
 * @Author Walter
 * @Date 2021/8/29 22:04
 * @Version 1.0
 */
public abstract class Shape {
    {
        System.out.println("执行Shape的初始化块");
    }

    private String color;

    public abstract double calPerimeter();

    public abstract String getType();

    public Shape() {
    }

    ;

    public Shape(String color) {
        System.out.println("执行Shape的构造器");
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
