package com.shangguigu.generic;

import org.junit.Test;

public class People<T> extends Creature{


    public People(){

    }

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                ", name=" + name +
                '}';
    }

    public People(int age, T name) {
        super(age, name);
    }
}
