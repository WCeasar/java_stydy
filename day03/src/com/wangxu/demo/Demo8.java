package com.wangxu.demo;

public class Demo8 {
    public static void main(String[] args) {
        char c = 'a'; // 97
        int result = c + 0; // 97
        System.out.println(result);// 当+操作中出现了字符，会拿着字符到计算机内置的ASCII码表中去查对应的数字，然后再进行计算。
    }
}
