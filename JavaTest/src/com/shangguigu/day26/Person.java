package com.shangguigu.day26;

public class Person extends Creature<String> implements Comparable {
    public String name;
    private int age;

    private Person() {
        System.out.println("Person()");
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void show() throws RuntimeException{
        System.out.println("你好");
    }

    private void eat() {
        System.out.println("吃饭");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        System.out.println("compare");
        return 0;
    }

}
