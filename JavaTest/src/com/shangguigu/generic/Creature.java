package com.shangguigu.generic;

public class Creature<T> {
    int age;
    T name;

    public Creature(){

    }

    public Creature(int age, T name) {
        this.age = age;
        this.name = name;
    }
}
