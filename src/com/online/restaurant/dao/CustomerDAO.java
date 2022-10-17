package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CustomerDAO {
    public static final String TABLE_NAME="customer";

    public void  createTable(){
        try{
            //1. Load JDBC Driver
            Class.forName("org.postgresql.Driver");
            //2.
            Connection con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres","postgres","1003");
// 3.
            Statement stmt = con.createStatement();
            //4.
            String sql =" Select * from "+TABLE_NAME;
            ResultSet rs = stmt.executeQuery(sql);
            //5.
            while (rs.next()){
                System.out.println(" Name = "+rs.getString("name"));
                System.out.println("Address = "+rs.getString("address"));
                System.out.println(" City= "+rs.getString("city"));
                System.out.println(" State = "+rs.getString("state"));

            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}