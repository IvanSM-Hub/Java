package dao;

import java.util.ArrayList;
import java.util.List;

import javabeans.ProyectoConEmpleado;

public interface ProyectoConEmpleadoDao {
	
	List<ProyectoConEmpleado> lista = new ArrayList<>();
	
	/**
	 * Envia un objeto de la clase ProyectoConEmpleado a la base de datos para que se vea reflejado en el listado de la tabla ProyectoConEmpleados
	 * <br>
	 * @param ProyectoConEmpleado
	 * @return int
	 */
	int altaProyectoConEmpleado (ProyectoConEmpleado proyectoConEmpleado);
	
	/**
	 * Elimina el Factura pasando su idFactura de la base de datos.
	 * <br>
	 * @param numOrden
	 * @return int
	 */
	int eliminarProyectoConEmpleado(int numOrden);
	
	/**
	 * Modificar uno de los campos que forman los datos del Factura seleccionado mediante el idFactura pasado.
	 * <br>
	 * @param Factura
	 * @return int
	 */
	int modificarProyectoConEmpleado(ProyectoConEmpleado proyectoConEmpleado);
	
	/**
	 * Encontrar una ProyectoConEmpleado passando el idFactura del empleado que se quiere mostrar.
	 * <br>
	 * @param numOrden
	 * @return ProyectoConEmpleado
	 */
	ProyectoConEmpleado buscarProyectoConEmpleado(int numOrden);
	
	/**
	 * Muestra todos los Proyectos Con Empleados que forman la tabla de ProyectoConEmpleados, y los devuelve en una lista.
	 * <br>
	 * @return List<Perfil>
	 */
	List<ProyectoConEmpleado> mostrarProyectoConEmpleados();

}//End ProyectoDaoConEmpleadoDaoImplMy8
