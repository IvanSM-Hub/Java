package dao;

import java.util.ArrayList;
import java.util.List;

import javabeans.Departamento;

public interface DepartamentoDao {
	
List<Departamento> lista = new ArrayList<>();
	
	/**
	 * Envia un objeto de la clase cliente a la base de datos para que se vea reflejado en el listado de la tabla clientes
	 * <br>
	 * @param departamento
	 * @return int
	 */
	int altaDepartamento(Departamento departamento);
	
	/**
	 * Elimina el Departamento pasando su cif de la base de datos.
	 * <br>
	 * @param idDepar
	 * @return int
	 */
	int eliminarDepartamento(int idDepar);
	
	/**
	 * Modificar uno de los campos que forman los datos del departamento seleccionado mediante el cif pasado.
	 * <br>
	 * @param idDepar
	 * @return Departamento
	 */
	int modificarDepartamento(Departamento cliente);
	
	/**
	 * Encontrar un cliente passando el idDepar del departamento que se quiere mostrar.
	 * <br>
	 * @param idDepar
	 * @return Departamento
	 */
	Departamento buscarDepartamento(int idDepar);
	
	/**
	 * Muestra todos los clientes que forman la tabla de Clientes, y los devuelve en una lista.
	 * <br>
	 * @return List<Cliente>
	 */
	List<Departamento> mostrarDepartamentos();

}//End DepartamentoDao
