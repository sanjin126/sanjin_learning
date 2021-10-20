package com.shangguigu.day10;

public class Account {
    private int id; //账号
    private double balance; //余额
    private double annuallnterestRate; //年利率

    public Account(int id, double balance, double annuallnterestRate){
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }

    public void setAnnuallnterestRate(double annuallnterestRate) {
        this.annuallnterestRate = annuallnterestRate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAnnuallnterestRate() {
        return annuallnterestRate;
    }

    public double getBalance() {
        return balance;
    }

    public int getId() {
        return id;
    }

    public void withdraw(double amount){
        if (balance < amount){
            System.out.println("钱不够!");
        }
    }
}
