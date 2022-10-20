package com.online.restaurant;

public class Customer {
    // to declare a variale
    private long customerid;
    private String name;//instance variavle
    private String address;//instance variavle

    public long getCustomerid() {
        return customerid;
    }

    public void setCustomerid(long customerid) {
        this.customerid = customerid;
    }

    private String city;//instance variavle
    private long phoneNumber;//instance variavle

    public long getPhoneNumber() {
        return phoneNumber;
    }

    private String state;//instance variavle
    private String emailid;//instance variavle

    // getters
    // to get the value of variable
    // setters
    // to get the value to variable

    public String getName(){
        return  name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
}