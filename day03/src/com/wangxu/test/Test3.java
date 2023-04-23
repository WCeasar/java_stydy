package com.wangxu.test;

public class Test3 {
    /**
     * 某小伙想定一份外卖，商家的优惠方式如下：鱼香肉丝单点24元，油炸花生米单点8元，米饭单点3元。
     * 订单满30元8折优惠。鱼香肉丝优惠价16元，但是优惠价和折扣不能同时使用。那么这个小伙要点这三样东西，最少要花多少钱？
     */
    public static void main(String[] args) {
        double fish = 24;
        double peanut = 8;
        double meal = 3;

        double discountFish = 16;
        double oneFinalPrice = (fish + peanut + meal) >= 30 ? (fish + peanut + meal) * 0.8 : (fish + peanut + meal);
        double twoFinalPrice = discountFish + peanut + meal;

        System.out.println(oneFinalPrice);
        System.out.println(twoFinalPrice);

        double lowPrice = (twoFinalPrice < oneFinalPrice) ? twoFinalPrice : oneFinalPrice;
        System.out.println(lowPrice);
    }
}
