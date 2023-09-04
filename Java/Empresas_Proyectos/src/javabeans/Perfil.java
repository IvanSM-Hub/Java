package javabeans;

import java.util.Objects;

public class Perfil {
	
	private int idPerfil;
	private String nombre;
	
	public Perfil() {
		super();
	}

	public Perfil(int idPerfil, String nombre) {
		super();
		this.idPerfil = idPerfil;
		this.nombre = nombre;
	}

	public int getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(int idPerfil) {
		this.idPerfil = idPerfil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Perfiles [idPerfil=" + idPerfil + ", nombre=" + nombre + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPerfil);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Perfil))
			return false;
		Perfil other = (Perfil) obj;
		return idPerfil == other.idPerfil;
	}

}//End Perfiles
