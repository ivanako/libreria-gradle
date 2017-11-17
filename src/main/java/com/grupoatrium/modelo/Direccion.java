package com.grupoatrium.modelo;

public class Direccion {
	private String calle;
	private int numero;
	private String poblacion;
	private int cp;
	private String provincia;
	
	
	public Direccion() { }
	
	public Direccion(String provincia) {
		this.provincia = provincia;
	}
	
	public Direccion(String calle, int numero, String poblacion, int cp, String provincia) {
		this.calle = calle;
		this.numero = numero;
		this.poblacion = poblacion;
		this.cp = cp;
		this.provincia = provincia;
	}
	
	
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sbDireccion = new StringBuilder();
		sbDireccion.append(getCalle()).append(System.lineSeparator());
		sbDireccion.append(getNumero()).append(System.lineSeparator());
		sbDireccion.append(getPoblacion()).append(System.lineSeparator());
		sbDireccion.append(getCp()).append(System.lineSeparator());
		sbDireccion.append(getProvincia());
		
		return sbDireccion.toString();
	}

}
