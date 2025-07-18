package logico;

public class Universitario extends Candidato {
	private String carreraUniversitaria;

	public Universitario(String cedula, String nombre, String apellido, String pais, String provincia, String direccion,
			String correo, String telefono, String genero, String carreraUniversitaria) {
		super(cedula, nombre, apellido, pais, provincia, direccion, correo, telefono, genero);
		this.carreraUniversitaria = carreraUniversitaria;
	}

	public String getCarreraUniversitaria() {
		return carreraUniversitaria;
	}

	public void setCarreraUniversitaria(String carreraUniversitaria) {
		this.carreraUniversitaria = carreraUniversitaria;
	}
}