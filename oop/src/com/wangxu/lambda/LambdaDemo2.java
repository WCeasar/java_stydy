package com.wangxu.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaDemo2 {
    // 目标: 完成给数组排序, 理解其中匿名内部类的用法
    // 准备一个学生类型的数组,存放6个学生对象
    public static void main(String[] args) {

        Student[] students = new Student[6];

        students[0] = new Student("张三", 18, 1.75, "男");
        students[1] = new Student("李四", 19, 1.85, "男");
        students[2] = new Student("王五", 20, 1.65, "女");
        students[3] = new Student("赵六", 21, 1.55, "女");
        students[4] = new Student("田七", 22, 1.75, "男");
        students[5] = new Student("钱八", 23, 1.85, "男");
        // 排序

        Arrays.sort(students, (s1, s2) ->
                s2.getAge() - s1.getAge()
        );

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
