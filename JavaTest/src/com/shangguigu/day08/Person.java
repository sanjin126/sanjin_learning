package com.shangguigu.day08;

public class Person {
    String name;
    int age;
    int sex;

    public void study(){
        System.out.println("我在学习！");
    }

    public void showAge(){
        System.out.println("我"+age+"岁");
    }

    public int addAge(int i){
        age += i;
        return age;
    }
}
