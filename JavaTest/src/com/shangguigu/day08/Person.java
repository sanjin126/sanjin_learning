package com.shangguigu.day08;

public class Person {
    String name;
    int age;
    int sex;

    public void study(){
        System.out.println("studying");
    }

    public void showAge(){
        System.out.println("我"+age+"岁");
    }

    public void addAge(){
        age += 2;
    }
}
