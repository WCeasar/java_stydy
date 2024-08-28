package com.wangxu.method1reference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Demo4 {
    public static void main(String[] args) {
//        1.
//        CarFactory cf = new CarFactory() {
//            @Override
//            public Car getCar(String name) {
//                return new Car(name);
//            }
//        };

//        2.
//        CarFactory cf = (name) -> new Car(name;

//        3.
        // 如果某个Lambda表达式里只是在创建对象，并且“→”前后参数情况一致，就可以使用构造器引用。
        CarFactory cf = Car::new;

        Car c = cf.getCar("奔驰");
        System.out.println(c.toString());
    }
}


@FunctionalInterface
interface CarFactory {
    Car getCar(String name);
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Car {
    private String name;
}