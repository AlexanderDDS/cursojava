package com.curso.java.poo.herencia.ejercicios.tienda;

import com.curso.java.utils.ConsoleColors;

public class Cliente extends Usuario {
	private Producto[] carritoCompra;
	private boolean vip;
	private double dinero;
	public Cliente(String nombre, String codigo_usuario, String contrasenia, boolean vip) {
		super(nombre, codigo_usuario, contrasenia);
		this.carritoCompra = new Producto[2];
		this.vip = vip;
		this.dinero = 100.00;
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
	public boolean pagar(double precioTotalCarrito) {
		boolean haPagado = false;
		if (this.dinero>precioTotalCarrito) {
			for (int i=0; i<this.carritoCompra.length; i++) {
				if (this.carritoCompra[i]!=null) {
					this.dinero -= this.carritoCompra[i].getPrecio();
					this.carritoCompra[i]=null;
				}
			}
			haPagado=true;
			System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT+"Ha pagado su carrito correctamente"+ConsoleColors.RESET);
		}
		else {
			System.out.println(ConsoleColors.RED_BRIGHT+"No tiene suficiente dinero para pagar el carrito"+ConsoleColors.RESET);
		}
		return haPagado;
	}
}
