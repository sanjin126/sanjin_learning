package com.shangguigu.day26;

import org.junit.Test;

import java.lang.reflect.Field;
import java.util.Comparator;

public class ReflectionTest {
    public static void main(String[] args) {

    }

    @Test
    public void reflectTest() throws IllegalAccessException, InstantiationException, NoSuchFieldException {
//        1.
        Class clazz = Person.class;
        Object p = clazz.newInstance();
        Person p1 = (Person) p;
        p1.name = "Tony";
        System.out.println(p1.name);

        Field age = clazz.getDeclaredField("age");
        age.setAccessible(true);
        age.set(p1, 10);
        System.out.println(p1);


    }

    @Test
    public void getClassInstance() throws ClassNotFoundException {
        /*
        * 获取运行时类实例
        * */
//        1.
        Class<Person> clazz1 = Person.class;
        System.out.println(clazz1);

//        2.
//        Person person = new Person();
//        Class clazz2 = person.getClass();
//        System.out.println(clazz2);
//        3.
        Class clazz3 = Class.forName("com.shangguigu.day26.Person");
        System.out.println(clazz3);

//        4.
    }
}

