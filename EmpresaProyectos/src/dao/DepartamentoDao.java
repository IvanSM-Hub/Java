package dao;

import java.util.ArrayList;
import java.util.List;

import javabeans.Departamento;

public interface DepartamentoDao {
	
List<Departamento> lista = new ArrayList<>();
	
	/**
	 * Envia un objeto de la clase cliente a la base de datos para que se vea reflejado en el listado de la tabla clientes
	 * <br>
	 * @param cliente
	 * @return int
	 */
	int altaDepartamento(Departamento departamento);
	
	/**
	 * Elimina el Cliente pasando su cif de la base de datos.
	 * <br>
	 * @param cif
	 * @return int
	 */
	int eliminarDepartamento(int idDepar);
	
	/**
	 * Modificar uno de los campos que forman los datos del cliente seleccionado mediante el cif pasado.
	 * <br>
	 * @param cif
	 * @return Cliente
	 */
	int modificarDepartamento(Departamento cliente);
	
	/**
	 * Encontrar un cliente passando el cif del cliente que se quiere mostrar.
	 * <br>
	 * @param cif
	 * @return Cliente
	 */
	Departamento buscarDepartamento(int idDepar);
	
	/**
	 * Muestra todos los clientes que forman la tabla de Clientes, y los devuelve en una lista.
	 * <br>
	 * @return List<Cliente>
	 */
	List<Departamento> mostrarDepartamentos();

}//End DepartamentoDao
