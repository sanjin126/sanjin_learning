package com.shangguigu.day08;


public class Circle {

    public static void main(String[] args) {
        double a = Circle.ccuArea(3);
        System.out.println(a);
    }


    public static double ccuArea(double radius){

        return Math.PI * radius * radius;
    }
}
