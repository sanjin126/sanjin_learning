package com.shangguigu.p2;

import org.junit.Test;

public class JUnitTst {


    CustomerList csts = new CustomerList();
    @Test
    public void addCustomerTest(){
        csts.addCustomer(new Customer("sanjin",'男',11,"11111","1111"));
        System.out.println(csts.customers[0]);
    }

    @Test
    public void replaceCustomerTset(){
        boolean flag = csts.replaceCustomer(-1, new Customer("sanjinjinjin", '男', 11, "111111111", "11111111"));
        System.out.println(flag);
    }

    @Test
    public void deleteCustomerTest(){
//        csts.addCustomer(new Customer("sanjin",'男',11,"11111","1111"));
        System.out.println(csts.total);
        boolean flag = csts.deleteCustomer(-1);
        System.out.println(csts.total);
        System.out.println(csts.customers[0]);
        System.out.println(flag);
    }

    @Test
    public void getAllCustomerTset(){
        csts.addCustomer(new Customer("sanjin",'男',11,"11111","1111"));
        csts.addCustomer(new Customer("sanjin",'男',11,"11111","1111"));
        csts.addCustomer(new Customer("sanjin",'男',11,"11111","1111"));
        csts.addCustomer(new Customer("sanjin",'男',11,"11111","1111"));
        csts.addCustomer(new Customer("sanjin",'男',11,"11111","1111"));
        csts.addCustomer(new Customer("sanjin",'男',11,"11111","1111"));
        csts.addCustomer(new Customer("sanjin",'男',11,"11111","1111"));
        csts.addCustomer(new Customer("sanjin",'男',11,"11111","1111"));
        boolean aFlag = csts.addCustomer(new Customer("sanjin",'男',11,"11111","1111"));
        Customer[] a = csts.getAllCustomers();
        for (int i = 0; i < a.length; i++){
            System.out.println(csts.customers[i]);
        }
        System.out.println(a.length);
        System.out.println(csts.getTotal());
        System.out.println(aFlag);
    }

    @Test
    public void getCustomerTset(){
        csts.addCustomer(new Customer("sanjin",'男',11,"11111","1111"));
        Customer a = csts.getCustomer(0);
        System.out.println(a);
    }


}
