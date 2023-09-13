
package jdbc.utility;

import java.sql.DriverManager;
import java.sql.Connection;

public class DBConnectionUtility
{
    private static String mySqlDriver;
    private static String URL;
    private static String USERNAME;
    private static String PASSWORD;
    
    static {
       
        DBConnectionUtility.URL = "jdbc:mysql://localhost:3306/appDB?useSSL=false";
        DBConnectionUtility.USERNAME = "root";
        DBConnectionUtility.PASSWORD = "examly";
    }
    
    public static void main(String[] args)  {
         Connection conn = null;
        try {
            conn = DriverManager.getConnection(DBConnectionUtility.URL, DBConnectionUtility.USERNAME, DBConnectionUtility.PASSWORD);
            if (conn != null) {
                System.out.println("Connection SUCCESSFULL.");
            }
            else {
                System.out.println("Connection FAILED......Try Again");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    public static  Connection getConnection() throws Exception {
        Connection conn = null;
        try {
            Class.forName(DBConnectionUtility.mySqlDriver);
            conn = DriverManager.getConnection(DBConnectionUtility.URL, DBConnectionUtility.USERNAME, DBConnectionUtility.PASSWORD);
            if (conn != null) {
                System.out.println("Connection SUCCESSFULL.");
            }
            else {
                System.out.println("Connection FAILED......Try Again");
            }
        }
        catch (Exception e) {
            throw new Exception("check configuration");
        }
        return conn;
    }
}