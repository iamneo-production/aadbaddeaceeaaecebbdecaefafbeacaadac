package com.jdbc;


import java.sql.DriverManager;
import java.sql.Connection;

public class App
{

    private static String URL;
    private static String USERNAME;
    private static String PASSWORD;
    
    static {
      
        App.URL = "jdbc:mysql://localhost:3306/appDB?useSSL=false";
        App.USERNAME = "root";
        App.PASSWORD = "examly";
    }
    
    public static void main(String[] args)  {
         Connection conn = null;
        try {
            conn = DriverManager.getConnection(App.URL, App.USERNAME, App.PASSWORD);
            if (conn != null) {
                System.out.println("#####################333333333Connection SUCCESSFULL.");
            }
            else {
                System.out.println("Connection FAILED......Try Again");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}