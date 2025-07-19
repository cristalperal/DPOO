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
	public static int generadorCodVacante = 0;
	public static int generadorCodPostulacion = 0;
	public static int generadorCodVacCompletada = 0;
	public static BolsaTrabajo miBolsaTrabajo = null; // para trabajar con el patron singleton, una unica instancia que se puede llamar de donde sea

	private BolsaTrabajo() {
		super();
		this.lasEmpresas = new ArrayList<Empresa>();
		this.losCandidatos = new ArrayList<Candidato>();
		this.lasVacantes = new ArrayList<Vacante>();
		this.lasPostulaciones = new ArrayList<Postulacion>();
		this.lasVacantesCompletadas = new ArrayList<VacanteCompletada>();
	}

	// para lo del patron de singleton
	public static BolsaTrabajo getInstancia() {
		if (miBolsaTrabajo == null) {
			miBolsaTrabajo = new BolsaTrabajo();
		}
		return miBolsaTrabajo;
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

	/* ------ METODOS IMPLEMENTADOS ------- */

	/* ----- CANDIDATO ----- */

	// buscar candidato por cedula

	public Candidato buscarCandidatoByCedula(String cedula) {
		Candidato aux = null;
		Boolean encontrado = false;
		int i = 0;
		while (!encontrado && i < losCandidatos.size()) {
			if (losCandidatos.get(i).getCedula().equals(cedula)) {
				aux = losCandidatos.get(i);
				encontrado = true;
			}
			i++;
		}
		return aux;
	}

	// registrar candidato 
	public void registrarCandidato (Candidato auxCandidato) {

		Candidato verificarCandidato = buscarCandidatoByCedula(auxCandidato.getCedula());
		if(verificarCandidato == null) {
			losCandidatos.add(auxCandidato);	
		}
	}


	// actualizar candidato 
	public void actualizarCandidato(Candidato auxCandidato) {
		int index = buscarCandidatoByIndex(auxCandidato.getCedula());
		losCandidatos.set(index, auxCandidato);
	}

	// buscar por index el candidato

	private int buscarCandidatoByIndex(String cedula) {
		int index = -1;
		Boolean encontrado = false;
		int i = 0;
		while (!encontrado && i < losCandidatos.size()) {
			if (losCandidatos.get(i).getCedula().equals(cedula)) {
				index = i;
				encontrado = true;
			}
			i++;
		}
		return index;
	}


	// eliminar candidato
	public boolean eliminarCandidato(String cedula){
		Candidato auxCandidato = buscarCandidatoByCedula(cedula);
		boolean eliminar = false;
		if(auxCandidato!=null){
			if(auxCandidato.getSusPostulaciones().size()==0){
				losCandidatos.remove(auxCandidato);
				eliminar = true;
			}
		}	 
		return eliminar;
	}



	/* ----- POSTULACION ----- */

	// buscar por id la postulacion 
	public Postulacion buscarPostulacionById(String idPostulacion) {
		Postulacion aux = null;
		Boolean encontrado = false;
		int i = 0;
		while (!encontrado && i < lasPostulaciones.size()) {
			if (lasPostulaciones.get(i).getIdPostulacion().equals(idPostulacion)) {
				aux = lasPostulaciones.get(i);
				encontrado = true;
			}
			i++;
		}
		return aux;
	}

	// registrar postulacion  
	public void registrarPostulacion(Postulacion auxPostulacion) {
		if (auxPostulacion != null && auxPostulacion.getElCandidato() != null) {
			lasPostulaciones.add(auxPostulacion);
			auxPostulacion.getElCandidato().getSusPostulaciones().add(auxPostulacion);
			generadorCodPostulacion++;
		}
	}


	// actualizar postulacion 
	public void actualizarPostulacion(Postulacion auxPostulacion) {
		int index = buscarPostulacioByIndex(auxPostulacion.getIdPostulacion());
		lasPostulaciones.set(index, auxPostulacion);
	}


	// buscar por index la postulacion
	private int buscarPostulacioByIndex(String id) {
		int index = -1;
		Boolean encontrado = false;
		int i = 0;
		while (!encontrado && i < lasPostulaciones.size()) {
			if (lasPostulaciones.get(i).getIdPostulacion().equals(id)) {
				index = i;
				encontrado = true;
			}
			i++;
		}
		return index;
	}


	// eliminar postulacion
	public boolean eliminarPostulacion(String idPostulacion) {
		Postulacion auxPostulacion = buscarPostulacionById(idPostulacion);
		boolean eliminar = false;
		if (auxPostulacion != null) {
			Candidato auxcandidato = auxPostulacion.getElCandidato();
			// para primero eliminar la postulacion del candidato 
			if (auxcandidato != null) {
				auxcandidato.getSusPostulaciones().remove(auxPostulacion);
			}
			// para luego eliminar la postulacion de la lista de postulaciones
			lasPostulaciones.remove(auxPostulacion);
			eliminar = true;
		}
		return eliminar;
	}

	/* ----- EMPRESA ----- */

	// buscar por rnc la empresa

	public Empresa buscarEmpresaByrnc(String auxRnc) {
		Empresa aux = null;
		Boolean encontrado = false;
		int i = 0;
		while (!encontrado && i < lasEmpresas.size()) {
			if (lasEmpresas.get(i).getRnc().equalsIgnoreCase(auxRnc)) {
				aux = lasEmpresas.get(i);
				encontrado = true;
			}
			i++;
		}
		return aux;
	}

	// registrar empresa  
	public void registrarEmpresa(Empresa auxEmpresa) {
		Empresa validarEmpresa= buscarEmpresaByrnc(auxEmpresa.getRnc());
		// si no existe esta empresa se puede crear(Validarlo con un exception)
		if(validarEmpresa == null) {
			lasEmpresas.add(auxEmpresa);
		}
	}

	// actualizar empresa 
	public void actualizarEmpresa(Empresa auxEmpresa) {
		int index = buscarEmpresaByIndex(auxEmpresa.getRnc());
		lasEmpresas.set(index, auxEmpresa);
	}


	// buscar por index la empresa
	private int buscarEmpresaByIndex(String auxRnc) {
		int index = -1;
		Boolean encontrado = false;
		int i = 0;
		while (!encontrado && i < lasEmpresas.size()) {
			if (lasEmpresas.get(i).getRnc().equalsIgnoreCase(auxRnc)){
				index = i;
				encontrado = true;
			}
			i++;
		}
		return index;
	}

	// eliminar empresa
	public boolean eliminarEmpresa(String auxRnc){
		Empresa auxEmpresa = buscarEmpresaByrnc(auxRnc);
		boolean eliminar = false;
		if(auxEmpresa!=null){
			if(auxEmpresa.getSusVacantes().size()==0){
				lasEmpresas.remove(auxEmpresa);
				eliminar = true;
			}
		}	 
		return eliminar;
	}

	/* ----- VACANTE ----- */

	// buscar por id la vacante 
	public Vacante buscarVacanteByid(String idVacante) {
		Vacante aux = null;
		Boolean encontrado = false;
		int i = 0;
		while (!encontrado && i < lasVacantes.size()) {
			if (lasVacantes.get(i).getIdVacante().equals(idVacante)) {
				aux = lasVacantes.get(i);
				encontrado = true;
			}
			i++;
		}
		return aux;
	}


	// registrar vacante  

	public void registrarVacante(Vacante auxVacante) {
		if (auxVacante != null && auxVacante.getEmpresaEmpleadora() != null) {
			lasVacantes.add(auxVacante);
			auxVacante.getEmpresaEmpleadora().getSusVacantes().add(auxVacante);
			generadorCodVacante++;
		}
	}


	// actualizar vacante 
	public void actualizarVcante(Vacante auxVacante) {
		int index = buscarVacanteByIndex(auxVacante.getIdVacante());
		lasVacantes.set(index, auxVacante);
	}

	// buscar por index la vacante
	private int buscarVacanteByIndex(String id) {
		int index = -1;
		Boolean encontrado = false;
		int i = 0;
		while (!encontrado && i < lasVacantes.size()) {
			if (lasVacantes.get(i).getIdVacante().equals(id)){
				index = i;
				encontrado = true;
			}
			i++;
		}
		return index;
	}

	// eliminar vacante

	public boolean eliminarVcante(String idVacante) {
		Vacante  auxVacante = buscarVacanteByid(idVacante);
		boolean eliminar = false;
		if (auxVacante != null) {
			Empresa auxEmpresa = auxVacante.getEmpresaEmpleadora();
			// para primero eliminar la vacante de la lista en empresa
			if (auxEmpresa != null) {
				auxEmpresa.getSusVacantes().remove(auxVacante);
			}
			// para luego eliminar la vacante de la lista de vacantes
			lasVacantes.remove(auxVacante);
			eliminar = true;
		}
		return eliminar;
	}


	/* ----- VACANTE COMPLETADA ----- */

	// buscar por id vacante completada
	public VacanteCompletada buscarVacanteCompletadaByid(String idVacanteC) {
		VacanteCompletada aux = null;
		Boolean encontrado = false;
		int i = 0;
		while (!encontrado && i < lasVacantesCompletadas.size()) {
			if (lasVacantesCompletadas.get(i).getIdVacanteCompletada().equals(idVacanteC)) {
				aux = lasVacantesCompletadas.get(i);
				encontrado = true;
			}
			i++;
		}
		return aux;
	}



	// si el candidato es contratado pausar las solicitudes




	/* -----  MATCHEO ----- */




}
