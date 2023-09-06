package dao;

import java.sql.SQLException;
import java.util.List;

import Conexion.AbstractDaoMy8;
import javabeans.Perfil;

public class PerfilDaoImplMy8 extends AbstractDaoMy8 implements PerfilDao {
	
	Perfil perf = null;

	@Override
	public int altaPerfil(Perfil perfil) {
		
		sql="insert into perfiles values(?,?)";
		
		try {
			
			ps=conn.prepareStatement(sql);
			
			ps.setInt(1, perfil.getIdPerfil());
			ps.setString(2, perfil.getNombre());
			
			filas=ps.executeUpdate();
			
			filas=1;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return filas;
	}

	@Override
	public int eliminarPerfil(int idPerfil) {
		
		sql="delete from perfiles where id_factura=?";
		
		try {
			
			ps=conn.prepareStatement(sql);
			ps.setInt(1, idPerfil);
			
			filas=ps.executeUpdate();
			
			filas=1;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return filas;
	}

	@Override
	public int modificarPerfil(Perfil perfil) {
		
		sql="update perfiles set nombre=? where=?";
		
		try {
			
			ps=conn.prepareStatement(sql);
			
			ps.setString(1, perfil.getNombre());
			ps.setInt(2, perfil.getIdPerfil());
			
			filas=ps.executeUpdate();
			
			filas=1;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return filas;
	}

	@Override
	public Perfil buscarPerfil(int idPerfil) {
		
		sql="select * from perfiles where=?";
		perf = new Perfil();
		
		try {
			
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idPerfil);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				perf.setIdPerfil(rs.getInt(1));
				perf.setNombre(rs.getString(2));
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
		return perf;
	}

	@Override
	public List<Perfil> mostrarPerfiles() {
		
		sql="select * from perfiles";
		
		try {
			
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				
				perf = new Perfil();
				
				perf.setIdPerfil(rs.getInt(1));
				perf.setNombre(rs.getString(2));
				
				lista.add(perf);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}

}//End PerfilDaoImplMy8
