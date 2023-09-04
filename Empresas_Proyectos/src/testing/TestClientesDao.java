package testing;

import dao.ClienteDao;
import dao.ClienteDaoImplMy8;
import javabeans.Cliente;

public class TestClientesDao {

	public static void main(String[] args) {
		
		ClienteDao cliDao = new ClienteDaoImplMy8();
		
		//testAltaCliente(cliDao);
		
		testEliminarCliente(cliDao);
		
		//testModificarCliente(cliDao);
		
		//testBuscarCliente(cliDao);
		
		//testMostrarClientes(cliDao);
		

	}//End main
	
	private static void testAltaCliente(ClienteDao cliDao) {
		
		Cliente cliAlta = new Cliente("9625826017", "Empresa D", "Gutierrez", "Calle piruleta, 123", 500000.00, 23);
		
		System.out.println("=========================================\n");
		System.out.println("Filas actulizadas en la Base de Datos: " + cliDao.altaCliente(cliAlta)+"\n");
		
	}//End testAltaCliente()
	
	private static void testEliminarCliente(ClienteDao cliDao) {
		
		System.out.println("=========================================\n");
		System.out.println("Filas eliminadas de la Base de Datos: " + cliDao.eliminarCliente("9625826017") + "\n");
		
	}//End testEliminarCliente()
	
	private static void testModificarCliente(ClienteDao cliDao) {
		
		Cliente cliMod = new Cliente("9625826017", "Empresa D", "Garcia", "Calle piruleta, 123", 800000.00, 50);
		System.out.println("=========================================\n");
		System.out.println("Filas modificadas de la Base de Datos: " + cliDao.modificarCliente(cliMod) + "\n");
		
		
	}//End testModificarCliente()
	
	private static void testBuscarCliente(ClienteDao cliDao) {
		
		System.out.println("=========================================\n");
		System.out.println(cliDao.buscarCliente("9625826017") + "\n");
		
	}//End testBuscarCliente()
	
private static void testMostrarClientes(ClienteDao cliDao) {
		
		System.out.println("=========================================\n");
		for(Cliente ele : cliDao.mostrarClientes())
			System.out.println(ele);
		
	}//End testBuscarCliente()

}//End TestClientes
