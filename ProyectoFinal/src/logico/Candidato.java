package logico;

import java.util.ArrayList;

public abstract class Candidato {
	protected String cedula;
	protected String nombre;
	protected String apellido;
	protected String pais;
	protected String provincia;
	protected String direccion;
	protected String correo;
	protected String telefono;
	protected String genero;
	protected ArrayList<Postulacion> susPostulaciones;
	/*
	protected String jordanaDeseada; //Si tiempo parcial o tiempo completo
	protected String modalidadEmpleo; //Si remota, presencial o híbrido
	protected boolean vehiculoPropio;
	protected boolean puedeMudarse;
	protected float salarioEsperado;
	protected int aniosExperiencia;
	protected boolean estadoContratado; //Por si ya ha sido contratado, se inhabilita este candidato para futuras vacantes
	*/
	
	public Candidato(String cedula, String nombre, String apellido, String pais, String provincia, String direccion,
			String correo, String telefono, String genero) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.pais = pais;
		this.provincia = provincia;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.genero = genero;
		this.susPostulaciones = new ArrayList<Postulacion>();
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public ArrayList<Postulacion> getSusPostulaciones() {
		return susPostulaciones;
	}

	public void setSusPostulaciones(ArrayList<Postulacion> susPostulaciones) {
		this.susPostulaciones = susPostulaciones;
	}
}
