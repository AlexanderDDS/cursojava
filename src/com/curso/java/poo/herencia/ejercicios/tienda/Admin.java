package com.curso.java.poo.herencia.ejercicios.tienda;

public class Admin extends Usuario {
	private boolean crearUsuarios;
	public Admin(String nombre, String codigo_usuario, String contrasenia, boolean crearUsuarios) {
		super(nombre, codigo_usuario, contrasenia);
		this.crearUsuarios = crearUsuarios;
	}
	public boolean isCrearUsuarios() {
		return crearUsuarios;
	}
	public void setCrearUsuarios(boolean crearUsuarios) {
		this.crearUsuarios = crearUsuarios;
	}
	@Override
	public String toString() {
		return "Admin [nombre="+getNombre()+", codigo usuario="+getCodigo_usuario()+", contraseña="+getContrasenia()+", puede crear usuarios="+crearUsuarios+"]";
	}
}
