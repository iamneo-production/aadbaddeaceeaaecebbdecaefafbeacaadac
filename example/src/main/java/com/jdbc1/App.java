package com.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;



/**
 * Hello world!
 *
 */
public class App 
{
    private static String URL;
    private static String USERNAME;
    private static String PASSWORD;
    
    static {
       
        URL = "jdbc:mysql://localhost:3306/appDB?useSSL=false";
        USERNAME = "root";
        PASSWORD = "examly";
    }
    
    public static void main(String[] args)  {
         Connection conn = null;
        try {
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
