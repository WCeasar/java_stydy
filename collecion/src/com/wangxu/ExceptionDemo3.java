package com.wangxu;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        try {
            setAge(1010);
        } catch (AgeIllegalException e) {
            e.printStackTrace();
            System.out.println("失败");
        }
    }

    public static void setAge(int age) throws AgeIllegalException {
        if (age < 0 || age > 100) {
            throw new AgeIllegalException("年龄不能小于零或者大于100");
        } else {
            System.out.println("年龄设置成功");
        }
    }
}
