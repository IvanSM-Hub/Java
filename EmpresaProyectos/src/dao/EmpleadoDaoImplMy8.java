package dao;

import java.sql.SQLException;
import java.util.List;

import Conexion.AbstractDaoMy8;
import javabeans.Empleado;

public class EmpleadoDaoImplMy8 extends AbstractDaoMy8 implements EmpleadoDao {
	
	private Empleado emp = null;

	@Override
	public int altaEmpleado(Empleado empleado) {
		sql="insert into empleados values (?,?,?,?,?,?,?,?,?,?)";
		
		try {
			
			ps=conn.prepareStatement(sql);
			
			ps.setInt(1, empleado.getIdEmpleado());
			ps.setString(2, empleado.getNombre());
			ps.setString(3, empleado.getApellidos());
			ps.setString(4, empleado.getEmail());
			ps.setString(5, empleado.getPassword());
			ps.setDouble(6, empleado.getSalario());
			ps.setDate(7, empleado.getFechaIngreso());
			ps.setDate(8, empleado.getFechaNacimiento());
			ps.setInt(9, empleado.getPerfil().getIdPerfil());
			ps.setInt(10, empleado.getDepartamento().getIdDepar());
			
			filas=ps.executeUpdate();
			
			filas=1;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return filas;
	}

	@Override
	public int eliminarEmpleado(int idEmpleado) {
		
		sql="delete from empleados where idEmpleado=?";
		
		try {
			
			ps=conn.prepareStatement(sql);
			
			ps.setInt(1, idEmpleado);
			
			filas=ps.executeUpdate();
			
			filas=1;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return filas;
	}

	@Override
	public int modificarEmpleado(Empleado empleado) {
		
		sql="update empleados set nombre=?,apellidos=?,email=?,password=?,salario=?,fecha_ingreso=?,fecha_nacimiento=?,id_perfil=?,id_depart=? where id_empl=?";
		
		try {
			ps=conn.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return filas;
	}

	@Override
	public Empleado buscarEmpleado(int idEmpleado) {
		emp = new Empleado();
		
		
		return emp;
	}

	@Override
	public List<Empleado> mostrarEmpleados() {
		// TODO Auto-generated method stub
		return lista;
	}
	
	

}//End EmpleadoDaoImplMy8
