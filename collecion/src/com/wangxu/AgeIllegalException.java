package com.wangxu;


/**
 * 自定义编译时异常
 * 1. 继承Exception做爸爸,
 * 2. 重写Exception构造器
 * 3. 哪里需要这个异常就在哪里抛(throw)
 */
public class AgeIllegalException extends Exception {
    public AgeIllegalException() {
    }

    public AgeIllegalException(String message) {
        super(message);
    }
}
