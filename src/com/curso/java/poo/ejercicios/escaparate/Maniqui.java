package com.curso.java.poo.ejercicios.escaparate;

public class Maniqui {
	//Atributos
	private String id;
	private Vestido vestido;
	private Pantalon pantalon;
	private Camisa camisa;
	//Constructores
	public Maniqui(String id) {
		this.id = id;
	}
	public Maniqui(String id, Vestido vestido) {
		this.id = id;
		this.vestido = vestido;
	}
	public Maniqui(String id, Pantalon pantalon, Camisa camisa) {
		this.id = id;
		this.pantalon = pantalon;
		this.camisa = camisa;
	}
	public Maniqui(String id, Vestido vestido, Pantalon pantalon, Camisa camisa) {
		this.id = id;
		this.vestido = vestido;
		this.pantalon = pantalon;
		this.camisa = camisa;
	}
	//Get/set
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Vestido getVestido() {
		return vestido;
	}
	public void setVestido(Vestido vestido) {
		this.vestido = vestido;
	}
	public Pantalon getPantalon() {
		return pantalon;
	}
	public void setPantalon(Pantalon pantalon) {
		this.pantalon = pantalon;
	}
	public Camisa getCamisa() {
		return camisa;
	}
	public void setCamisa(Camisa camisa) {
		this.camisa = camisa;
	}
	//Otros métodos
	public void desvestir() {
		this.vestido=null;
		this.pantalon=null;
		this.camisa=null;
	}
	public void vestir(Camisa camisa, Pantalon pantalon) {
		if (this.vestido!=null) {
			System.out.println("No puedes vestir con pantalón y camisa porque ya lleva un vestido");
		}else {
			this.camisa=camisa;
			this.pantalon=pantalon;
		}
	}
	public void vestir(Vestido vestido) {
		if (this.pantalon!=null||this.camisa!=null) {
			System.out.println("No puedes vestir con vestido porque ya lleva pantalón o camisa");
		}else {
			this.vestido=vestido;
		}
	}
}
