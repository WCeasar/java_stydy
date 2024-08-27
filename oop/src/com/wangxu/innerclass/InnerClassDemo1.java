package com.wangxu.innerclass;

public class InnerClassDemo1 {

    public static void main(String[] args) {
        // 外部类名称.内部内名称 对象名 = new 外部内名称().new 内部类名称()
        Outer.Inner inner = new Outer().new Inner();
        inner.setName("王麻子");
        inner.show();

        // 1. 成员内部类可以直接访问外部类的静态成员和实例成员
        // 2. 成员内部类的实例方法中,可以直接拿到当前寄生的外部类对象
        // 3.
    }
}