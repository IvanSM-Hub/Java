package dao;

import java.util.ArrayList;
import java.util.List;

import javabeans.Cliente;

public interface ClienteDao {
	
	List<Cliente> lista = new ArrayList<>();
	
	/**
	 * Envia un objeto de la clase cliente a la base de datos para que se vea reflejado en el listado de la tabla clientes
	 * <br>
	 * @param cliente
	 * @return int
	 */
	int altaCliente(Cliente cliente);
	
	/**
	 * Elimina el Cliente pasando su cif de la base de datos.
	 * <br>
	 * @param cif
	 * @return int
	 */
	int eliminarCliente(String cif);
	
	/**
	 * Modificar uno de los campos que forman los datos del cliente seleccionado mediante el cif pasado.
	 * <br>
	 * @param cif
	 * @return Cliente
	 */
	int modificarCliente(Cliente cliente);
	
	/**
	 * Encontrar un cliente passando el cif del cliente que se quiere mostrar.
	 * <br>
	 * @param cif
	 * @return Cliente
	 */
	Cliente buscarCliente(String cif);
	
	/**
	 * Muestra todos los clientes que forman la tabla de Clientes, y los devuelve en una lista.
	 * <br>
	 * @return List<Cliente>
	 */
	List<Cliente> mostrarClientes();

}//End ClienteDao
