package com.wangxu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExceptionDemo5 {

    public static void main(String[] args)  {
//        try {
//            show2();
//        } catch (Exception e) {
//            e.printStackTrace(); // 打印异常
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("程序开始");
        try {
            show();
            show2();
        } catch (Exception e) {
            e.printStackTrace(); // 打印异常
            System.out.println("出现异常");
        }
        System.out.println("程序结束");
    }

    //    public static void show2() throws ParseException, FileNotFoundException {
    public static void show2() throws Exception {
        String str = "2024-07-09 11:12:13";
        // 把字符串时间解析成Java中的一个日期对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date =  sdf.parse(str); // 编译时异常,提醒程序员这里的程序很容易出问题,请您注意!
        new FileInputStream("D:/menv.png");
        System.out.println(date);
    };

    // 定义一个方法认识运行时异常
    public static void show (){
//        int []arr = { 1, 2, 3 };
//        System.out.println(arr[3]); // ArrayIndexOutOfBoundsException
//        System.out.println(10/0); // ArithmeticException
        String s = null;
        System.out.println(s.length()); // NullPointerException
    }
}
