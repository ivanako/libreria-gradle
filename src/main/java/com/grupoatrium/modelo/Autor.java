package com.grupoatrium.modelo;

import org.springframework.stereotype.Component;

@Component
public class Autor {
	private String nombre;
	private String nacionalidad;
	private String comentarios;

	private Autor() { }
	
	public Autor(String nombre) {
		this.nombre = nombre;
	}
	
	public Autor(String nombre, String nacionalidad, String comentarios) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.comentarios = comentarios;
	}

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	
	@Override
	public String toString() {
		StringBuilder sbAutor = new StringBuilder();
		sbAutor.append("Nombre: ").append(getNombre()).append(System.lineSeparator());
		sbAutor.append("Nacionalidad: ").append(getNacionalidad()).append(System.lineSeparator());
		sbAutor.append("Comentarios: ").append(getComentarios());

		return sbAutor.toString();
	}
}
