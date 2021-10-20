package com.shangguigu.day07;
/*
* yanghuisanjiao
*
* */
public class exe2 {
    public static void main(String[] args) {
        int lines = 10;
        //1.声明数组和初始化
        int [][] arr = new int[lines][];
        //2.给数组赋值
        for (int i = 0; i < arr.length; i++){
            arr[i] = new int[i + 1];

            //2.1start & end elem
            arr[i][0] = 1;
            arr[i][i] = 1;
            //2.2
            if (i > 1){
                for (int j = 1; j < arr[i].length -1; j++){
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }
            }
        }

        //3.遍历输出
        for (int i = 0;i < arr.length;i++){
            for (int j = 0; j < arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
