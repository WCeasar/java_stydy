package com.wangxu.demo;

public class Demo6 {
    /**
     * byte b1 = 10;
     * byte b2 = 20;
     * ??? result = b1 + b2;//
     * 问变量result是什么类型的？
     */
    public static void main(String[] args) {
        byte b1 = 10;
        byte b2 = 20;
        int result = b1 + b2; // byte short char类型在计算的时候会转换成int类型计算,因此为int
    }
}
