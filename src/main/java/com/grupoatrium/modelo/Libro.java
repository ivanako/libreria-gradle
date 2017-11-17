package com.grupoatrium.modelo;

import java.util.List;

public class Libro {

	private String isbn;
	private String titulo;
	private List<Autor> autores;
	private Editorial editorial;
	private int publicacion;
	private double precio;
	private String descripcion;
	
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	
	public Editorial getEditorial() {
		return editorial;
	}
	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}
	
	public int getPublicacion() {
		return publicacion;
	}
	public void setPublicacion(int publicacion) {
		this.publicacion = publicacion;
	}
	
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sbLibro = new StringBuilder();
		sbLibro.append("LIBRO:").append(System.lineSeparator());
		sbLibro.append("ISBN: ").append(getIsbn()).append(System.lineSeparator());
		sbLibro.append("Título: ").append(getTitulo()).append(System.lineSeparator());
		sbLibro.append("Autores: ").append(getAutores()).append(System.lineSeparator());
		sbLibro.append("Editorial: ").append(getEditorial()).append(System.lineSeparator());
		sbLibro.append("Publicación: ").append(getPublicacion()).append(System.lineSeparator());
		sbLibro.append("Precio: ").append(getPrecio()).append(System.lineSeparator());
		sbLibro.append("Descripción: ").append(getDescripcion()).append(System.lineSeparator());
		
		return sbLibro.toString();
	}
}
