package dao;

import java.util.ArrayList;
import java.util.List;

import javabeans.Factura;

public interface FacturaDao {
	
	List<Factura> lista = new ArrayList<>();
	
	/**
	 * Envia un objeto de la clase Factura a la base de datos para que se vea reflejado en el listado de la tabla Factura
	 * <br>
	 * @param Factura
	 * @return int
	 */
	int altaFactura (Factura factura);
	
	/**
	 * Elimina el Factura pasando su idFactura de la base de datos.
	 * <br>
	 * @param idFactura
	 * @return int
	 */
	int eliminarFactura(int idFactura);
	
	/**
	 * Modificar uno de los campos que forman los datos del Factura seleccionado mediante el idFactura pasado.
	 * <br>
	 * @param Factura
	 * @return int
	 */
	int modificarFactura(Factura factura);
	
	/**
	 * Encontrar una Factura passando el idFactura del empleado que se quiere mostrar.
	 * <br>
	 * @param idFactura
	 * @return Factura
	 */
	Factura buscarFactura(int idFactura);
	
	/**
	 * Muestra todos los perfil que forman la tabla de Perfiles, y los devuelve en una lista.
	 * <br>
	 * @return List<Perfil>
	 */
	List<Factura> mostrarFacturas();

}//End FacturaDao
