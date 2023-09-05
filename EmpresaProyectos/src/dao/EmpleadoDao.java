package dao;

import java.util.ArrayList;
import java.util.List;

import javabeans.Empleado;

public interface EmpleadoDao {
	
	List<Empleado> lista = new ArrayList<>();
	
	/**
	 * Envia un objeto de la clase Empleado a la base de datos para que se vea reflejado en el listado de la tabla clientes
	 * <br>
	 * @param Empleado
	 * @return int
	 */
	int altaEmpleado (Empleado empleado);
	
	/**
	 * Elimina el Cliente pasando su cif de la base de datos.
	 * <br>
	 * @param idEMpaleado
	 * @return int
	 */
	int eliminarEmpleado(int idEmpleado);
	
	/**
	 * Modificar uno de los campos que forman los datos del empleado seleccionado mediante el idEmpleado pasado.
	 * <br>
	 * @param idEmpleado
	 * @return Empleado
	 */
	int modificarEmpleado(Empleado empleado);
	
	/**
	 * Encontrar un cliente passando el idEmpleado del empleado que se quiere mostrar.
	 * <br>
	 * @param idEmpleado
	 * @return Empleado
	 */
	Empleado buscarEmpleado(int idEmpleado);
	
	/**
	 * Muestra todos los clientes que forman la tabla de Empleados, y los devuelve en una lista.
	 * <br>
	 * @return List<Empleado>
	 */
	List<Empleado> mostrarEmpleados();

}//End EmpleadoDao
