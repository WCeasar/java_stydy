package com.wangxu.test;

public class Text10 {
    /**
     * 请根据下列描述，选用合适的数据类型定义变量，并输出变量的值。
     * 1、班级里有100个学员。
     * 2、某商品价格55.55元。
     * 3、地球已经诞生超过46亿年。
     * 4、“5是偶数”这句话的描述是假的。
     */
    public static void main(String[] args) {
        int stuNum = 100;
        double productPrice = 55.55;
        long earthBirth = 46000000000L;
        boolean flag = (5%2 == 0);
        System.out.println(stuNum);
        System.out.println(productPrice);
        System.out.println(earthBirth);
        System.out.println(flag);
    }
}
