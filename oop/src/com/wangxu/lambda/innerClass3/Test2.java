package com.wangxu.lambda.innerClass3;

public class Test2 {
    // 匿名内部类在开发中的常见形式: 通常作为一个对象参数传输给方法
    // 需求: 学生, 老师要参加游泳比赛
    public static void main(String[] args) {
        Swimming s1 = new Swimming() {
            @Override
            public void swim() {
                System.out.println("老师开始参加游泳比赛");
            }
        };

        go(s1);

        go(new Swimming() {
            @Override
            public void swim() {
                System.out.println("学生开始参加游泳比赛");
            }
        });
    }


    public static void go(Swimming s) {
        System.out.println("开始游泳");
        s.swim();
        System.out.println("结束游泳");
    }

    public interface Swimming {
        void swim();
    }
}

