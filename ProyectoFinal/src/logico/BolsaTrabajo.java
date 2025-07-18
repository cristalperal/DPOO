//Proyecto final POO - Bolsa de trabajo
//Realizado por Cristal M. Peralta y Laiyine L. Suriel
package logico;

import java.util.ArrayList;

public class BolsaTrabajo {
	private ArrayList<Empresa> lasEmpresas;
	private ArrayList<Candidato> losCandidatos;
	private ArrayList<Vacante> lasVacantes;
	private ArrayList<Postulacion> lasPostulaciones;
	private ArrayList<VacanteCompletada> lasVacantesCompletadas;
	
	public BolsaTrabajo() {
		super();
		this.lasEmpresas = new ArrayList<Empresa>();
		this.losCandidatos = new ArrayList<Candidato>();
		this.lasVacantes = new ArrayList<Vacante>();
		this.lasPostulaciones = new ArrayList<Postulacion>();
		this.lasVacantesCompletadas = new ArrayList<VacanteCompletada>();
	}

	public ArrayList<Empresa> getLasEmpresas() {
		return lasEmpresas;
	}

	public void setLasEmpresas(ArrayList<Empresa> lasEmpresas) {
		this.lasEmpresas = lasEmpresas;
	}

	public ArrayList<Candidato> getLosCandidatos() {
		return losCandidatos;
	}

	public void setLosCandidatos(ArrayList<Candidato> losCandidatos) {
		this.losCandidatos = losCandidatos;
	}

	public ArrayList<Vacante> getLasVacantes() {
		return lasVacantes;
	}

	public void setLasVacantes(ArrayList<Vacante> lasVacantes) {
		this.lasVacantes = lasVacantes;
	}

	public ArrayList<Postulacion> getLasPostulaciones() {
		return lasPostulaciones;
	}

	public void setLasPostulaciones(ArrayList<Postulacion> lasPostulaciones) {
		this.lasPostulaciones = lasPostulaciones;
	}

	public ArrayList<VacanteCompletada> getLasVacantesCompletadas() {
		return lasVacantesCompletadas;
	}

	public void setLasVacantesCompletadas(ArrayList<VacanteCompletada> lasVacantesCompletadas) {
		this.lasVacantesCompletadas = lasVacantesCompletadas;
	}
}
