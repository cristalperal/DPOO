package logico;

import java.util.ArrayList;

public class Empresa {
	private String rnc;
	private String nombre;
	private String tipoEmpresa;
	private String pais;
	private String provincia;
	private String direccion;
	private String correo;
	private String telefono;
	private ArrayList<Vacante> susVacantes;
	
	public Empresa(String rnc, String nombre, String tipoEmpresa, String pais, String provincia, String direccion, String correo, String telefono) {
		super();
		this.rnc = rnc;
		this.nombre = nombre;
		this.tipoEmpresa = tipoEmpresa;
		this.pais = pais;
		this.provincia = provincia;
		this.direccion = direccion;
		this.correo = correo;
		this.telefono = telefono;
		this.susVacantes = new ArrayList<Vacante>();
	}

	public String getRnc() {
		return rnc;
	}

	public void setRnc(String rnc) {
		this.rnc = rnc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoEmpresa() {
		return tipoEmpresa;
	}

	public void setTipoEmpresa(String tipoEmpresa) {
		this.tipoEmpresa = tipoEmpresa;
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

	public ArrayList<Vacante> getSusVacantes() {
		return susVacantes;
	}

	public void setSusVacantes(ArrayList<Vacante> susVacantes) {
		this.susVacantes = susVacantes;
	}
}
