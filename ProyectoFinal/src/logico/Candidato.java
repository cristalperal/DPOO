package logico;

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
	protected String jordanaDeseada; //Si tiempo parcial o tiempo completo
	protected String modalidadEmpleo; //Si remota, presencial o híbrido
	protected boolean vehiculoPropio;
	protected boolean puedeMudarse;
	protected float salarioEsperado;
	protected int aniosExperiencia;
	protected boolean estadoContratado; //Por si ya ha sido contratado, se inhabilita este candidato para futuras vacantes
	
	public Candidato(String cedula, String nombre, String apellido, String pais, String provincia, String direccion,
			String correo, String telefono, String genero, String jordanaDeseada, String modalidadEmpleo,
			boolean vehiculoPropio, boolean puedeMudarse, float salarioEsperado, int aniosExperiencia,
			boolean estadoContratado) {
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
		this.jordanaDeseada = jordanaDeseada;
		this.modalidadEmpleo = modalidadEmpleo;
		this.vehiculoPropio = vehiculoPropio;
		this.puedeMudarse = puedeMudarse;
		this.salarioEsperado = salarioEsperado;
		this.aniosExperiencia = aniosExperiencia;
		this.estadoContratado = estadoContratado;
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

	public boolean isEstadoContratado() {
		return estadoContratado;
	}

	public void setEstadoContratado(boolean estadoContratado) {
		this.estadoContratado = estadoContratado;
	}
}
