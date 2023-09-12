package com.example;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {Connection conn = null;
        try {
            String URL = "jdbc:mysql://localhost:3306/appDB?useSSL=false";
            String USERNAME = "root";
             String PASSWORD = "examly";
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            if (conn != null) {
                System.out.println("#################################Connection SUCCESSFULL.");
            }
            else {
                System.out.println("##############################Connection FAILED......Try Again");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
    
    }
}
