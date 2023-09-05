package javabeans;

import java.sql.Date;
import java.util.Objects;

public class Empleado {

	private int idEmpleado;
	private String nombre, apellidos, email, password;
	private char genero;
	private double salario;
	private Date fechaIngreso;
	private Date fechaNacimiento;
	Perfil idPerfil;
	Departamento idDepartamento;

	public double salarioBruto() {
		return salario;
	}

	public double salarioMensual(int meses) {
		return salarioBruto() / meses;
	}

	public String literalSexo() {
		if (genero == 'h' || genero == 'H') {
			return "Hombre";
		} else if (genero == 'm' || genero == 'M') {
			return "Mujer";
		} else {
			return "Caracter no válido.";
		}
	}
	
	public String obtenerEmail() {

		String primerApellido[] = apellidos.split(" ");
		char primeraLetraNombre = nombre.charAt(0);

		return (primeraLetraNombre + primerApellido[0]).toLowerCase();

	}

	public String nombreCompleto() {
		return nombre + " " + apellidos;
	}

	public Empleado() {
		super();
	}

	public Empleado(int idEmpleado, String nombre, String apellidos, String email,String password, char genero, double salario,
			Date fechaIngreso, Date fechaNacimiento, Perfil idPerfil, Departamento idDepartamento) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email=email;
		this.password = password;
		this.genero = genero;
		this.salario = salario;
		this.fechaIngreso = fechaIngreso;
		this.fechaNacimiento = fechaNacimiento;
		this.idPerfil = idPerfil;
		this.idDepartamento = idDepartamento;
	}

	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email +", password="
				+ password + ", genero=" + genero + ", salario=" + salario + ", fechaIngreso=" + fechaIngreso
				+ ", fechaNacimiento=" + fechaNacimiento + ", idPerfil=" + idPerfil + ", idDepartamento=" + idDepartamento
				+ "]";
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public Perfil getPerfil() {
		return idPerfil;
	}

	public void setPerfil(Perfil idPerfil) {
		this.idPerfil = idPerfil;
	}

	public Departamento getDepartamento() {
		return idDepartamento;
	}

	public void setDepartamentos(Departamento departamentos) {
		idDepartamento = departamentos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idEmpleado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Empleado))
			return false;
		Empleado other = (Empleado) obj;
		return idEmpleado == other.idEmpleado;
	}
	
}// End Empleado
