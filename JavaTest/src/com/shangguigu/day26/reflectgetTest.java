package com.shangguigu.day26;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.function.Predicate;

public class reflectgetTest {
    @Test
    public void getField(){
        Class clazz = Person.class;
        Field[] fields = clazz.getFields();
        for(Field f : fields){
            System.out.println(f);
        }
        //
        System.out.println("----------------------");
        Field[] declaredFields = clazz.getDeclaredFields();
        for(Field f : declaredFields){
            System.out.println(f);
        }
    }

    @Test
    public void getMethodTest(){
        Class clazz = Person.class;
        Method[] methods = clazz.getMethods();
//        for (Method m : methods){
//            System.out.println(m);
//        }
//        for (Method m : methods){
//            Annotation[] annotations = m.getAnnotations();
//            for (Annotation a : annotations){
//                System.out.println(a);
//            }
//        }

        for (Method m : methods){
            Class<?>[] exceptionTypes = m.getExceptionTypes();
            for(int i = 0 ; i < exceptionTypes.length; i++){
                System.out.println(exceptionTypes[i].getName());
            }
        }


        //all methods include in this object.
        Method[] declaredMethods = clazz.getDeclaredMethods();
    }

    @Test
    public void getConstructor(){
        Class clazz = Person.class;
        Constructor[] constructors = clazz.getDeclaredConstructors();
        for(Constructor c : constructors){
            System.out.println(c);
        }
    }
//获取泛型父类的泛型
    @Test
    public void getParent(){
        Class clazz = Person.class;
        System.out.println(clazz.getSuperclass());
        Type genericSuperclass = clazz.getGenericSuperclass();
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        System.out.println(actualTypeArguments[0].getTypeName());
    }
    @Test
    public void getInterface(){
        Class clazz = Person.class.getSuperclass();
        Class<?>[] interfaces = clazz.getInterfaces();
        for (Class c : interfaces){
            System.out.println(c);
        }
    }

    @Test
    public void getPackage(){
        Class clazz = Person.class;
        System.out.println(clazz.getPackage());
    }
}
