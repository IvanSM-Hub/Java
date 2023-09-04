package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionDaoMy8 {
	
	private static Connection conn;
	private static String url,user,pass;
	
	private ConnexionDaoMy8() {
		url="jdbc:mysql://127.0.0.1:3306/EmpresaProyectos?serverTimezone=UTC";
		user="root";
		pass="root1234";
		try {
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("Conexión establecida.\n");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Conexión NO establecida.\n");
		}
	}//End ConnexionDaoMy8()

	public static Connection getConnection() {
		if(conn==null)
			new ConnexionDaoMy8();
		
		return conn;
	}//End getConnection()
	
}//End ConnexionDaoMy8
