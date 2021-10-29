package com.shangguigu.day13;

import java.util.Objects;

public class OrderTest {
    public static void main(String[] args) {
        Order a = new Order(1,"11");
        Order b = new Order(44,"11");
        boolean isFlag = a.equals(b);
        System.out.println(isFlag);
        a.getOtherId(b);
    }
}

class Order{
    private int orderId;
    private String orderName;

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void getOtherId(Order o){
        System.out.println(o.orderId);
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null) return false;
//        if (obj instanceof Order){
//            Order aOrder = (Order)obj;
//            return aOrder.orderId == this.orderId &&
//                    aOrder.orderName.equals(this.orderName);
//        }
//        return false;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return orderId == order.orderId && Objects.equals(orderName, order.orderName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderName);
    }
}
