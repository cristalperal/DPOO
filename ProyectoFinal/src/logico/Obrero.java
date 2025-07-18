package logico;

import java.util.ArrayList;

public class Obrero extends Candidato {
	private boolean electricidad;
	private boolean plomeria;
	private boolean construccion;
	private boolean limpieza;
	private boolean ebanisteria;
	private boolean mecanica;
	
	public Obrero(String cedula, String nombre, String apellido, String pais, String provincia, String direccion,
			String correo, String telefono, String genero, boolean electricidad, boolean plomeria, boolean construccion,
			boolean limpieza, boolean ebanisteria, boolean mecanica) {
		super(cedula, nombre, apellido, pais, provincia, direccion, correo, telefono, genero);
		this.electricidad = electricidad;
		this.plomeria = plomeria;
		this.construccion = construccion;
		this.limpieza = limpieza;
		this.ebanisteria = ebanisteria;
		this.mecanica = mecanica;
	}

	public boolean isElectricidad() {
		return electricidad;
	}

	public void setElectricidad(boolean electricidad) {
		this.electricidad = electricidad;
	}

	public boolean isPlomeria() {
		return plomeria;
	}

	public void setPlomeria(boolean plomeria) {
		this.plomeria = plomeria;
	}

	public boolean isConstruccion() {
		return construccion;
	}

	public void setConstruccion(boolean construccion) {
		this.construccion = construccion;
	}

	public boolean isLimpieza() {
		return limpieza;
	}

	public void setLimpieza(boolean limpieza) {
		this.limpieza = limpieza;
	}

	public boolean isEbanisteria() {
		return ebanisteria;
	}

	public void setEbanisteria(boolean ebanisteria) {
		this.ebanisteria = ebanisteria;
	}

	public boolean isMecanica() {
		return mecanica;
	}

	public void setMecanica(boolean mecanica) {
		this.mecanica = mecanica;
	}
}
