package com.shangguigu.day13;

public class MyRectangle extends GeometricObject{
    private double width;
    private double length;

    public MyRectangle(String color, double weight, double width, double length) {
        super(color, weight);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double findArea() {
        return width * length;
    }
}
