package com.shangguigu.day26;

import java.io.IOException;
import java.io.Serializable;

public class Creature<T> implements Serializable {
    private char gender;
    public double weight;

    private void breathe()throws IOException {
        System.out.println("breathe");
    }

    private void eat(){
        System.out.println("et");
    }
}
