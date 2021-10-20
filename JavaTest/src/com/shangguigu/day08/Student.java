package com.shangguigu.day08;


public class Student {
    int number;
    int state;
    int score;


    public static void main(String[] args) {
        Student[] stds = new Student[20];
        for (int i = 0;i < 20; i++){
            stds[i] = new Student();
            stds[i].number = i + 1;
            stds[i].state = (int)(Math.random() * (6 - 1 + 1) + 1.0);
            stds[i].score = (int)(Math.random() * (100.0 - 0 + 1));
        }
        for (int i = 0; i < stds.length; i++){
            if (stds[i].state == 3){
                System.out.println("number"+stds[i].number+"  state"+stds[i].state+"  score"+stds[i].score);
            }
        }

        for (int i = 0; i < stds.length - 1; i++){
            for (int j = 0; j < stds.length - 1 - i; j++){
                if (stds[j].score > stds[j+1].score){
                    Student temp;
                    temp = stds[j];
                    stds[j] = stds[j+1];
                    stds[j+1] = temp;
                }
            }
        }
        System.out.println("*********************************");
        for (int i = 0; i < stds.length; i++){
//            if (stds[i].state == 3){
                System.out.println("number"+stds[i].number+"  state"+stds[i].state+"  score"+stds[i].score);
//            }
        }
    }
}
