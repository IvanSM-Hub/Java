package testing;


import dao.DepartamentoDao;
import dao.DepartamentoDaoImplMy8;
import javabeans.Departamento;

public class TestDepartamentosDao {
	
public static void main(String[] args) {
		
		DepartamentoDao deparDao = new DepartamentoDaoImplMy8();
		
		testAltaDepartamento(deparDao);
		
		//testModificarDepartamento(deparDao);
		
		//testBuscarDepartamento(deparDao);
		
		//testMostrarDepartamentos(deparDao);
		
		//testEliminarDepartamento(deparDao);

	}//End main
	
	private static void testAltaDepartamento(DepartamentoDao deparDao) {
		
		Departamento deparAlta = new Departamento(6,"Administrador Sistemas","Calle Tecnológica, 678");
		
		System.out.println("=========================================\n");
		System.out.println("Filas actulizadas en la Base de Datos: " + deparDao.altaDepartamento(deparAlta) + "\n");
		
	}//End testAltaCliente()
	
	private static void testEliminarDepartamento(DepartamentoDao deparDao) {
		
		System.out.println("=========================================\n");
		System.out.println("Filas eliminadas de la Base de Datos: " + deparDao.eliminarDepartamento(0) + "\n");
		
	}//End testEliminarCliente()
	
	private static void testModificarDepartamento(DepartamentoDao deparDao) {
		
		Departamento deparMod = new Departamento(6,"Administrador Sistemas","Calle Hardware, 819");
		System.out.println("=========================================\n");
		System.out.println("Filas modificadas de la Base de Datos: " + deparDao.modificarDepartamento(deparMod) + "\n");
		
		
	}//End testModificarCliente()
	
	private static void testBuscarDepartamento(DepartamentoDao deparDao) {
		
		System.out.println("=========================================\n");
		System.out.println(deparDao.buscarDepartamento(6) + "\n");
		
	}//End testBuscarCliente()
	
private static void testMostrarDepartamentos(DepartamentoDao deparDao) {
		
		System.out.println("=========================================\n");
		for(Departamento ele : deparDao.mostrarDepartamentos())
			System.out.println(ele);
		
	}//End testBuscarCliente()

}//End TestDepartamentosDao
