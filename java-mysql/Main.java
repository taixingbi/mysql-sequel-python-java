import java.sql.*;
//   spring.datasource.url = jdbc:mysql://mysql1:3306/bikerent
public class Main {
   static final String DB_URL = "jdbc:mysql://localhost:3306";
  //static final String DB_URL = "jdbc:mysql://0.0.0.0:8083/mysql";

   static final String USER = "root";
   static final String PASS = "admin";
  //  static final String QUERY = "SELECT id, first, last, age FROM Employees";

   public static void main(String[] args) {
      System.out.print(DB_URL);
      try{
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
      } catch (SQLException e) {
        e.printStackTrace();
      } 

      // System.out.print(conn);

      // Open a connection
      // try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
      //    Statement stmt = conn.createStatement();
      //    ResultSet rs = stmt.executeQuery(QUERY);) {
      //    Extract data from result set
      //    while (rs.next()) {
      //       // Retrieve by column name
      //       System.out.print("ID: " + rs.getInt("id"));
      //       System.out.print(", Age: " + rs.getInt("age"));
      //       System.out.print(", First: " + rs.getString("first"));
      //       System.out.println(", Last: " + rs.getString("last"));
      //    }
      // } catch (SQLException e) {
      //    e.printStackTrace();
      // } 
   }
}
