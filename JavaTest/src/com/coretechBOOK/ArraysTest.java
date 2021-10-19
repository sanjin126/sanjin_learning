package com.coretechBOOK;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {

        int n = 49;
        int[] numbers = new int[n];
        for (int i = 0; i< numbers.length; i++){
            numbers[i] = i+1;
        }
//        System.out.println(Arrays.toString(numbers));

        int[] result = new int[6];
        int randomeIndex;
        for (int i = 0; i< result.length; i++){
            randomeIndex = (int) (Math.random()*n);
            result[i] = numbers[randomeIndex];
            numbers[randomeIndex] = numbers[n-1];
            n--;
        }
        Arrays.sort(result);
        for(int e : result){
            System.out.println(e+" ");
        }
//        System.out.println(Arrays.toString(result));
//        System.out.println("Hello World!");


    }
}
