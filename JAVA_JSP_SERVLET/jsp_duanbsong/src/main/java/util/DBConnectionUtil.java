package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionUtil {
	private static String url = "jdbc:mysql://localhost:3306/bsong?useUnicode=true&characterEncoding=UTF-8";
	private static String user = "root";
	private static String password = "";
	private static Connection conn = null;
	
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println("Không thể nạp driver");
			e.printStackTrace();
		}
		return conn;
	}
}
