package com.shangguigu.day26;

import org.junit.Test;

import java.io.*;
import java.util.Properties;

public class ClassLoaderTest {
    public static void main(String[] args) {

    }

    @Test
    public void test() throws ClassNotFoundException {
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        System.out.println(classLoader);

        ClassLoader parent = classLoader.getParent();
        System.out.println(parent);

//        引导类加载器无法获取，用来加载Java
        System.out.println(parent.getParent());

        Class<?> aClass = classLoader.loadClass("com.shangguigu.day26.Person");
        System.out.println(aClass);

    }

    @Test
    public void test1() throws IOException {
        Properties prpo = new Properties();

//        FileReader fileReader = new FileReader(new File("jabc_1.properties"));
//        prpo.load(fileReader);
        ClassLoader classLoader = ClassLoaderTest.class.getClassLoader();
        InputStream resourceAsStream = classLoader.getResourceAsStream("com/shangguigu/day26/jabc_1.properties");
        prpo.load(resourceAsStream);
        String user = prpo.getProperty("user");
        String password = prpo.getProperty("password");
        System.out.println(user);
        System.out.println(password);
    }
}
