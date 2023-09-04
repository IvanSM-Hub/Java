package dao;

import java.sql.SQLException;
import java.util.List;

import Conexion.AbstractDaoMy8;
import javabeans.Cliente;

public class ClienteDaoImplMy8 extends AbstractDaoMy8 implements ClienteDao {

	@Override
	public int altaCliente(Cliente cliente) {
		
		sql="insert into clientes values(?,?,?,?,?,?)";
		
		try {
			ps=conn.prepareStatement(sql);
			
			ps.setString(1, cliente.getCif());
			ps.setString(2,cliente.getNombre());
			ps.setString(3, cliente.getApellidos());
			ps.setString(4, cliente.getDomiciolio());
			ps.setDouble(5, cliente.getFactuaracionAnual());
			ps.setInt(6, cliente.getNumeroEmplados());
			
			filas=ps.executeUpdate();
			
			filas=1;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return filas;
		
	}//End altaCliente()

	@Override
	public int eliminarCliente(String cif) {
		
		sql="delete from clientes where cif=?";
		
		try {
			
			ps=conn.prepareStatement(sql);
			
			ps.setString(1, cif);
			
			filas=ps.executeUpdate();
			
			filas=1;
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return filas;
		
	}

	@Override
	public int modificarCliente(Cliente cliente) {
		
		sql="update clientes set nombre=?, apellidos=?, domicilio=?, facturacion_anual=?, numero_empleados=? where cif=?";
		
		try {
			
			ps=conn.prepareStatement(sql);
			
			ps.setString(1, cliente.getNombre());
			ps.setString(2, cliente.getApellidos());
			ps.setString(3, cliente.getDomiciolio());
			ps.setDouble(4, cliente.getFactuaracionAnual());
			ps.setInt(5, cliente.getNumeroEmplados());
			ps.setString(6, cliente.getCif());
			
			filas=ps.executeUpdate();
			
			filas=1;
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return filas;
	}

	@Override
	public Cliente buscarCliente(String cif) {
		
		sql="select * from clientes where cif=?";
		
		Cliente cli = new Cliente();
		
		try {
			
			ps=conn.prepareStatement(sql);
			ps.setString(1, cif);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				cli.setCif(rs.getString(1));
				cli.setNombre(rs.getString(2));
				cli.setApellidos(rs.getString(3));
				cli.setDomiciolio(rs.getString(4));
				cli.setFactuaracionAnual(rs.getDouble(5));
				cli.setNumeroEmplados(rs.getInt(6));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cli;
	}

	@Override
	public List<Cliente> mostrarClientes() {
		
		sql="select * from clientes";
		Cliente cli = null;
		
		try {
			ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			while(rs.next()) {
				
				cli = new Cliente();
				
				cli.setCif(rs.getString(1));
				cli.setNombre(rs.getString(2));
				cli.setApellidos(rs.getString(3));
				cli.setDomiciolio(rs.getString(4));
				cli.setFactuaracionAnual(rs.getDouble(5));
				cli.setNumeroEmplados(rs.getInt(6));
				
				lista.add(cli);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return lista;
	}

}//End ClienteDaoImplMy8
