package com.online.restaurant.app;

import com.online.restaurant.Customer;
import com.online.restaurant.Order;
import com.online.restaurant.Vendor;
import com.online.restaurant.dao.CustomerDAO;
import com.online.restaurant.dao.MenuItemDAO;
import com.online.restaurant.dao.OrderDAO;
//import com.online.restaurant.dao.OrderMenuItem1DAO;
//import com.online.restaurant.dao.VendorDAO;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Customer ferocious = new Customer();

        ferocious.setName("Ferocious");
        ferocious.setCity("Nagpur");
        ferocious.setAddress("your home");
        ferocious.setState("Maharashtra");
        ferocious.setEmailid("Ferocious@noprivacy");
        ferocious.setPhoneNumber(1011001010L);

        System.out.println("Customer detail : ");
        System.out.println("Name : " + ferocious.getName());
        System.out.println("City : " + ferocious.getCity());
        System.out.println("Address : "+ ferocious.getAddress());
        System.out.println("State : "+ ferocious.getState());
        System.out.println("Email-Id : "+ ferocious.getEmailid());
        System.out.println("Phone : "+ ferocious.getPhoneNumber()+"\n");

        Vendor haldiram = new Vendor();
        haldiram.setName("Haldiram veg Restaurant");
        haldiram.setAddress("Medical square");
        haldiram.setCategory("Veg");
        haldiram.setPhonenumber(0712-223344L);
        haldiram.setRatting(5.0);
        haldiram.setCity("Nagpur");
        haldiram.setState("Maharashtra");

        System.out.println("Vendor Details :");
        System.out.println("Name :"+haldiram.getName());
        System.out.println("Address :"+haldiram.getAddress());
        System.out.println("Category :"+haldiram.getCategory());
        System.out.println("Phone :"+haldiram.getPhonenumber());
        System.out.println("Rating :"+haldiram.getRatting());
        System.out.println("State :"+haldiram.getState());
        System.out.println("City :"+haldiram.getCity()+"\n");


        Order order = new Order();
        order.setCustomer(ferocious);
        order.setOrderDate(new Date());
        order.setDeliveryAddres("101, civil lines, Nagpur");
        order.setVendor(haldiram);
        order.setTotalAmount(999.00);

        System.out.println("Order Details :");
        System.out.println("Customer :"+order.getCustomer());
        System.out.println("Order Date :"+order.getOrderDate());
        System.out.println("Delivery Address :"+order.getDeliveryAddres());
        System.out.println("Vendor :"+order.getVendor());
        System.out.println("Total Amount :"+order.getTotalAmount()+"\n");

        CustomerDAO customerDAO = new CustomerDAO();
        customerDAO.createTable();

        OrderDAO orderDAO = new OrderDAO();
        orderDAO.createTable();

        MenuItemDAO menuItemDAO = new MenuItemDAO();
        menuItemDAO.createTable();
    }
}