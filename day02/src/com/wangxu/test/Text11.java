package com.wangxu.test;

public class Text11 {
    /**
     * ************************
     * 我的姓名是：张三
     * 我的性别是：男
     * 我的年龄是：18
     * 我的地址是：xx省xx市
     * 我的饭卡余额是：55.55元
     * ************************
     */
    public static void main(String[] args) {
        String name = "张三";
        String gender = "男";
        int age = 18;
        String address = "xx省xx市";
        double balance = 55.55;

        System.out.println("************************");
        System.out.println("我的姓名是：" + name);
        System.out.println("我的性别是：" + gender);
        System.out.println("我的年龄是：" + age);
        System.out.println("我的地址是：" + address);
        System.out.println("我的饭卡余额是：" + balance + "元");
        System.out.println("************************");
    }
}
