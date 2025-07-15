package logico;

import java.util.ArrayList;

public class Obrero extends Candidato {
	private ArrayList<String> habilidades;

	public Obrero(String cedula, String nombre, String apellido, String pais, String provincia, String direccion,
			String correo, String telefono, String genero, String jordanaDeseada, String modalidadEmpleo,
			boolean vehiculoPropio, boolean puedeMudarse, float salarioEsperado, int aniosExperiencia,
			boolean estadoContratado) {
		super(cedula, nombre, apellido, pais, provincia, direccion, correo, telefono, genero, jordanaDeseada,
				modalidadEmpleo, vehiculoPropio, puedeMudarse, salarioEsperado, aniosExperiencia, estadoContratado);
		this.habilidades = new ArrayList<String>();
	}

	public ArrayList<String> getHabilidades() {
		return habilidades;
	}

	public void setHabilidades(ArrayList<String> habilidades) {
		this.habilidades = habilidades;
	}
}
