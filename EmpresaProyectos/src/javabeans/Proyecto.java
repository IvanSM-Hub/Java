package javabeans;

import java.sql.Date;
import java.util.Objects;

public class Proyecto {
	
	private int idProyecto;
	private String descripcion;
	private Date fechaInicio;
	private Date fechaPrevisto;
	private Date fechaReal;
	private double ventaPrevisto;
	private double costesPrevisto;
	private double costesReal;
	private String estado;
	private Empleado jefeProyecto;
	private Cliente cif;
	
	public Proyecto() {
		super();
	}

	public Proyecto(int idProyecto, String descripcion, Date fechaInicio, Date fechaPrevisto, Date fechaReal,
			double ventaPrevisto, double costesPrevisto, double costesReal, String estado, Empleado jefeProyecto,
			Cliente cif) {
		super();
		this.idProyecto = idProyecto;
		this.descripcion = descripcion;
		this.fechaInicio = fechaInicio;
		this.fechaPrevisto = fechaPrevisto;
		this.fechaReal = fechaReal;
		this.ventaPrevisto = ventaPrevisto;
		this.costesPrevisto = costesPrevisto;
		this.costesReal = costesReal;
		this.estado = estado;
		this.jefeProyecto = jefeProyecto;
		this.cif = cif;
	}

	@Override
	public String toString() {
		return "Proyecto [idProyecto=" + idProyecto + ", descripcion=" + descripcion + ", fechaInicio=" + fechaInicio
				+ ", fechaPrevisto=" + fechaPrevisto + ", fechaReal=" + fechaReal + ", ventaPrevisto=" + ventaPrevisto
				+ ", costesPrevisto=" + costesPrevisto + ", costesReal=" + costesReal + ", estado=" + estado
				+ ", jefeProyecto=" + jefeProyecto + ", cif=" + cif + "]";
	}

	public int getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(int idProyecto) {
		this.idProyecto = idProyecto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaPrevisto() {
		return fechaPrevisto;
	}

	public void setFechaPrevisto(Date fechaPrevisto) {
		this.fechaPrevisto = fechaPrevisto;
	}

	public Date getFechaReal() {
		return fechaReal;
	}

	public void setFechaReal(Date fechaReal) {
		this.fechaReal = fechaReal;
	}

	public double getVentaPrevisto() {
		return ventaPrevisto;
	}

	public void setVentaPrevisto(double ventaPrevisto) {
		this.ventaPrevisto = ventaPrevisto;
	}

	public double getCostesPrevisto() {
		return costesPrevisto;
	}

	public void setCostesPrevisto(double costesPrevisto) {
		this.costesPrevisto = costesPrevisto;
	}

	public double getCostesReal() {
		return costesReal;
	}

	public void setCostesReal(double costesReal) {
		this.costesReal = costesReal;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Empleado getJefeProyecto() {
		return jefeProyecto;
	}

	public void setJefeProyecto(Empleado jefeProyecto) {
		this.jefeProyecto = jefeProyecto;
	}

	public Cliente getCif() {
		return cif;
	}

	public void setCif(Cliente cif) {
		this.cif = cif;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idProyecto);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Proyecto))
			return false;
		Proyecto other = (Proyecto) obj;
		return idProyecto == other.idProyecto;
	}
	
}//End Proyecto
