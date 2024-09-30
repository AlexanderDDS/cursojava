package com.curso.java.poo.herencia.ejercicios.tienda;

import java.util.Arrays;

import com.curso.java.utils.ConsoleColors;
import com.curso.java.utils.Utilidades;

public class Tienda {
	private String nombre;
	private Usuario[] usuarios;
	private Producto[] productos;
	public Tienda(String nombre) {
		super();
		this.nombre = nombre;
		this.usuarios = new Usuario[10];
		this.productos = new Producto[20];
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Usuario[] getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(Usuario[] usuarios) {
		this.usuarios = usuarios;
	}
	public Producto[] getProductos() {
		return productos;
	}
	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}
	@Override
	public String toString() {
		return "Tienda [nombre=" + nombre + ", usuarios=" + Arrays.toString(usuarios) + ", productos="
				+ Arrays.toString(productos) + "]";
	}
	public static void main(String[] args) {
		Tienda tienda = new Tienda("Carrefour");
		tienda.abrirTienda();
	}
	public void abrirTienda() {
		System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT+"Esta es la página web para la tienda "+this.nombre+ConsoleColors.RESET);
		crearAdminInicial();
		do {
			menuUsuario();
		}while (usuarioQuiereContinuar("con otro usuario"));
	}
	private void crearAdminInicial() {
		Admin admin1 = new Admin("Alejandro", "a", "1", true);
		this.usuarios[0]=admin1;
	}
	private void menuUsuario() {
		Usuario usuarioSesionIniciada = iniciarSesion();
		if (usuarioSesionIniciada!=null) {
			System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT+"Bienvenido "+usuarioSesionIniciada.getNombre()+ConsoleColors.RESET);
			do {
				if (usuarioSesionIniciada instanceof Admin) {
					menuAdmin((Admin)usuarioSesionIniciada);
				}
				else if (usuarioSesionIniciada instanceof Cliente) {
					menuCliente((Cliente)usuarioSesionIniciada);
				}
			}while(usuarioQuiereContinuar("con su sesión"));
			System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT+"Ha cerrado sesión. Hasta luego!"+ConsoleColors.RESET);
		}
	}
	public Usuario iniciarSesion() {
		System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT+"Vamos a iniciar sesión."+ConsoleColors.RESET);
		String codigoUsuario = Utilidades.pideDatoString(ConsoleColors.GREEN_BOLD_BRIGHT+"Introduzca su usuario:"+ConsoleColors.RESET);
		Usuario usuarioSeleccionado = buscarUsuario(codigoUsuario);
		if (usuarioSeleccionado==null) {
			System.out.println(ConsoleColors.RED_BRIGHT+"Lo sentimos, no tenemos un usuario registrado con ese código"+ConsoleColors.RESET);
		}else {
			boolean contraseniaCorrecta = confirmarContrasenia(usuarioSeleccionado);
			if (contraseniaCorrecta) {
				System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT+"Ha iniciado sesión correctamente"+ConsoleColors.RESET);
			}else {
				System.out.println(ConsoleColors.RED_BRIGHT+"Lo sentimos, no ha podido iniciar sesión"+ConsoleColors.RESET);
				usuarioSeleccionado=null;
			}
		}
		return usuarioSeleccionado;
	}
	public Usuario buscarUsuario(String codigoUsuario) {
		Usuario usuarioSeleccionado=null;
		for (Usuario usuario : this.usuarios) {
			if (usuario!=null) {
				if (usuario.getCodigo_usuario().equals(codigoUsuario.trim())) {
					usuarioSeleccionado=usuario;
				}
			}
		}
		return usuarioSeleccionado;
	}
	public boolean confirmarContrasenia(Usuario usuario) {
		boolean contraseniaCorrecta = false;
		int intentos = 3;
		do {
			String contrasenia = Utilidades.pideDatoString(ConsoleColors.GREEN_BOLD_BRIGHT+"Introduzca su contraseña:"+ConsoleColors.RESET);
			contraseniaCorrecta = usuario.getContrasenia().equals(contrasenia);
			if (!contraseniaCorrecta) {
				System.out.println(ConsoleColors.RED_BRIGHT+"La contraseña es incorrecta"+ConsoleColors.RESET);
				intentos--;
				System.out.println(ConsoleColors.GREEN_BOLD_BRIGHT+"Le quedan "+intentos+" intentos"+ConsoleColors.RESET);
			}
		}while (!contraseniaCorrecta&&intentos>0);
		if (intentos==0) {
			System.out.println(ConsoleColors.RED_BRIGHT+"Ha agotado el número de intentos permitidos"+ConsoleColors.RESET);
		}
		return contraseniaCorrecta;
	}
	private boolean usuarioQuiereContinuar(String accion) {
		boolean quiereContinuar = true;
		String[] opcionesSalir = {ConsoleColors.GREEN_BACKGROUND_BRIGHT+"Sí"+ConsoleColors.RESET, ConsoleColors.GREEN_BACKGROUND_BRIGHT+"No"+ConsoleColors.RESET};
		int seleccionSalir = Utilidades.pintaMenuPideNum(opcionesSalir, ConsoleColors.GREEN_BOLD_BRIGHT+"Desea continuar "+accion+"?"+ConsoleColors.RESET);
		if (seleccionSalir==2) {
			quiereContinuar = false;
		}
		return quiereContinuar;
	}
	public void menuAdmin(Admin admin) {
		int seleccion = 0;
		String[] opciones = {ConsoleColors.BLUE_BACKGROUND_BRIGHT+"Dar de alta producto"+ConsoleColors.RESET, ConsoleColors.BLUE_BACKGROUND_BRIGHT+"Dar de alta usuario"+ConsoleColors.RESET};
		if (admin.isCrearUsuarios()) {
			seleccion = Utilidades.pintaMenuPideNum(opciones, ConsoleColors.BLUE_BOLD_BRIGHT+"Escoja qué acción desea realizar"+ConsoleColors.RESET);
		}else {
			seleccion = Utilidades.pintaMenuPideNum(opciones[0], ConsoleColors.BLUE_BOLD_BRIGHT+"Escoja qué acción desea realizar"+ConsoleColors.RESET);
		}
		switch (seleccion) {
		case 1: altaProducto();break;
		case 2: altaUsuario();break;
		}
	}
	private void altaProducto() {
		System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT+"Ha seleccionado dar de alta un producto"+ConsoleColors.RESET);
		int espacioLibre = espacioLibreProductos(this.productos, "la tienda");
		if (espacioLibre>0) {
			crearProducto(escogerTipoProducto());
			espacioLibre++;
			System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT+"Hay "+espacioLibre+" huecos libres para productos"+ConsoleColors.RESET);
		}
	}
	private int espacioLibreProductos(Producto[] productos, String contenedorProductos) {
		int espacioLibre=0;
		for (Producto producto : productos) {
			if (producto==null) {
				espacioLibre--;
			}
		}
		if (espacioLibre==0) {
			System.out.println(ConsoleColors.RED_BRIGHT+"No hay espacio en "+contenedorProductos+" para más productos"+ConsoleColors.RESET);
		}
		return espacioLibre;
	}
	public int escogerTipoProducto() {
		String[] opcionesTipoProducto = {ConsoleColors.BLUE_BACKGROUND_BRIGHT+"Libro"+ConsoleColors.RESET, ConsoleColors.BLUE_BACKGROUND_BRIGHT+"Móvil"+ConsoleColors.RESET, ConsoleColors.BLUE_BACKGROUND_BRIGHT+"Ropa"+ConsoleColors.RESET};
		int seleccionTipoProducto = Utilidades.pintaMenuPideNum(opcionesTipoProducto, ConsoleColors.BLUE_BOLD_BRIGHT+"Escoja un tipo de producto:"+ConsoleColors.RESET);
		return seleccionTipoProducto;
	}
	private void crearProducto(int seleccion) {
		for (int i=0; i<this.productos.length; i++) {
			if (this.productos[i]==null) {
				String ref1 = Utilidades.pideDatoString(ConsoleColors.BLUE_BACKGROUND_BRIGHT+"Introduzca la referencia:"+ConsoleColors.RESET);
				double precio1 = Utilidades.pideDatoDouble(ConsoleColors.BLUE_BACKGROUND_BRIGHT+"Introduzca el precio:"+ConsoleColors.RESET);
				if (seleccion==1) {
					String isbn1 = Utilidades.pideDatoString(ConsoleColors.BLUE_BACKGROUND_BRIGHT+"Introduzca el ISBN:"+ConsoleColors.RESET);
					String titulo1 = Utilidades.pideDatoString(ConsoleColors.BLUE_BACKGROUND_BRIGHT+"Introduzca el título:"+ConsoleColors.RESET);
					this.productos[i] = new Libro(ref1, precio1, isbn1, titulo1);
				}
				else if (seleccion==2) {
					String marca1 = Utilidades.pideDatoString(ConsoleColors.BLUE_BACKGROUND_BRIGHT+"Introduzca la marca:"+ConsoleColors.RESET);
					String modelo1 = Utilidades.pideDatoString(ConsoleColors.BLUE_BACKGROUND_BRIGHT+"Introduzca el modelo:"+ConsoleColors.RESET);
					this.productos[i] = new Movil(ref1, precio1, marca1, modelo1);
				}
				else if (seleccion==3) {
					double talla1 = Utilidades.pideDatoDouble(ConsoleColors.BLUE_BACKGROUND_BRIGHT+"Introduzca la talla:"+ConsoleColors.RESET);
					String color1 = Utilidades.pideDatoString(ConsoleColors.BLUE_BACKGROUND_BRIGHT+"Introduzca el color:"+ConsoleColors.RESET);
					this.productos[i] = new Ropa(ref1, precio1, talla1, color1);
				}
				System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT+"Se ha dado de alta el producto:\n\t"+ConsoleColors.RESET+ConsoleColors.PURPLE_BACKGROUND_BRIGHT+this.productos[i]+ConsoleColors.RESET);
				break;
			}
		}
	}
	private void altaUsuario() {
		System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT+"Ha seleccionado dar de alta un usuario"+ConsoleColors.RESET);
		int espacioLibre = espacioLibreUsuarios();
		if (espacioLibre>0) {
			crearUsuario(escogerTipoUsuario());
			System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT+"Hay "+espacioLibre+" huecos libres para usuarios"+ConsoleColors.RESET);
		}
	}
	private int espacioLibreUsuarios() {
		int espacioLibre=0;
		for (Usuario usuario : this.usuarios) {
			if (usuario==null) {
				espacioLibre++;
			}
		}
		if (espacioLibre==0) {
			System.out.println(ConsoleColors.RED_BRIGHT+"No hay espacio en la tienda para más usuarios"+ConsoleColors.RESET);
		}
		return espacioLibre;
	}
	private int escogerTipoUsuario() {
		String[] opcionesUsuarios = {ConsoleColors.BLUE_BACKGROUND_BRIGHT+"Admin"+ConsoleColors.RESET, ConsoleColors.BLUE_BACKGROUND_BRIGHT+"Cliente"+ConsoleColors.RESET};
		int seleccionTipoUsuario = Utilidades.pintaMenuPideNum(opcionesUsuarios, ConsoleColors.BLUE_BOLD_BRIGHT+"Seleccione el tipo de usuario:"+ConsoleColors.RESET);
		return seleccionTipoUsuario;
	}
	private void crearUsuario(int seleccion) {
		for (int i=0; i<this.usuarios.length; i++) {
			if (this.usuarios[i]==null) {
				String nombre1 = Utilidades.pideDatoString(ConsoleColors.BLUE_BOLD_BRIGHT+"Introduzca el nombre:"+ConsoleColors.RESET);
				String codigoUsuario1 = Utilidades.pideDatoString(ConsoleColors.BLUE_BOLD_BRIGHT+"Introduzca el código de usuario:"+ConsoleColors.RESET);
				String contrasenia1 = Utilidades.pideDatoString(ConsoleColors.BLUE_BOLD_BRIGHT+"Introduzca la contraseña:"+ConsoleColors.RESET);
				if (seleccion==1) {
					String[] opcionesCrearUsuarios = {ConsoleColors.BLUE_BACKGROUND_BRIGHT+"Sí"+ConsoleColors.RESET, ConsoleColors.BLUE_BACKGROUND_BRIGHT+"No"+ConsoleColors.RESET};
					int numCrearUsuarios = Utilidades.pintaMenuPideNum(opcionesCrearUsuarios, ConsoleColors.BLUE_BOLD_BRIGHT+"Puede crear usuarios?:"+ConsoleColors.RESET);
					boolean crearUsuarios1 = numCrearUsuarios==1;
					this.usuarios[i] = new Admin(nombre1, codigoUsuario1, contrasenia1, crearUsuarios1);
				}
				else if (seleccion==2) {
					String[] opcionesEsVip = {ConsoleColors.BLUE_BACKGROUND_BRIGHT+"Sí"+ConsoleColors.RESET, ConsoleColors.BLUE_BACKGROUND_BRIGHT+"No"+ConsoleColors.RESET};
					int numEsVip = Utilidades.pintaMenuPideNum(opcionesEsVip, ConsoleColors.BLUE_BOLD_BRIGHT+"Es un cliente VIP?:"+ConsoleColors.RESET);
					boolean esVip1 = numEsVip==1;
					this.usuarios[i] = new Cliente(nombre1, codigoUsuario1, contrasenia1, esVip1);
				}
				System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT+"Se ha dado de alta el usuario:\n\t"+ConsoleColors.RESET+ConsoleColors.YELLOW_BACKGROUND+this.usuarios[i]+ConsoleColors.RESET);
				break;
			}
		}
	}
	public void menuCliente(Cliente cliente) {
		System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT+"Aquí puede ver los productos de nuestra tienda para comprar"+ConsoleColors.RESET);
		int posicionCarrito=0;
		do {
			añadirProductoACarrito(cliente, posicionCarrito);
			posicionCarrito++;
		}while (posicionCarrito<cliente.getCarritoCompra().length && usuarioQuiereContinuar("añadiendo productos al carrito de la compra"));
		System.out.println(ConsoleColors.BLUE_BOLD_BRIGHT+"Ha decidido no añadir más productos, por lo que procederá a pagar el carrito de la compra: "+darPrecioTotalCarrito(cliente)+" euros"+ConsoleColors.RESET);
		//Mostrar carrito de compra (darProductosComoStrings con carrito)
		cliente.pagar(ConsoleColors.RED_BRIGHT+"No tiene suficiente dinero para pagar el carrito"+ConsoleColors.RESET, ConsoleColors.BLUE_BOLD_BRIGHT+"Ha pagado su carrito correctamente"+ConsoleColors.RESET);
	}
	public void añadirProductoACarrito(Cliente cliente, int posicionCarrito) {
		int espacioLibre = espacioLibreProductos(cliente.getCarritoCompra(), "el carrito de la compra");
		if (espacioLibre>0) {
			cliente.getCarritoCompra()[posicionCarrito] = seleccionarProducto();
		}
	}
	public Producto seleccionarProducto() {
		Producto[] productosAMostrar = darProductosDelTipoSeleccionado(escogerTipoProducto());
		String[] stringsDeProductos = darProductosComoStrings(productosAMostrar);
		int seleccionProducto = Utilidades.pintaMenuPideNum(stringsDeProductos, ConsoleColors.BLUE_BOLD_BRIGHT+"Seleccione un producto:"+ConsoleColors.RESET);
		Producto productoSeleccionado = productosAMostrar[seleccionProducto-1];
		return productoSeleccionado;
	}
	public int darCantidadTipoProductos(int seleccion) {
		int cantidadTipoProducto = 0;
		for (Producto producto : this.productos) {
			if (seleccion==1) {
				if (producto instanceof Libro) {
					cantidadTipoProducto++;
				}
			}
			else if (seleccion==2) {
				if (producto instanceof Movil) {
					cantidadTipoProducto++;
				}
			}
			else if (seleccion==3) {
				if (producto instanceof Ropa) {
					cantidadTipoProducto++;
				}
			}
		}
		return cantidadTipoProducto;
	}
	public Producto[] darProductosDelTipoSeleccionado(int seleccion) {
		Producto[] productosAMostrar = new Producto[darCantidadTipoProductos(seleccion)];
		for (int i=0, j=0; i<this.productos.length; i++) {
			if (seleccion==1) {
				if (this.productos[i] instanceof Libro) {
					productosAMostrar[j] = this.productos[i];
					j++;
				}
			}
			else if (seleccion==2) {
				if (this.productos[i] instanceof Movil) {
					productosAMostrar[j] = this.productos[i];
					j++;
				}
			}
			else if (seleccion==3) {
				if (this.productos[i] instanceof Ropa) {
					productosAMostrar[j] = this.productos[i];
					j++;
				}
			}
		}
		return productosAMostrar;
	}
	private String[] darProductosComoStrings(Producto[] productosAStrings) {
		String[] stringsDeProductos = new String[productosAStrings.length];
		for (int i=0; i<productosAStrings.length; i++) {
			if (stringsDeProductos[i]!=null) {
				stringsDeProductos[i] = ConsoleColors.PURPLE_BACKGROUND_BRIGHT+productosAStrings[i].toString()+ConsoleColors.RESET;
			}
		}
		return stringsDeProductos;
	}
	private double darPrecioTotalCarrito(Cliente cliente) {
		double precioTotal=0;
		for (Producto producto : cliente.getCarritoCompra()) {
			if (producto!=null) {
				precioTotal += producto.getPrecio();
			}
		}
		return precioTotal;
	}
}
