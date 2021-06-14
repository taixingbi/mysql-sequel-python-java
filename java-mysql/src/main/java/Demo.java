package com.dzone.albanoj2.maven.java;
import java.sql.*;
import java.util.*;

public class Demo {
    static final String DB_URL = "jdbc:mysql://3.140.250.42:3306/TUTORIALSPOINT";
    static final String USER = "root";
    static final String PASS = "admin";

    public void demo() {
      System.out.print(DB_URL);

      try {
          Class.forName("com.mysql.jdbc.Driver");
          System.out.println("Driver loaded!");
      } catch (ClassNotFoundException e) {
          throw new IllegalStateException("Cannot find the driver in the classpath!", e);
      }

      try{
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();

        System.out.println("Inserting records into the table...");          
        // String sql = "INSERT INTO Employees VALUES (100, 'Zara', 'Ali', 18)";
        // stmt.executeUpdate(sql);
        String sql = "INSERT INTO Employees VALUES (101, 'Mahnaz', 'Fatma', 25)";
        stmt.executeUpdate(sql);
        sql = "INSERT INTO Employees VALUES (102, 'Zaid', 'Khan', 30)";
        stmt.executeUpdate(sql);
        sql = "INSERT INTO Employees VALUES(103, 'Sumit', 'Mittal', 28)";
        stmt.executeUpdate(sql);
        System.out.println("Inserted records into the table...");  	  


        // String SQL = "SELECT id, first, last, age FROM Employees";

        // ResultSet rs = stmt.executeQuery(SQL);
        // // Extract data from result set
        // while (rs.next()) {
        //   // Retrieve by column name
        //   System.out.print("ID: " + rs.getInt("id"));
        //   System.out.print(", Age: " + rs.getInt("age"));
        //   System.out.print(", First: " + rs.getString("first"));
        //   System.out.println(", Last: " + rs.getString("last"));
        // }



      } catch (SQLException e) {
        e.printStackTrace();
      } 

    }
}



