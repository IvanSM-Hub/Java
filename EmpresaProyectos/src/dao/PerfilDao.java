package dao;

import java.util.ArrayList;
import java.util.List;

import javabeans.Perfil;

public interface PerfilDao {
	
	List<Perfil> lista = new ArrayList<>();
	
	/**
	 * Envia un objeto de la clase Perfil a la base de datos para que se vea reflejado en el listado de la tabla perfiles
	 * <br>
	 * @param Perfil
	 * @return int
	 */
	int altaPerfil (Perfil perfil);
	
	/**
	 * Elimina el Perfil pasando su idPerfil de la base de datos.
	 * <br>
	 * @param idPerfil
	 * @return int
	 */
	int eliminarPerfil(int idPerfil);
	
	/**
	 * Modificar uno de los campos que forman los datos del perfil seleccionado mediante el idPerfil pasado.
	 * <br>
	 * @param perfil
	 * @return int
	 */
	int modificarPerfil(Perfil perfil);
	
	/**
	 * Encontrar un perfil passando el idPerfil del empleado que se quiere mostrar.
	 * <br>
	 * @param idPerfil
	 * @return Perfil
	 */
	Perfil buscarPerfil(int idPerfil);
	
	/**
	 * Muestra todos los perfil que forman la tabla de Perfiles, y los devuelve en una lista.
	 * <br>
	 * @return List<Perfil>
	 */
	List<Perfil> mostrarPerfiles();

}//End PerfilDao
