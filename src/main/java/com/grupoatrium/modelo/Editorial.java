package com.grupoatrium.modelo;

public class Editorial {
	private String nombre;
	private Direccion direccion;
	private String nif;
	
	public Editorial() { }
	
	public Editorial(String nombre, Direccion dir, String nif) {
		this.nombre = nombre;
		this.direccion = dir;
		this.nif = nif;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	public String getNif() {
		return nif;
	}
	public void setNif(String nif) {
		this.nif = nif;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sbEditorial = new StringBuilder();
		sbEditorial.append(getNombre()).append(System.lineSeparator());
		sbEditorial.append(getDireccion()).append(System.lineSeparator());
		sbEditorial.append(getNif());
		
		return sbEditorial.toString();
	}

}
