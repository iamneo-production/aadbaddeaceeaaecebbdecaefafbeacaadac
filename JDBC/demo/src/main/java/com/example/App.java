

package com.example;

 

import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.SQLException;

import java.sql.Statement;

 

public class App {

    public static void main(String[] args) {

       String jdbcURL = "jdbc:mysql://localhost:3306/appdb";

        String username = "root";

        String password = "examly";

 

        try {

            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            System.out.println("Connected to the database.");          

            Statement statement = connection.createStatement();

 

            // Create a table

            String createTableSQL = "CREATE TABLE IF NOT EXISTS example_table (" +

                    "id INT AUTO_INCREMENT PRIMARY KEY," +

                    "name VARCHAR(255)," +

                    "age INT)";

            statement.execute(createTableSQL);

            System.out.println("Table created successfully.");

 

            // Insert values into the table

            String insertSQL = "INSERT INTO example_table (name, age) VALUES " +

                    "('Priya', 27), " +

                    "('Yuvaraj', 33)";

            int rowsAffected = statement.executeUpdate(insertSQL);

            System.out.println(rowsAffected + " row(s) inserted.");

 

            // Close the Statement and Connection

            statement.close();

            connection.close();

            System.out.println("Connection closed.");

   

        } catch (SQLException e) {

            e.printStackTrace();

        }

 

    }

}