package logico;

import java.util.Date;

public class VacanteCompletada {
	private Date fechaContratacion;
	private Candidato candidatoElegido;
	private Vacante vacanteElegida;
	
	public VacanteCompletada(Date fechaContratacion, Candidato candidatoElegido, Vacante vacanteElegida) {
		super();
		this.fechaContratacion = fechaContratacion;
		this.candidatoElegido = candidatoElegido;
		this.vacanteElegida = vacanteElegida;
	}

	public Date getFechaContratacion() {
		return fechaContratacion;
	}

	public void setFechaContratacion(Date fechaContratacion) {
		this.fechaContratacion = fechaContratacion;
	}

	public Candidato getCandidatoElegido() {
		return candidatoElegido;
	}

	public void setCandidatoElegido(Candidato candidatoElegido) {
		this.candidatoElegido = candidatoElegido;
	}

	public Vacante getVacanteElegida() {
		return vacanteElegida;
	}

	public void setVacanteElegida(Vacante vacanteElegida) {
		this.vacanteElegida = vacanteElegida;
	}
}
