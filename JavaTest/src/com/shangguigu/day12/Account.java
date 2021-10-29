package com.shangguigu.day12;

public class Account {
    private int id;
    private double balance;
    private double annuallnteyy;


    public Account(int id, double balance, double annuallnteyy) {
        this.id = id;
        this.balance = balance;
        this.annuallnteyy = annuallnteyy;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnuallnteyy(double annuallnteyy) {
        this.annuallnteyy = annuallnteyy;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnuallnteyy() {
        return annuallnteyy;
    }

    public double getMonthlyInterest(){
        return annuallnteyy / 12;
    }

    public void withdraw(double amount){
        if (balance >= amount) {
            balance -= amount;
            return;
        }
        System.out.println("no money");
    }

    public void deposit(int money){

    }

}
