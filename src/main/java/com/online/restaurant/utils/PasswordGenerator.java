package com.online.restaurant.utils;

import java.util.Random;

public class PasswordGenerator {
    public static String getPassword(){
        String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerAlphabets = alphabets.toLowerCase();
        String digits = "0123456789";
        String alphanumeric = alphabets + lowerAlphabets + digits;
        System.out.println(alphanumeric);
        Random random = new Random();
        String password = "";
        for (int i=0; i < 8; i++){
            int randonIndex = random.nextInt(alphanumeric.length());
            char character = alphanumeric.charAt(randonIndex);
            password = password + character;
            System.out.println("Random Index" + randonIndex + "and Character:" + character);
        }


        return alphabets;
    }
    public static void main(String[] args){
        PasswordGenerator.getPassword();
    }
}
