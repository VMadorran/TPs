package ar.unrn.tp8.modelo;

public class Cliente {

	private Carrito carrito;

	public Cliente(Carrito carrito) {
		this.carrito = carrito;
	}

	public int cantidadDeElementosEnCarro() {
		return this.carrito.cantidadDeElementos();
	}

	public double montoDeProductos() {
		return this.carrito.montoTotalDeCarrito();
	}
}
