package com.shangguigu.day26;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflect {
    @Test
    public void fieldTest() throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class clazz = Person.class;

        Person p = (Person) clazz.newInstance();

        Field name = clazz.getField("name");
        name.set(p,"sanjin");
        System.out.println(name.get(p));

        Field age = clazz.getDeclaredField("age");
        age.setAccessible(true);
        age.set(p, 20);

        System.out.println(p);
    }

    @Test
    public void methodTest() throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<Person> clazz = Person.class;
        Person p = clazz.newInstance();

        Method eat = clazz.getDeclaredMethod("eat",String.class);
        eat.setAccessible(true);
        eat.invoke(p,"rice");

        Method sleep = clazz.getDeclaredMethod("sleep");
        sleep.setAccessible(true);
        sleep.invoke(Person.class);


    }

    @Test
    public void constructorTest() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<Person> clazz = Person.class;
        Constructor<Person> declaredConstructor = clazz.getDeclaredConstructor(String.class, int.class);
        declaredConstructor.setAccessible(true);

        Person p = declaredConstructor.newInstance("sanjin", 21);
        System.out.println(p);


    }
}
