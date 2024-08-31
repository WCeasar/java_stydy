package com.wangxu.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();

        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");


        System.out.println(strings.get(0));

        String remove = strings.remove(3);
        System.out.println(remove);

        System.out.println(strings);

    }
}
