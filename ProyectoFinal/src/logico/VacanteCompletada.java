package logico;

import java.util.Date;

public class VacanteCompletada {
	private String idVacanteCompletada;
	private Date fechaContratacion;
	private Postulacion postulacionElegida;
	private Vacante vacanteElegida;
	
	public VacanteCompletada(String idVacanteCompletada, Date fechaContratacion, Postulacion postulacionElegida, Vacante vacanteElegida) {
		super();
		this.idVacanteCompletada = idVacanteCompletada;
		this.fechaContratacion = fechaContratacion;
		this.postulacionElegida = postulacionElegida;
		this.vacanteElegida = vacanteElegida;
	}

	public String getIdVacanteCompletada() {
		return idVacanteCompletada;
	}

	public void setIdVacanteCompletada(String idVacanteCompletada) {
		this.idVacanteCompletada = idVacanteCompletada;
	}

	public Date getFechaContratacion() {
		return fechaContratacion;
	}

	public void setFechaContratacion(Date fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}

	public Postulacion getPostulacionElegida() {
		return postulacionElegida;
	}

	public void setPostulacionElegida(Postulacion postulacionElegida) {
		this.postulacionElegida = postulacionElegida;
	}

	public Vacante getVacanteElegida() {
		return vacanteElegida;
	}

	public void setVacanteElegida(Vacante vacanteElegida) {
		this.vacanteElegida = vacanteElegida;
	}
}
