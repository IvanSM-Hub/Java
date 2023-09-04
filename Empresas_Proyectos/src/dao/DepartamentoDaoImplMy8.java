package dao;

import java.sql.SQLException;
import java.util.List;

import Conexion.AbstractDaoMy8;
import javabeans.Departamento;

public class DepartamentoDaoImplMy8 extends AbstractDaoMy8 implements DepartamentoDao {

	private static Departamento depar;
	
	@Override
	public int altaDepartamento(Departamento departamento) {
		
		depar = new Departamento();
		
		sql="insert into departamentos values(?,?,?)";
		
		try {
			
			ps=conn.prepareStatement(sql);
			
			ps.setInt(1, depar.getIdDepar());
			ps.setString(2, depar.getNombre());
			ps.setString(3, depar.getDireccion());
			
			filas=ps.executeUpdate();
			
			filas=1;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return filas;
	}

	@Override
	public int eliminarDepartamento(int idDepar) {
		
		sql="delete from departamentos where id_depart=?";
		
		try {
			
			ps=conn.prepareStatement(sql);
			
			ps.setInt(1, idDepar);
			
			filas=ps.executeUpdate();
			
			filas=1;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return filas;
	}

	@Override
	public int modificarDepartamento(Departamento departamento) {
		
		sql="update departamentos set nombre=?,direccion=? where id_depart=?";
		
		try {
			
			ps=conn.prepareStatement(sql);
			
			ps.setString(1, departamento.getNombre());
			ps.setString(2, departamento.getDireccion());
			ps.setInt(3, departamento.getIdDepar());
			
			filas=ps.executeUpdate();
			
			filas=1;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return filas;
	}

	@Override
	public Departamento buscarDepartamento(int idDepar) {
		
		depar=new Departamento();
		
		sql="select * from departamentos where id_depart=?";
		
		try {
			
			ps=conn.prepareStatement(sql);
			ps.setInt(1, idDepar);
			rs=ps.executeQuery();
			
			if (rs.next()) {
				ps.setInt(1, depar.getIdDepar());
				ps.setString(2, depar.getNombre());
				ps.setString(3, depar.getDireccion());
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return depar;
	}

	@Override
	public List<Departamento> mostrarDepartamentos() {
		
		depar=new Departamento();
		
		sql="select * from departamentos";
		
		try {
			
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				ps.setInt(1, depar.getIdDepar());
				ps.setString(2, depar.getNombre());
				ps.setString(3, depar.getDireccion());
				
				lista.add(depar);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return lista;
	}
	
	

}//End DepartamentoDaoImplMy8
