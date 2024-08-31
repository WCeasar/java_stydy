package com.wangxu;

public class ExceptionDemo4 {
    public static void main(String[] args) {
        try {
            setAge(1010);
        } catch (AgeIllegalRuntimeException e) {
//           e.printStackTrace();
        }
    }

    public static void setAge(int age) throws AgeIllegalRuntimeException {
        if (age < 0 || age > 100) {
            throw new AgeIllegalRuntimeException("年龄不能小于零或者大于100");
        } else {
            System.out.println("年龄设置成功");
        }
    }
}
