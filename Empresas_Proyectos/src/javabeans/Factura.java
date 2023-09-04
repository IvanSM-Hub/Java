package javabeans;

import java.util.Objects;

public class Factura {
	
	private int idFactura;
	private String descripcion;
	Proyecto idProyecto;
	
	public Factura() {
		super();
	}
	
	public Factura(int idFactura, String descripcion, Proyecto idProyecto) {
		super();
		this.idFactura = idFactura;
		this.descripcion = descripcion;
		this.idProyecto = idProyecto;
	}

	@Override
	public String toString() {
		return "Factura [idFactura=" + idFactura + ", descripcion=" + descripcion + ", idProyecto=" + idProyecto + "]";
	}

	public int getIdFactura() {
		return idFactura;
	}

	public void setIdFactura(int idFactura) {
		this.idFactura = idFactura;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Proyecto getIdProyecto() {
		return idProyecto;
	}

	public void setIdProyecto(Proyecto idProyecto) {
		this.idProyecto = idProyecto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idFactura);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Factura))
			return false;
		Factura other = (Factura) obj;
		return idFactura == other.idFactura;
	}

}//End Facturas
