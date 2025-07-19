package logico;

import java.util.Date;

public class Postulacion {
	private String idPostulacion;
	private Candidato elCandidato;
	private Date fechaPostulacion;
	private String estadoPostulacion; //pendiente, pausada, aceptada
	protected String jordanaDeseada; //Si tiempo parcial o tiempo completo
	protected String modalidadEmpleo; //Si remota, presencial o híbrido
	protected boolean vehiculoPropio;
	protected boolean puedeMudarse;
	protected float salarioEsperado;
	protected int aniosExperiencia;
	
	public Postulacion(String idPostulacion, Candidato elCandidato, Date fechaPostulacion, String estadoPostulacion,
			String jordanaDeseada, String modalidadEmpleo, boolean vehiculoPropio, boolean puedeMudarse,
			float salarioEsperado, int aniosExperiencia) {
		super();
		this.idPostulacion = idPostulacion;
		this.elCandidato = elCandidato;
		this.fechaPostulacion = fechaPostulacion;
		this.estadoPostulacion = "pendiente";
		this.jordanaDeseada = jordanaDeseada;
		this.modalidadEmpleo = modalidadEmpleo;
		this.vehiculoPropio = vehiculoPropio;
		this.puedeMudarse = puedeMudarse;
		this.salarioEsperado = salarioEsperado;
		this.aniosExperiencia = aniosExperiencia;
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

	public String isEstadoPostulacion() {
		return estadoPostulacion;
	}

	public void setEstadoPostulacion(String estadoPostulacion) {
		this.estadoPostulacion = estadoPostulacion;
	}

	public String getJordanaDeseada() {
		return jordanaDeseada;
	}

	public void setJordanaDeseada(String jordanaDeseada) {
		this.jordanaDeseada = jordanaDeseada;
	}

	public String getModalidadEmpleo() {
		return modalidadEmpleo;
	}

	public void setModalidadEmpleo(String modalidadEmpleo) {
		this.modalidadEmpleo = modalidadEmpleo;
	}

	public boolean isVehiculoPropio() {
		return vehiculoPropio;
	}

	public void setVehiculoPropio(boolean vehiculoPropio) {
		this.vehiculoPropio = vehiculoPropio;
	}

	public boolean isPuedeMudarse() {
		return puedeMudarse;
	}

	public void setPuedeMudarse(boolean puedeMudarse) {
		this.puedeMudarse = puedeMudarse;
	}

	public float getSalarioEsperado() {
		return salarioEsperado;
	}

	public void setSalarioEsperado(float salarioEsperado) {
		this.salarioEsperado = salarioEsperado;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
}
