package com.employee.demo;

import com.mysql.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;


public class Test {
        public static final String DBDRIVER="com.mysql.jdbc.Driver";
        public static  final String url="jdbc:mysql://127.0.0.1:3306/test";
        public static  final String user="root";
        public static  final String password="123123";

    public static void main(String[] args) {
        Connection conn=null;

        try {
            Class.forName(DBDRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
