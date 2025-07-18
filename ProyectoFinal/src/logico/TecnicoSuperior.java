package logico;

public class TecnicoSuperior extends Candidato {
	private String areaCursada;

	public TecnicoSuperior(String cedula, String nombre, String apellido, String pais, String provincia,
			String direccion, String correo, String telefono, String genero, String areaCursada) {
		super(cedula, nombre, apellido, pais, provincia, direccion, correo, telefono, genero);
		this.areaCursada = areaCursada;
	}

	public String getAreaCursada() {
		return areaCursada;
	}

	public void setAreaCursada(String areaCursada) {
		this.areaCursada = areaCursada;
	}
}
