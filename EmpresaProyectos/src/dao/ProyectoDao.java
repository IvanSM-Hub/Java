package dao;

import java.util.ArrayList;
import java.util.List;

import javabeans.Proyecto;

public interface ProyectoDao {
	
	List<Proyecto> lista = new ArrayList<>();
	
	/**
	 * Envia un objeto de la clase Proyecto a la base de datos para que se vea reflejado en el listado de la tabla perfiles
	 * <br>
	 * @param Proyecto
	 * @return int
	 */
	int altaProyecto (Proyecto proyecto);
	
	/**
	 * Elimina el Proyecto pasando su idProyecto de la base de datos.
	 * <br>
	 * @param idProyecto
	 * @return int
	 */
	int eliminarProyecto(int idProyecto);
	
	/**
	 * Modificar uno de los campos que forman los datos del Proyecto seleccionado mediante el idProyecto pasado.
	 * <br>
	 * @param perfil
	 * @return int
	 */
	int modificarProyecto(Proyecto proyecto);
	
	/**
	 * Encontrar un Proyecto passando el idProyecto del empleado que se quiere mostrar.
	 * <br>
	 * @param idProyecto
	 * @return Proyecto
	 */
	Proyecto buscarProyecto(int idProyecto);
	
	/**
	 * Muestra todos los Proyecto que forman la tabla de Proyectos, y los devuelve en una lista.
	 * <br>
	 * @return List<Proyecto>
	 */
	List<Proyecto> mostrarProyectos();

}//End ProyectoDao
