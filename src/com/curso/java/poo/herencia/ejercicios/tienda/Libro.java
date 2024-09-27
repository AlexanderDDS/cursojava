package com.curso.java.poo.herencia.ejercicios.tienda;

public class Libro extends Producto {
	private String isbn;
	private String titulo;
	public Libro() {
		super();
	}
	public Libro(String ref, double precio, String isbn, String titulo) {
		super(ref, precio);
		this.isbn = isbn;
		this.titulo = titulo;
	}
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
	@Override
	public String toString() {
		return "Libro [ISBN=" + isbn + ", titulo=" + titulo + ", precio="+this.getPrecio()+"]";
	}
}
