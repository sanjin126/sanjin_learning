package com.shangguigu.day14;

public class Circle {

    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("c1"+" "+c1.id);
        Circle c2 = new Circle();
        System.out.println("c1"+c2.id);
        System.out.println("圆的个数:"+Circle.total);

    }


    private double radius;
    private int id;

    private static int total;
    private static int init = 1001;

    public Circle(){
        id = init++;
        total ++;
    }

    public double getRadius() {
        return radius;
    }

    public int getId() {
        return id;
    }

    public double findArea(){
        return 3.14 * radius * radius;
    }


}
