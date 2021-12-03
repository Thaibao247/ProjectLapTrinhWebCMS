package pj.webt5.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	public static Connection getConnect(){
		Connection connection = null;
		String DB_URL = "jdbc:mysql://localhost:3307/cmsnhom5";
		 String USER_NAME = "root";
		 String PASSWORD = "thaibao247";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
			System.out.println("Kết nối thành công!");
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("Kết nối thất bại!"+e.getMessage());
		}
		return connection;
	}
	public static void main(String[] args) {
		System.out.println(getConnect());
	}
}
