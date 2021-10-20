package com.shangguigu.day10.exe1;

public class Bank {

    private Customer[] customers;
    private int numberOfCustomer;

    public void addCustomer(String f, String l){
        Customer cst = new Customer(f, l);
        customers[numberOfCustomer] = cst;
        numberOfCustomer++;
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public Customer getCustomer(int index){
        return customers[index];
    }

}
