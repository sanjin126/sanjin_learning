package com.shangguigu.day10.exe1;

public class Account {
    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void deposite(double amt){
        if (amt>0){
            balance += amt;
            System.out.println("存钱成功");
        }
    }

    public void withdraw(double amt){
        if (amt > balance){
            System.out.println("你的钱不够啊！！！");
        }else{
            balance -= amt;
            System.out.println("取钱成功");
        }
    }
}
