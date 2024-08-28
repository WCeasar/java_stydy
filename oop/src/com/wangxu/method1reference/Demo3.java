package com.wangxu.method1reference;

import java.util.Arrays;

public class Demo3 {

    public static void main(String[] args) {
        String[] names = {"张三", "李四", "王五", "赵六", "田七", "钱八", "angle", "hello", "Rose", "Boss", "Andy"};

//        如果某个Lambda表达式里只是调用一个特定类型的实例方法，并且前面参数列表中的第一个参数是作为方法的主调，后面的所有参数都是作为该实例方法的入参的，则此时就可以使用特定类型的方法引用
        Arrays.sort(names, String::compareToIgnoreCase);
        System.out.println(Arrays.toString(names));
    }
}
