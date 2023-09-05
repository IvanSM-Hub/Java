package javabeans;

import java.util.Objects;

public class Cliente {
	
	private String cif;
	private String nombre, apellidos, domiciolio;
	private double factuaracionAnual;
	private int numeroEmplados;
	
	public Cliente() {
		super();
	}

	public Cliente(String cif, String nombre, String apellidos, String domiciolio, double factuaracionAnual,
			int numeroEmplados) {
		super();
		this.cif = cif;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.domiciolio = domiciolio;
		this.factuaracionAnual = factuaracionAnual;
		this.numeroEmplados = numeroEmplados;
	}

	@Override
	public String toString() {
		return "Cliente [cif=" + cif + ", nombre=" + nombre + ", apellidos=" + apellidos + ", domiciolio=" + domiciolio
				+ ", factuaracionAnual=" + factuaracionAnual + ", numeroEmplados=" + numeroEmplados + "]";
	}

	public String getCif() {
		return cif;
	}

	public void setCif(String cif) {
		this.cif = cif;
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

	public String getDomiciolio() {
		return domiciolio;
	}

	public void setDomiciolio(String domiciolio) {
		this.domiciolio = domiciolio;
	}

	public double getFactuaracionAnual() {
		return factuaracionAnual;
	}

	public void setFactuaracionAnual(double factuaracionAnual) {
		this.factuaracionAnual = factuaracionAnual;
	}

	public int getNumeroEmplados() {
		return numeroEmplados;
	}

	public void setNumeroEmplados(int numeroEmplados) {
		this.numeroEmplados = numeroEmplados;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cif);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Cliente))
			return false;
		Cliente other = (Cliente) obj;
		return cif == other.cif;
	}

}//End Clientes
