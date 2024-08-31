package com.wangxu;

import java.sql.SQLOutput;

public class ExceptionDemo2 {
    public static void main(String[] args) {
        try {
            System.out.println(div(10, 1));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("出现异常");
        }
    }

    // 需求: 求两个数的除的结果,并返回这个数
    public static int div(int a, int b) throws Exception {
        if (b == 0) {
            throw new Exception("除数不能为0"); // 有些方法可以返回一个异常让函数设计更合理
        }
        return a / b;
    }
}
