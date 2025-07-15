package logico;

import java.util.Date;

public class Postulacion {
	private String idPostulacion;
	private Candidato elCandidato;
	private Date fechaPostulacion;
	private boolean estadoPostulacion; //Si es aceptada o pendiente
	
	public Postulacion(String idPostulacion, Candidato elCandidato, Date fechaPostulacion, boolean estadoPostulacion) {
		super();
		this.idPostulacion = idPostulacion;
		this.elCandidato = elCandidato;
		this.fechaPostulacion = fechaPostulacion;
		this.estadoPostulacion = estadoPostulacion;
	}

	public String getIdPostulacion() {
		return idPostulacion;
	}

	public void setIdPostulacion(String idPostulacion) {
		this.idPostulacion = idPostulacion;
	}

	public Candidato getElCandidato() {
		return elCandidato;
	}

	public void setElCandidato(Candidato elCandidato) {
		this.elCandidato = elCandidato;
	}

	public Date getFechaPostulacion() {
		return fechaPostulacion;
	}

	public void setFechaPostulacion(Date fechaPostulacion) {
		this.fechaPostulacion = fechaPostulacion;
	}

	public boolean isEstadoPostulacion() {
		return estadoPostulacion;
	}

	public void setEstadoPostulacion(boolean estadoPostulacion) {
		this.estadoPostulacion = estadoPostulacion;
	}
}
