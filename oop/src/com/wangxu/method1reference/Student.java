package com.wangxu.method1reference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    // 姓名 年龄 身高 性别
    private String name;
    private int age;
    private double height;
    private String gender;

    static int compare(Student o1, Student o2) {
        return o2.getAge() - o1.getAge();
    }

     int compare2(Student o1, Student o2) {
        return Double.compare(o1.getHeight(), o2.getHeight());
    }
}
