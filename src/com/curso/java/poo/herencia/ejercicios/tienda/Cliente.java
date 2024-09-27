package com.curso.java.poo.herencia.ejercicios.tienda;

public class Cliente extends Usuario {
	private Producto[] carritoCompra;
	private boolean vip;
	public Cliente(String nombre, String codigo_usuario, String contrasenia, boolean vip) {
		super(nombre, codigo_usuario, contrasenia);
		this.carritoCompra = new Producto[10];
		this.vip = vip;
	}
	public Producto[] getCarritoCompra() {
		return carritoCompra;
	}
	public void setCarritoCompra(Producto[] carritoCompra) {
		this.carritoCompra = carritoCompra;
	}
	public boolean isVip() {
		return vip;
	}
	public void setVip(boolean vip) {
		this.vip = vip;
	}
	@Override
	public String toString() {
		return "Cliente [nombre="+getNombre()+", codigo usuario="+getCodigo_usuario()+", contraseña="+getContrasenia()+", es VIP="+vip+"]";
	}
	public void pagar() {
		
	}
}
