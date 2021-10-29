package com.shangguigu.day12;

public class kids extends ManKind{

    public kids(){

    }

    private int yearsOld;

    public void printAge(){
        System.out.println("I am"+this.yearsOld);
    }

    @Override
    public void employeed(){
        System.out.println("Kids");
    }
}
