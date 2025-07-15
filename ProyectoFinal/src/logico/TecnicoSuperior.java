package logico;

public class TecnicoSuperior extends Candidato {
	private String areaCursada;

	public TecnicoSuperior(String cedula, String nombre, String apellido, String pais, String provincia,
			String direccion, String correo, String telefono, String genero, String jordanaDeseada,
			String modalidadEmpleo, boolean vehiculoPropio, boolean puedeMudarse, float salarioEsperado,
			int aniosExperiencia, boolean estadoContratado, String areaCursada) {
		super(cedula, nombre, apellido, pais, provincia, direccion, correo, telefono, genero, jordanaDeseada,
				modalidadEmpleo, vehiculoPropio, puedeMudarse, salarioEsperado, aniosExperiencia, estadoContratado);
		this.areaCursada = areaCursada;
	}

	public String getAreaCursada() {
		return areaCursada;
	}

	public void setAreaCursada(String areaCursada) {
		this.areaCursada = areaCursada;
	}
}
