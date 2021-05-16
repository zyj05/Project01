package com.zyj.java;

import java.util.ArrayList;
import java.util.List;

public class Helloworld {
    public static void main(String[] args) {
        System.out.println("hello world!");
        System.out.println("hello");

        List list = new ArrayList();

        list.add(123);
        list.add(456);
        list.add(789);

        for (Object o : list) {
            System.out.println(o);
        }
    }
}
