package logico;

import java.util.ArrayList;
import java.util.Date;

public class Vacante {
	private String idVacante;
	private Empresa empresaEmpleadora;
	private String nombrePuesto;
	private String areaRequerida; //El área del puesto (Si es finanzas, desarrollo, logística...)
	private String tipoCandidato; //Si para un universitario, técnico u obrero
	private int aniosExperienciaRequeridos;
	private String modalidadPropuesta; //Si remota, presencial o híbrido
	private String jornadaPropuesta; //Si tiempo parcial o tiempo completo
	private ArrayList<String> requisitos; //Requisitos a tomar en cuenta con la vacante
	private ArrayList<String> responsabilidades; //Las responsabilidades que conlleva la vacante
	private float salarioPropuesto;
	private int cantPuestosDisp; //Cantidad de este puesto disponibles
	private boolean estadoVacante; //Si esta disponible o no
	private Date fechaSolicitudVacante;
	
	public Vacante(String idVacante, Empresa empresaEmpleadora, String nombrePuesto, String areaRequerida,
			String tipoCandidato, int aniosExperienciaRequeridos, String modalidadPropuesta, String jornadaPropuesta, 
			float salarioPropuesto, int cantPuestosDisp, boolean estadoVacante, Date fechaSolicitudVacante) {
		super();
		this.idVacante = idVacante;
		this.empresaEmpleadora = empresaEmpleadora;
		this.nombrePuesto = nombrePuesto;
		this.areaRequerida = areaRequerida;
		this.tipoCandidato = tipoCandidato;
		this.aniosExperienciaRequeridos = aniosExperienciaRequeridos;
		this.modalidadPropuesta = modalidadPropuesta;
		this.jornadaPropuesta = jornadaPropuesta;
		this.requisitos = new ArrayList<String>();
		this.responsabilidades = new ArrayList<String>();
		this.salarioPropuesto = salarioPropuesto;
		this.cantPuestosDisp = cantPuestosDisp;
		this.estadoVacante = estadoVacante;
		this.fechaSolicitudVacante = fechaSolicitudVacante;
	}

	public String getIdVacante() {
		return idVacante;
	}

	public void setIdVacante(String idVacante) {
		this.idVacante = idVacante;
	}

	public Empresa getEmpresaEmpleadora() {
		return empresaEmpleadora;
	}

	public void setEmpresaEmpleadora(Empresa empresaEmpleadora) {
		this.empresaEmpleadora = empresaEmpleadora;
	}

	public String getNombrePuesto() {
		return nombrePuesto;
	}

	public void setNombrePuesto(String nombrePuesto) {
		this.nombrePuesto = nombrePuesto;
	}

	public String getAreaRequerida() {
		return areaRequerida;
	}

	public void setAreaRequerida(String areaRequerida) {
		this.areaRequerida = areaRequerida;
	}

	public String getTipoCandidato() {
		return tipoCandidato;
	}

	public void setTipoCandidato(String tipoCandidato) {
		this.tipoCandidato = tipoCandidato;
	}

	public int getAniosExperienciaRequeridos() {
		return aniosExperienciaRequeridos;
	}

	public void setAniosExperienciaRequeridos(int aniosExperienciaRequeridos) {
		this.aniosExperienciaRequeridos = aniosExperienciaRequeridos;
	}

	public String getModalidadPropuesta() {
		return modalidadPropuesta;
	}

	public void setModalidadPropuesta(String modalidadPropuesta) {
		this.modalidadPropuesta = modalidadPropuesta;
	}

	public String getJornadaPropuesta() {
		return jornadaPropuesta;
	}

	public void setJornadaPropuesta(String jornadaPropuesta) {
		this.jornadaPropuesta = jornadaPropuesta;
	}

	public ArrayList<String> getRequisitos() {
		return requisitos;
	}

	public void setRequisitos(ArrayList<String> requisitos) {
		this.requisitos = requisitos;
	}

	public ArrayList<String> getResponsabilidades() {
		return responsabilidades;
	}

	public void setResponsabilidades(ArrayList<String> responsabilidades) {
		this.responsabilidades = responsabilidades;
	}

	public float getSalarioPropuesto() {
		return salarioPropuesto;
	}

	public void setSalarioPropuesto(float salarioPropuesto) {
		this.salarioPropuesto = salarioPropuesto;
	}

	public int getCantPuestosDisp() {
		return cantPuestosDisp;
	}

	public void setCantPuestosDisp(int cantPuestosDisp) {
		this.cantPuestosDisp = cantPuestosDisp;
	}

	public boolean isEstadoVacante() {
		return estadoVacante;
	}

	public void setEstadoVacante(boolean estadoVacante) {
		this.estadoVacante = estadoVacante;
	}

	public Date getFechaSolicitudVacante() {
		return fechaSolicitudVacante;
	}

	public void setFechaSolicitudVacante(Date fechaSolicitudVacante) {
		this.fechaSolicitudVacante = fechaSolicitudVacante;
	} 
}
