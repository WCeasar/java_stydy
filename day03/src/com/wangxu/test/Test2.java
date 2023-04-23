package com.wangxu.test;

public class Test2 {
    /**
     * 红茶妹妹有21元钱，她攒了几天钱之后自己的钱比原来的两倍还多三块。
     * 绿茶妹妹有24元钱，她攒了几天钱之后自己的钱正好是原来的两倍。那么红茶和绿茶现在的钱一样多，请问对么？
     */
    public static void main(String[] args) {
        double redTeaMoney = 21;
        double greenTeaMoney = 24;

        double finalRedTeaMoney = redTeaMoney * 2 + 3;
        double finalGreenMoney = greenTeaMoney * 2;

        System.out.println(finalRedTeaMoney + " " + finalGreenMoney + " " + (finalRedTeaMoney == finalGreenMoney));
    }
}
