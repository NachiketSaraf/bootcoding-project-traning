package com.online.restaurant.utils;

import java.util.Random;

public class OTPGenrator {
    final static int MAX = 999999;
    final static int MIN = 100000;
    static Random random = new Random();
    public static int getOTP(){

        int number = random.nextInt(MAX - MIN); //899999
        int otp = MIN + number; // 100000 + 3 = 100003

        System.out.println( " OTP Number =" + number);
        return  otp;
    }
    public static  void main(String[] args) {
        for(int i=0; i<100; i++){
            OTPGenrator.getOTP();
        }

    }
}