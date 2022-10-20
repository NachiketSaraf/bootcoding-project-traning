package com.online.restaurant.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MenuItemDAO {
    public static final String TABLE_NAME = "app_menu_item";

    public void createTable() {
        try {
            //1. Load JDBC Driver
            Class.forName("org.postgresql.Driver");
            //2.
            Connection con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "0901");
// 3.
            Statement stmt = con.createStatement();
            //4.

            String query = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME
                    + "( id bigint NOT NULL, "
                    + "vendor_id bigint, "
                    + "menu_item_name text, "
                    + "price decimal, "
                    + "category text, "
                    + "is_veg bool,"
                    + "CONSTRAINT app_menu_item_pk PRIMARY KEY(ID))";
            System.out.println("Create Table Query:" + query);
            stmt.executeUpdate(query);
con.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

