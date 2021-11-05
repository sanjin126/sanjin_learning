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
//

    }

    @Test
    public void test2() throws Exception {
        int num = (int) ((Math.random() * 3.0) + 1);
        switch (num){
            case 1:
                System.out.println(getInstance("java.lang.Object"));
                break;
            case 2:
                System.out.println(getInstance("com.shangguigu.day26.Person"));
                break;
            case 3:
                System.out.println(getInstance("java.util.Date"));
                break;
        }
    }


    public Object getInstance(String classpath) throws Exception, InstantiationException {
        Class clazz = Class.forName(classpath);
        return clazz.newInstance();
    }
}
