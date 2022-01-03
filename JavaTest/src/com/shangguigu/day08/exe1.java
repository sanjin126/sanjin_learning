package com.shangguigu.day08;

public class exe1 {
    public static void main(String[] args) {
        new exe1().method();
    }

    public void method(){
        for(int i = 0;i < 10; i++){
            for (int j = 0; j < 8; j++){
                System.out.print('*');
            }
            System.out.println("11");
        }
    }
}
