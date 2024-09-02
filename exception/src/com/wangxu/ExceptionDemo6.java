package com.wangxu;

import java.util.Scanner;

public class ExceptionDemo6 {
    public static void main(String[] args) {
        System.out.println("程序开始");
        double price = 0;
        while (true) {
            try {
                price = inputPrice();
                System.out.println("价格为:" + price);
                break;
            } catch (Exception e) {
                System.out.println("输入价格格式错误");
            }
        }
        System.out.println("程序结束");
    }

    public static double inputPrice() {
        System.out.println("请输入价格:");
        Scanner scanner = new Scanner(System.in);
        double price = scanner.nextDouble();
        return price;
    }
}
