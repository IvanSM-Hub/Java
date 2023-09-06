package dao;

import java.sql.SQLException;
import java.util.List;

import Conexion.AbstractDaoMy8;
import javabeans.Empleado;
import javabeans.Factura;

public class FacturaDaoImplMy8 extends AbstractDaoMy8 implements FacturaDao {
	
	private Factura fac = null;
	private ProyectoDao proyDao = null;

	@Override
	public int altaFactura(Factura factura) {
		
		sql="insert into facturas values(?,?,?)";
		
		try {
			
			ps=conn.prepareStatement(sql);
			
			ps.setInt(1, factura.getIdFactura())	;
			ps.setString(2, factura.getDescripcion());
			ps.setInt(3, factura.getIdProyecto().getIdProyecto());
			
			filas=ps.executeUpdate();
			
			filas=1;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return filas;
	}

	@Override
	public int eliminarFactura(int idFactura) {
		
		sql="delete from facturas where id_factura=?";
		
		try {
			
			ps=conn.prepareStatement(sql);
			
			ps.setInt(1, idFactura);
			
			filas=ps.executeUpdate();
			
			filas=1;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return filas;
	}

	@Override
	public int modificarFactura(Factura factura) {
		
		sql="update empleados set descripcion=?,id_proyectos=? where id_empl=?";
		
		try {
			
			ps=conn.prepareStatement(sql);
			
			ps.setString(1, factura.getDescripcion());
			ps.setInt(2, factura.getIdProyecto().getIdProyecto());
			ps.setInt(3, factura.getIdFactura());
			
			filas=ps.executeUpdate();
			
			filas=1;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return filas;
	}

	@Override
	public Factura buscarFactura(int idFactura) {
		
		sql="select * from empleados where id_empl=?";
		fac = new Factura();
		proyDao = new ProyectoDaoImplMy8();
		
		try {
			
			ps=conn.prepareStatement(sql);
			ps.setInt(1, idFactura);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				fac.setIdFactura(rs.getInt(1));
				fac.setDescripcion(rs.getString(2));
				fac.setIdProyecto(proyDao.buscarProyecto(rs.getInt(3)));	
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return fac;
	}

	@Override
	public List<Factura> mostrarFacturas() {
		sql="select * from empleados";
		
		try {
			
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				
				fac = new Factura();
				proyDao = new ProyectoDaoImplMy8();
				
				fac.setIdFactura(rs.getInt(1));
				fac.setDescripcion(rs.getString(2));
				fac.setIdProyecto(proyDao.buscarProyecto(rs.getInt(3)));
				
				lista.add(fac);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}

}//End FacturaDaoImplMy8
