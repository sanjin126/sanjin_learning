package com.shangguigu.p2;

/**
 * 实体对象，用来封装客户信息
 *
 *
 *
 */
public class Customer {

    //tester
    public static void main(String[] args) {
        Customer cst = new Customer("李四", '男',18,"188888888","1032628@qq.com");
        System.out.println(cst.getAge()+","+cst.gender);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    private String name;
    private char gender;
    private int age;
    private String phone;
    private String email;

    public Customer(){

    }

    public Customer(String name, char gender, int age, String phone, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
