package com.wangxu.innerclass;

public class InnerClassDemo1 {

    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}
