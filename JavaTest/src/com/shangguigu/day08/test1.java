package com.shangguigu.day08;

import java.util.Arrays;

public class test1 {
    public static void main(String[] args){
        new test1().function(new String[]{"aa","bb"});
    }


    public void function(String... strs){
        System.out.println(Arrays.toString(strs));
    }
}
