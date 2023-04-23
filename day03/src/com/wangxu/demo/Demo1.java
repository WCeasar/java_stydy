package com.wangxu.demo;

import java.util.Scanner;

public class Demo1 {
    // 需求：键盘录入一个三位数，将其拆分为个位、十位、百位后，打印在控制台
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个三位数:");
        int num = sc.nextInt();

        int ge = num%10;
        int shi = num/10%10;
        int bai = num/10/10%10;

        System.out.println("百位数为:" + bai + "十位数为:" + shi + "个位数为:" + ge );
    }
}
