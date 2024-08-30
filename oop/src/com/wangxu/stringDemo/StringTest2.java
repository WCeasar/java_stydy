package com.wangxu.stringDemo;
import java.util.Random;
public class StringTest2 {

    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public static String generateRandomCode(int length) {
        Random random = new Random();
        StringBuilder code = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(CHARACTERS.length());
            code.append(CHARACTERS.charAt(index));
        }

        return code.toString();
    }

    public static void main(String[] args) {
        // 帮我生成一指定位数的随机验证码返回, 每位可能是大小写字母或者数字
        // 帮我用String变量记住全部要用到的字符
        int codeLength = 6; // 验证码的位数
        String randomCode = generateRandomCode(codeLength);
        System.out.println("Generated random code: " + randomCode);
    }
}
