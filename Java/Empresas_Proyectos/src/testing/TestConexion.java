package testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Conexion.ConnexionDaoMy8;

public class TestConexion {
	
	public static void main(String[] args) {
		
		Connection conn;
		String url,user,pass;
		
		url="jdbc:mysql://127.0.0.1:3306/EmpresaProyectos?serverTimezone=UTC";
		user="root";
		pass="root1234";
		try {
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("Conexión establecida.");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Conexión NO establecida.");
		}
		
	}//End main

}//End TestConexion
