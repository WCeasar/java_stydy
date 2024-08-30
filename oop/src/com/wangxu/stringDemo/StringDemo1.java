package com.wangxu.stringDemo;

import java.util.Scanner;

public class StringDemo1 {
    public static void main(String[] args) {
        // 1. 直接用""就可以创建字符串对象,封装字符串数据
        String s1 = "hello";
        System.out.println(s1);

        System.out.println(s1.length());

        // 2. 通过构造器初始化独享
        String s2 = new String();
        System.out.println(s2);

        String s3 = new String("hello");
        System.out.println(s3);

        char[] chars = { 'h', 'e', 'l', 'l', 'o' };
        String s4 = new String(chars);
        System.out.println(s4);

        byte[] bytes = { 97, 98, 99, 100, 101 };
        String s5 = new String(bytes);
        System.out.println(s5);

        // 只要以"..."创建的字符串对象, 就会放到字符串常量池里去,相同内容只放一份
        // new对象方式会放到堆内存中去,每份都会不一样

//        String okLoginName = "admin";
//
//        System.out.println("请输入您的登陆名称: ");
//        Scanner scanner = new Scanner(System.in);
//        String LoginName = scanner.next();
//
//        // 字符串对象的内容比较, 不要用==, ==比较的是地址,字符串对象内容一样时地址不一定一样
//        // 判断你字符串内容,建议用String提供的equals方法,只关心内容一样,就返回true,并不关心地址
//        if(okLoginName.equals(LoginName)) {
//            System.out.println("登陆成功");
//        } else {
//            System.out.println("登陆失败");
//        }

        String mobile = "13022221111";
        System.out.println(mobile.substring(0, 3) + "****" + mobile.substring(7));


    }
}
