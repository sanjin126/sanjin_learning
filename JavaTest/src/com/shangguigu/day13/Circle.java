package com.shangguigu.day13;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double findArea() {
        return Math.PI * radius * radius;
    }
}
