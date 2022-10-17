package com.online.restaurant;

import java.util.Date;
import java.util.List;

public class Order {
    private long orderId;
    private double totalAmount;
    private Vendor vendor;
    private Customer customer;
    private String deliveryAddres;
    private List<OrderMenuItem1>menuItems;
    private Date  orderDate;
    private String orderstatus;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDeliveryAddres() {
        return deliveryAddres;
    }

    public void setDeliveryAddres(String deliveryAddres) {
        this.deliveryAddres = deliveryAddres;
    }

    public List<OrderMenuItem1> getMenuItems() {
        return menuItems;
    }

    public void setMenuItems(List<OrderMenuItem1> menuItems) {
        this.menuItems = menuItems;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }
}