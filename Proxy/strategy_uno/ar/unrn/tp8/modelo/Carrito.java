package ar.unrn.tp8.modelo;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

	private List<Producto> productos = new ArrayList<Producto>();

	public Carrito(Producto... productos) {
		this.productos = List.of(productos);
	}

	public int cantidadDeElementos() {

		int montoTotal = 0;

		for (Producto producto : productos) {
			montoTotal = montoTotal + producto.cantidadDelProducto();
		}

		return montoTotal;
	}

	public double montoTotalDeCarrito() {
		double montoTotal = 0;

		for (Producto producto : productos) {
			montoTotal = montoTotal + producto.montoTotalDeProducto();
		}
		return montoTotal;
	}
}
