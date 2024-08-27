package com.wangxu.innerclass;

// 外部类
public class Outer {
    // 成员内部类: 无static修饰,属于外部类的对象持有的
    private int age = 10;
    private  static int gender = 1;

    public void test() {

    }

    static public void test1() {

    }

    public class Inner {

        private String name;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public Inner() {
            // 不能访问
            System.out.println("Inner() name = " + name);
        }

        public Inner(String name) {
            this.name = name;
            System.out.println("Inner(String name)");
        }

        public void show() {
            System.out.println(name);
            System.out.println("show");
            System.out.println(age); // 访问外部类的实例成员
            System.out.println(gender); // 访问外部类的静态成员
            test(); // 调用外部类的实例方法
            test1(); // 调用外部类的静态方法
            System.out.println(this); // 自己的对象
            System.out.println(Outer.this); // 寄生的外部类对象
        }


    }
}
