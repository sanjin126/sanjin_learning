package com.shangguigu.day14.singletondesing;

public class SingletonTest {

    public static void main(String[] args) {
        Singleton s1 = Singleton.makeSingleton();
        Singleton s2 = Singleton.makeSingleton();
        System.out.println(s1 == s2);
        Singleton1 s3 = Singleton1.makeSingleton();
        Singleton1 s4 = Singleton1.makeSingleton();
        System.out.println(s3 == s4);
    }
}
/*
* 单例设计模式
* 只能构造出一个对象
* 其构造方法是private的
* 由于不能事先生成对象，所以要使用静态方法make对象
*
* */
class Singleton1{
    private static Singleton1 instance = new Singleton1();

    //1.构造器私有化
    private Singleton1(){

    }
    //2.饿汉式
    public static Singleton1 makeSingleton(){
        return instance;
    }
}





class Singleton{
    private static Singleton s = null;

//  1.构造器私有化
    private Singleton(){

    }
//  2.懒汉式
    public static Singleton makeSingleton(){
        if (s == null) {
            return s = new Singleton();
        }else {
            return s;
        }
    }
}