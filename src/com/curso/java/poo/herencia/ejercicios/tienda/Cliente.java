package com.curso.java.poo.herencia.ejercicios.tienda;

public class Cliente extends Usuario {
	private Producto[] carritoCompra;
	private boolean vip;
	private double dinero;
	public Cliente(String nombre, String codigo_usuario, String contrasenia, boolean vip) {
		super(nombre, codigo_usuario, contrasenia);
		this.carritoCompra = new Producto[2];
		this.vip = vip;
		this.dinero = 20.00;
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
	public double getDinero() {
		return dinero;
	}
	@Override
	public String toString() {
		return "Cliente [nombre="+getNombre()+", codigo usuario="+getCodigo_usuario()+", contraseña="+getContrasenia()+", es VIP="+vip+"]";
	}
	public void pagar(String dineroInsuficiente, String pagadoCorrectamente) {
		double saldo = this.dinero;
		for (Producto producto : this.carritoCompra) {
			if (producto!=null) {
				if (saldo>producto.getPrecio()) {
					saldo -= producto.getPrecio();
				}
				else {
					saldo = this.dinero;
					System.out.println(dineroInsuficiente);
					break;
				}
			}
		}
		if (saldo<this.dinero) {
			this.dinero=saldo;
			System.out.println(pagadoCorrectamente);
		}
		System.out.println("Tengo "+this.dinero+" euros");
	}
}
