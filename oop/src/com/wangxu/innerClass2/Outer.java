package com.wangxu.innerClass2;

// 外部类
public class Outer {
    // 静态内部类: 属于外部类持有
    static private int age = 1;
    private int gender;

    public static class Inner {
        private String name;

        public Inner(String name) {
            this.name = name;
        }

        public Inner() {
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void show() {
            System.out.println(age); // 静态内部类可以访问到外部类的静态成员
            //  System.out.println(gender); // 静态内部类不可以访问到外部类的实例成员 外部类的实例成员属于外部类的对象的,而静态内部类属于外部类的类本身
        }
    }
}
