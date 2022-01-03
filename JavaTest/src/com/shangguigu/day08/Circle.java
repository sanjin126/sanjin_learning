package com.shangguigu.day08;


import org.junit.Test;

public class Circle {



    public static void main(String[] args) {
        double a = Circle.ccuArea(3);
        
        System.out.println(a);
    }



    public static double ccuArea(double radius){
        String s = new String();
        return Math.PI * radius * radius;
    }
}
