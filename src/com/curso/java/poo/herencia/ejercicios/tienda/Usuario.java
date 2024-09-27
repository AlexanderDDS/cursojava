package com.curso.java.poo.herencia.ejercicios.tienda;

public class Usuario {
	private String nombre;
	private String codigo_usuario;
	private String contrasenia;
	public Usuario(String nombre, String codigo_usuario, String contrasenia) {
		super();
		this.nombre = nombre;
		this.codigo_usuario = codigo_usuario;
		this.contrasenia = contrasenia;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo_usuario() {
		return codigo_usuario;
	}
	public void setCodigo_usuario(String codigo_usuario) {
		this.codigo_usuario = codigo_usuario;
	}
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
}
