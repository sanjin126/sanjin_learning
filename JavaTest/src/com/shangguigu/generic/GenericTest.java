package com.shangguigu.generic;

import org.junit.Test;

import java.util.*;

public class GenericTest {


    @Test
    public void test(){
        ArrayList list = new ArrayList();
        list.add(22);
        list.add(223);
        list.add(22);
        list.add(224);
        list.add(new String("11"));
        Iterator iterator = list.iterator();
//        while (iterator.hasNext()) {
//            Integer o = (Integer) iterator.next();
//            System.out.println(o);
//        }
    }

    @Test
    public void test1(){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(Integer.valueOf("11"));
        Iterator<?> iterator = list.iterator();

    }

    @Test
    public void test2(){
        //
        Map<String, Integer> map = new HashMap<>();
        map.put("11", 11);
        map.put("22", 22);
        map.put("33", 33);
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            entry.setValue(3);
            System.out.println(entry.getKey() + "------" +entry.getValue());
        }

        System.out.println(map);
    }

    @Test
    public void test3(){
        Creature<String> creature = new Creature<>(11, "11");

    }

    @Test
    public void test4(){
        People<String> people = new People<>(11, "11");
        System.out.println(people);
    }

}
