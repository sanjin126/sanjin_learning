package com.shangguigu.day14;

public class AccountTest {

    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account("123456", 1000);
        System.out.println(a1);
        System.out.println(a2);
    }


}

class Account{
    private int id;
    private String password = "666666";
    private double balance;

    private static double interstRate;
    private static double minMoney = 1.0;
    private static int init = 1001; //id atou make

    public Account(){
        this("666666", 0);
    }

    public Account(String password, double balance){
        id = init++;
        this.password = password;
        this.balance = balance;
    }

    public static double getMinMoney() {
        return minMoney;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
