package javabeans;

import java.sql.Date;
import java.util.Objects;

public class ProyectoConEmpleado {
	
	private int numOrden;
	Proyecto idProyecto;
	Empleado idEmpleado;
	private int horasAsignadas;
	private Date fechaIncorporacion;
	
	public ProyectoConEmpleado() {
		super();
	}

	public ProyectoConEmpleado(int numOrden, Proyecto idProyecto, Empleado idEmpleado, int horasAsignadas,
			Date fechaIncorporacion) {
		super();
		this.numOrden = numOrden;
		this.idProyecto = idProyecto;
		this.idEmpleado = idEmpleado;
		this.horasAsignadas = horasAsignadas;
		this.fechaIncorporacion = fechaIncorporacion;
	}

	@Override
	public String toString() {
		return "ProyectoConEmpleado [numOrden=" + numOrden + ", idProyecto=" + idProyecto + ", idEmpleado=" + idEmpleado
				+ ", horasAsignadas=" + horasAsignadas + ", fechaIncorporacion=" + fechaIncorporacion + "]";
	}

	public int getNumOrden() {
		return numOrden;
	}

	public void setNumOrden(int numOrden) {
		this.numOrden = numOrden;
	}

	public Proyecto getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(Proyecto idProyecto) {
		this.idProyecto = idProyecto;
	}

	public Empleado getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(Empleado idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public int getHorasAsignadas() {
		return horasAsignadas;
	}

	public void setHorasAsignadas(int horasAsignadas) {
		this.horasAsignadas = horasAsignadas;
	}

	public Date getFechaIncorporacion() {
		return fechaIncorporacion;
	}

	public void setFechaIncorporacion(Date fechaIncorporacion) {
		this.fechaIncorporacion = fechaIncorporacion;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numOrden);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof ProyectoConEmpleado))
			return false;
		ProyectoConEmpleado other = (ProyectoConEmpleado) obj;
		return numOrden == other.numOrden;
	}

}//End ProyectoConEmpleado
