package com.dzone.albanoj2.maven.java;
import java.sql.*;

public class Demo {
    static final String DB_URL = "jdbc:mysql://localhost:3306/mysql";
    static final String USER = "root";
    static final String PASS = "admin";
    static final String QUERY = "SELECT id, first, last, age FROM Employees";

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
        ResultSet rs = stmt.executeQuery(QUERY);
        // Extract data from result set
        while (rs.next()) {
          // Retrieve by column name
          System.out.print("ID: " + rs.getInt("id"));
          System.out.print(", Age: " + rs.getInt("age"));
          System.out.print(", First: " + rs.getString("first"));
          System.out.println(", Last: " + rs.getString("last"));
        }

      } catch (SQLException e) {
        e.printStackTrace();
      } 

    }
}
