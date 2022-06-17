package ar.unrn.tp8.modelo;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

	private List<Producto> productos = new ArrayList<Producto>();

	public Carrito(Producto... productos) {
		this.productos = List.of(productos);
	}

	public int cantidadDeElementos() {
		int cantidadTotal = 0;

		for (Producto producto : this.productos) {
			cantidadTotal += producto.cantidadDelProducto();
		}
		return cantidadTotal;
	}

	public double montoTotalDeCarrito() {

		double montoTotal = 0;

		for (Producto producto : this.productos) {
			montoTotal += producto.montoTotalDeProducto();
		}
		return montoTotal;
	}
}
