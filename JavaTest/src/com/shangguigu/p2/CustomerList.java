package com.shangguigu.p2;



/**
 *
 * 为Customer对象的管理模块，内部用数组管理一组Customer对象，
 * 并提供相应的添加、修改、删除和遍历方法，供CustomerView调用
 *
 *
 */
public class CustomerList {




    Customer[] customers = new Customer[10];
    int total = 0; //记录以保存的客户数量

    //constructor
    public CustomerList(){}

    public CustomerList(int totalCustomer) {
        this.total = totalCustomer;
    }


    public boolean addCustomer(Customer cst){
        if (total >= 10){
            return false;
        }else {
            customers[total++] = cst;
            return true;
        }
    }

    public boolean replaceCustomer(int index, Customer cst){
        if (index<0 || index > total - 1){
            return false;
        }else {
            customers[index] = cst;
            return true;
        }
    }
    public boolean deleteCustomer(int index){
        if (index < 0 || index > total - 1){
            return false;
        }else {
            for (int i = index; i < customers.length ; i++){
                customers[index] = customers[index+1];
            }
            total--;
            return true;
        }
    }

    public Customer[] getAllCustomers(){
        Customer cst[];
        cst = new Customer[total];
        for (int i = 0; i < cst.length; i++){
            cst[i] = customers[i];
        }
        return cst;
    }

    public Customer getCustomer(int index){
        if (index < 0 || index > total - 1){
            return null;
        }else {
            return customers[index];
        }
    }

    public int getTotal() {
        return total;
    }
}
