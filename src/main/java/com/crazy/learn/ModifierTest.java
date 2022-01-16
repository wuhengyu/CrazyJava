package com.crazy.learn;

/**
 * @Description: 尝试操作和访 问该对象的age和name两个实例变量
 * @Author Walter
 * @Date 2022/1/16 21:00
 * @Version 1.0
 */
public class ModifierTest {
    public static void main(String[] args) {
        var m = new Modifier();
//        age成员变量被隐藏，无法访问
        m.setAge(1000);
        System.out.println(m.getAge());
        m.setAge(10);
        System.out.println("成功设置Age" + m.getAge());

        m.setName("测试测试测试测试");
        System.out.println(m.getName());
        m.setName("测试");
        System.out.println("成功设置Name" + m.getName());
    }
}
