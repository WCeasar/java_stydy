package com.wangxu.lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {
        // lambda只能简化函数式接口的匿名内部类

        Swim s1 = () -> {
            System.out.println("swimming");
        };

        s1.swiming();
    }
}


// 函数式接口: 有且仅有一个抽象方法的接口
// 上面可能有歌@FunctionInterface注解(也可以没有这个注解), 该注解用于约束当前接口必须是函数式接口

@FunctionalInterface
interface Swim {
     void swiming();
}