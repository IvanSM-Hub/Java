package Conexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AbstractDaoMy8 {
	
	protected Connection conn;
	protected PreparedStatement ps;
	protected ResultSet rs;
	protected int filas = 0;
	protected String url,user,pass,sql;
	
	public AbstractDaoMy8() {
		conn=ConnexionDaoMy8.getConnection();
	}
	
}//End AbstractDaoMy8
