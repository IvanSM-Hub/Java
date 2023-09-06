package dao;

import java.sql.SQLException;
import java.util.List;

import Conexion.AbstractDaoMy8;
import javabeans.Empleado;

public class EmpleadoDaoImplMy8 extends AbstractDaoMy8 implements EmpleadoDao {
	
	private Empleado emp = null;
	private DepartamentoDao deparDao = null;
	private PerfilDao perfilDao = null;

	@Override
	public int altaEmpleado(Empleado empleado) {
		sql="insert into empleados values (?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			
			ps=conn.prepareStatement(sql);
			
			ps.setInt(1, empleado.getIdEmpleado());
			ps.setString(2, empleado.getNombre());
			ps.setString(3, empleado.getApellidos());
			ps.setString(4, empleado.getEmail());
			ps.setString(5, empleado.getPassword());
			ps.setString(6, String.valueOf(empleado.getGenero()));
			ps.setDouble(7, empleado.getSalario());
			ps.setDate(8, empleado.getFechaIngreso());
			ps.setDate(9, empleado.getFechaNacimiento());
			ps.setInt(10, empleado.getPerfil().getIdPerfil());
			ps.setInt(11, empleado.getDepartamento().getIdDepar());
			
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
		
		sql="update empleados set nombre=?,apellidos=?,email=?,password=?,genero=?,salario=?,fecha_ingreso=?,fecha_nacimiento=?,id_perfil=?,id_depart=? where id_empl=?";
		
		try {
			
			ps=conn.prepareStatement(sql);
			
			ps.setString(1, empleado.getNombre());
			ps.setString(2, empleado.getApellidos());
			ps.setString(3, empleado.getEmail());
			ps.setString(4, empleado.getPassword());
			ps.setString(5, String.valueOf(empleado.getGenero()));
			ps.setDouble(5, empleado.getSalario());
			ps.setDate(6, empleado.getFechaIngreso());
			ps.setDate(7, empleado.getFechaNacimiento());
			ps.setInt(8, empleado.getPerfil().getIdPerfil());
			ps.setInt(9, empleado.getDepartamento().getIdDepar());
			ps.setInt(10, empleado.getIdEmpleado());
			
			filas=ps.executeUpdate();
			
			filas=1;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return filas;
	}

	@Override
	public Empleado buscarEmpleado(int idEmpleado) {
		
		sql="select * from empleados where id_empl=?";
		emp = new Empleado();
		perfilDao = new PerfilDaoImplMy8();
		deparDao = new DepartamentoDaoImplMy8();
		
		try {
			
			ps=conn.prepareStatement(sql);
			ps.setInt(1, idEmpleado);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				emp.setIdEmpleado(rs.getInt(1));
				emp.setNombre(rs.getString(2));
				emp.setApellidos(rs.getString(3));
				emp.setEmail(rs.getString(4));
				emp.setPassword(rs.getString(5));
				emp.setGenero(rs.getString(6).charAt(0));
				emp.setSalario(rs.getDouble(7));
				emp.setFechaIngreso(rs.getDate(8));
				emp.setFechaNacimiento(rs.getDate(9));
				emp.setPerfil(perfilDao.buscarPerfil(rs.getInt(10)));
				emp.setDepartamentos(deparDao.buscarDepartamento(rs.getInt(11)));
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return emp;
	}

	@Override
	public List<Empleado> mostrarEmpleados() {
		
		sql="select * from empleados";
		
		try {
			
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				
				emp = new Empleado();
				perfilDao = new PerfilDaoImplMy8();
				deparDao = new DepartamentoDaoImplMy8();
				
				emp.setIdEmpleado(rs.getInt(1));
				emp.setNombre(rs.getString(2));
				emp.setApellidos(rs.getString(3));
				emp.setEmail(rs.getString(4));
				emp.setPassword(rs.getString(5));
				emp.setGenero(rs.getString(6).charAt(0));
				emp.setSalario(rs.getDouble(7));
				emp.setFechaIngreso(rs.getDate(8));
				emp.setFechaNacimiento(rs.getDate(9));
				emp.setPerfil(perfilDao.buscarPerfil(rs.getInt(10)));
				emp.setDepartamentos(deparDao.buscarDepartamento(rs.getInt(11)));
				
				lista.add(emp);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}
	
	

}//End EmpleadoDaoImplMy8
