package dao;

import java.sql.SQLException;
import java.util.List;

import Conexion.AbstractDaoMy8;
import javabeans.Proyecto;

public class ProyectoDaoImplMy8 extends AbstractDaoMy8 implements ProyectoDao {
	
	private Proyecto proy = null;
	private EmpleadoDao empDao = null;
	private ClienteDao cliDao = null;

	@Override
	public int altaProyecto(Proyecto proyecto) {
		
		sql="insert into proyectos values(?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			
			ps=conn.prepareStatement(sql);
			
			ps.setInt(1, proyecto.getIdProyecto());
			ps.setString(2, proyecto.getDescripcion());
			ps.setDate(3, proyecto.getFechaInicio());
			ps.setDate(4, proyecto.getFechaPrevisto());
			ps.setDate(5, proyecto.getFechaReal());
			ps.setDouble(6, proyecto.getVentaPrevisto());
			ps.setDouble(7, proyecto.getCostesPrevisto());
			ps.setDouble(8, proyecto.getCostesReal());
			ps.setString(9, proyecto.getEstado());
			ps.setInt(10, proyecto.getJefeProyecto().getIdEmpleado());
			ps.setString(11, proyecto.getCif().getCif());
			
			filas=ps.executeUpdate();
			
			filas=1;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return filas;
	}

	@Override
	public int eliminarProyecto(int idProyecto) {
		
		sql="delete from proyectos where id_proyecto=?";
		
		try {
			
			ps=conn.prepareStatement(sql);
			ps.setInt(1, idProyecto);
			
			filas=ps.executeUpdate();
			
			filas=1;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return filas;
	}

	@Override
	public int modificarProyecto(Proyecto proyecto) {
		
		sql="update proyectos set descripcion=?,fecha_inicio=?,fecha_fin_previsto=?,fecha_fin_real=?,venta_previsto=?,costes_previsto=?,coste_real=?,estado=?,jefe_proyecto=?,cif=? where id_proyecto=?";
		
		try {
			
			ps=conn.prepareStatement(sql);
			
			ps.setString(1, proyecto.getDescripcion());
			ps.setDate(2, proyecto.getFechaInicio());
			ps.setDate(3, proyecto.getFechaPrevisto());
			ps.setDate(4, proyecto.getFechaReal());
			ps.setDouble(5, proyecto.getVentaPrevisto());
			ps.setDouble(6, proyecto.getCostesPrevisto());
			ps.setDouble(7, proyecto.getCostesReal());
			ps.setString(8, proyecto.getEstado());
			ps.setInt(9, proyecto.getJefeProyecto().getIdEmpleado());
			ps.setString(10, proyecto.getCif().getCif());
			ps.setInt(11, proyecto.getIdProyecto());
			
			filas=ps.executeUpdate();
			
			filas=1;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return filas;
	}

	@Override
	public Proyecto buscarProyecto(int idProyecto) {
		
		sql="select * from proyectos where id_proyectos=?";
		proy = new Proyecto();
		empDao = new EmpleadoDaoImplMy8();
		cliDao = new ClienteDaoImplMy8();
		
		try {
			
			ps=conn.prepareStatement(sql);
			ps.setInt(1, idProyecto);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				
				proy.setIdProyecto(rs.getInt(1));
				proy.setDescripcion(rs.getString(2));
				proy.setFechaInicio(rs.getDate(3));
				proy.setFechaPrevisto(rs.getDate(4));
				proy.setFechaReal(rs.getDate(5));
				proy.setVentaPrevisto(rs.getDouble(6));
				proy.setCostesPrevisto(rs.getDouble(7));
				proy.setCostesReal(rs.getDouble(8));
				proy.setEstado(rs.getNString(9));
				proy.setJefeProyecto(empDao.buscarEmpleado(rs.getInt(10)));
				proy.setCif(cliDao.buscarCliente(rs.getString(11)));
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return proy;
	}

	@Override
	public List<Proyecto> mostrarProyectos() {
		
		sql="select * from proyectos";
		
		try {
			
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			
			while(rs.next()) {
				
				proy = new Proyecto();
				empDao = new EmpleadoDaoImplMy8();
				cliDao = new ClienteDaoImplMy8();
				
				proy.setIdProyecto(rs.getInt(1));
				proy.setDescripcion(rs.getString(2));
				proy.setFechaInicio(rs.getDate(3));
				proy.setFechaPrevisto(rs.getDate(4));
				proy.setFechaReal(rs.getDate(5));
				proy.setVentaPrevisto(rs.getDouble(6));
				proy.setCostesPrevisto(rs.getDouble(7));
				proy.setCostesReal(rs.getDouble(8));
				proy.setEstado(rs.getNString(9));
				proy.setJefeProyecto(empDao.buscarEmpleado(rs.getInt(10)));
				proy.setCif(cliDao.buscarCliente(rs.getString(11)));
				
				lista.add(proy);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}

}//End ProyectoDaoImplMy8
