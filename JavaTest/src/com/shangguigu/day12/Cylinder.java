package com.shangguigu.day12;

public class Cylinder extends Circle{
    private double length;

    public Cylinder() {
        this.length = 1;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public double findVolume() {
        return super.findArea() * this.length;
    }

    @Override
    public double findArea() {
        return Math.PI * getRadius() * getRadius() * 2 + 2 * Math.PI * getRadius() * length ;
    }
}
