package com.shangguigu.day26;

import org.junit.Test;

public class NewInstanceTest {
    public static void main(String[] args) {

    }

    @Test
    public void test1() throws IllegalAccessException, InstantiationException {
        Class<Person> clazz = Person.class;
//        newInstance()
        Person p = clazz.newInstance();
        System.out.println(p);


    }
}
