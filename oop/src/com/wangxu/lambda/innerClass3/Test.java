package com.wangxu.lambda.innerClass3;

public class Test {
    public static void main(String[] args) {
        // 匿名内部类本质上就是一个子类, 并会立即创建出一个子类对象
        // 用于更方便的创建一个子类对象

        // 匿名内部类其实是有名字的 父类名$1
        new Animal() {
            @Override
            public void cry() {
                System.out.println("猫 的叫声 喵喵");
            }
        }.cry();
    }
}
