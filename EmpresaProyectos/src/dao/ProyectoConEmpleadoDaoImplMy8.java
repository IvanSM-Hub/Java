package dao;

import java.sql.SQLException;
import java.util.List;

import Conexion.AbstractDaoMy8;
import javabeans.Factura;
import javabeans.ProyectoConEmpleado;

public class ProyectoConEmpleadoDaoImplMy8 extends AbstractDaoMy8 implements ProyectoConEmpleadoDao {
	
	ProyectoConEmpleado proyEmp = null;
	ProyectoDao proyDao = null;
	EmpleadoDao empDao = null;
	

	@Override
	public int altaProyectoConEmpleado(ProyectoConEmpleado proyectoConEmpleado) {
		sql="insert into proyecto_con_empleados values(?,?,?)";
		
		try {
			
			ps=conn.prepareStatement(sql);
			
			ps.setInt(1, proyectoConEmpleado.getNumOrden())	;
			ps.setInt(2, proyectoConEmpleado.getIdProyecto().getIdProyecto());
			ps.setInt(3, proyectoConEmpleado.getIdEmpleado().getIdEmpleado());
			ps.setInt(4, proyectoConEmpleado.getHorasAsignadas());
			ps.setDate(5, proyectoConEmpleado.getFechaIncorporacion());
			
			filas=ps.executeUpdate();
			
			filas=1;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return filas;
	}

	@Override
	public int eliminarProyectoConEmpleado(int numOrden) {
		
		sql="delete from proyecto_con_empleados where numero_orden=?";
		
		try {
			
			ps=conn.prepareStatement(sql);
			
			ps.setInt(1, numOrden);
			
			filas=ps.executeUpdate();
			
			filas=1;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return filas;
		
	}

	@Override
	public int modificarProyectoConEmpleado(ProyectoConEmpleado proyectoConEmpleado) {
		sql="update proyecto_con_empleados set id_proyecto=?,id_empl=?,horas_asignadas=?,fecha_incorporacion=? where numero_orden=?";
		
		try {
			
			ps=conn.prepareStatement(sql);
			
			ps.setInt(1, proyectoConEmpleado.getIdProyecto().getIdProyecto());
			ps.setInt(2, proyectoConEmpleado.getIdEmpleado().getIdEmpleado());
			ps.setInt(3, proyectoConEmpleado.getHorasAsignadas());
			ps.setDate(4, proyectoConEmpleado.getFechaIncorporacion());
			ps.setInt(5, proyectoConEmpleado.getNumOrden());
			
			filas=ps.executeUpdate();
			
			filas=1;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return filas;
	}

	@Override
	public ProyectoConEmpleado buscarProyectoConEmpleado(int numOrden) {
		
		sql="select * from proyecto_con_empleados where numero_orden=?";
		proyEmp = new ProyectoConEmpleado();
		proyDao = new ProyectoDaoImplMy8();
		empDao = new EmpleadoDaoImplMy8();
		
		try {
			
			ps=conn.prepareStatement(sql);
			ps.setInt(1, numOrden);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				proyEmp.setNumOrden(rs.getInt(1));
				proyEmp.setIdProyecto(proyDao.buscarProyecto(rs.getInt(2)));	
				proyEmp.setIdEmpleado(empDao.buscarEmpleado(rs.getInt(3)));
				proyEmp.setHorasAsignadas(rs.getInt(4));
				proyEmp.setFechaIncorporacion(rs.getDate(5));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return proyEmp;
	}

	@Override
	public List<ProyectoConEmpleado> mostrarProyectoConEmpleados() {
		sql="select * from proyecto_con_empleados";
		
		try {
			
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				
				proyEmp = new ProyectoConEmpleado();
				proyDao = new ProyectoDaoImplMy8();
				empDao = new EmpleadoDaoImplMy8();
				
				proyEmp.setNumOrden(rs.getInt(1));
				proyEmp.setIdProyecto(proyDao.buscarProyecto(rs.getInt(2)));	
				proyEmp.setIdEmpleado(empDao.buscarEmpleado(rs.getInt(3)));
				proyEmp.setHorasAsignadas(rs.getInt(4));
				proyEmp.setFechaIncorporacion(rs.getDate(5));
				
				lista.add(proyEmp);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}

}//End ProyectoConEmpleadoDaoImplMy8
