package com.shangguigu.day13;

import org.junit.Test;

import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {
    public static void main(String[] args) {
//        1.实例化scannner
        Scanner scan = new Scanner(System.in);

//
        Vector v = new Vector();

//
        int maxScore = -1;
        for (;;){
            System.out.println("请输入学生成绩：");
            int score = scan.nextInt();
            if (score < 0){
                break;
            } else if(score > 100) {
                System.out.println("输入错误！重新输入：");
                continue;
            } else {
                if (maxScore < score) {
                    maxScore = score;
                }
                v.add(score);
            }
        }
//
        for (int i = 0; i < v.size(); i++) {
            Object obj = v.elementAt(i);
            System.out.println((Integer)obj);
        }

    }
    @Test
    public void test(){
        Person p = new Person();
        p.eat();
        p.sleep();
    }

}

class Person{
    private int age = 11;
    private static int height = 180;
//    Person p = new Person();   //stackoverflow!!!!

    public void eat(){
        Person p = new Person();
        System.out.println(p.age = 24);
        System.out.println("吃饱了");
    }

    public static void sleep(){
        System.out.println(height);
        Person p = new Person();
        System.out.println(p.age);
    }


}