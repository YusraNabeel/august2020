package page;

import java.sql.*;


public class DataBasePage {

	public static String getData(String columnName) throws ClassNotFoundException, SQLException {
		  // Setting properties for mysql
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  // creating a connection to your local database
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/april2020", "root", "admin");
		  // empowering the con reference valiable to execute queries
		  Statement smt = con.createStatement();
		  // delivering the sql query
		  ResultSet rs = smt.executeQuery("select * from users");
		  while (rs.next()) {
		  return rs.getString(columnName);
		  }
		  return columnName;
		  }
}
