package com.shangguigu.day07;

import java.sql.SQLOutput;
import java.util.Arrays;

public class exe3 {
    public static void main(String[] args) {
        int arr1[] = new int[]{1,2,3,4,5};
        int arr2[] = new int[arr1.length];

        //copy
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr2));

        //reverse
        for (int i = 0,j = arr1.length - 1; i < (int)arr1.length / 2; i++){
            int temp;

            temp = arr1[i];
            arr1[i] = arr1[j - i];
            arr1[j - i] = temp;
        }
        System.out.println(Arrays.toString(arr1));

        //find
        //线性查找
        boolean isFlag = true;
        for (int i = 0; i < arr1.length; i++){
            if (99 == arr1[i]) {
                System.out.println("找到了，在" + i);
                isFlag = false;
                break;
            }
        }
        if (isFlag){
            System.out.println("没找到！");
        }

        //二分查找 binarySearch
        int high = arr1.length -1, low = 0, mid;
        int elem = 3;
        while(low <= high){
            mid = (high - low) / 2;
            if (elem == arr1[mid]){
                System.out.println("找到了，在"+mid);
                break;
            }else if (elem > arr1[mid]){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
    }
}
