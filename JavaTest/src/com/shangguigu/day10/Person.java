package com.shangguigu.day10;

public class Person {

    private String name;
    private int age;

    public Person(){

    }

    public Person(int age){
        this.age = age;
    }

    public Person(String name){
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age){
        if(age < 0 || age > 130){
            System.out.println("错误年龄");
            return;
        }
        this.age = age;
    }


}
