package com.shangguigu.day13;

public class GeometricTest {
    public static void main(String[] args) {
        GeometricObject a = new Circle("black", 10.0, 2.0);
        new GeometricTest().displayGeometricObject(a);
        GeometricObject b = new Circle("white", 10.0, 2.0);
        new GeometricTest().displayGeometricObject(b);

        boolean isFlag = new GeometricTest().equalsArea(a, b);
        System.out.println(isFlag);
    }

    public boolean equalsArea(GeometricObject a, GeometricObject b){
        return a.findArea() == b.findArea();
    }

    public void displayGeometricObject(GeometricObject a){
        System.out.println(a.findArea());
    }
}
