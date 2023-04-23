package com.wangxu.demo;

public class Demo4 {
    /**
     * int i = 10;
     * long n = 20L;
     * ??? result = i + n;
     * 问变量result是什么类型的？
     */
    public static void main(String[] args) {
        int i = 10;
        long n = 20L;
        long result = i + n;
        // long 类型  取值范围小的，和取值范围大的进行运算，小的会先提升为大的，再进行运算。 因此就是两个long类型的数据相加, 最后得出的类型是long
    }
}
