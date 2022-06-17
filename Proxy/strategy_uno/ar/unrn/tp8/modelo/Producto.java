package ar.unrn.tp8.modelo;

public class Producto {

	private int cantidad;
	private double precioUnitario;

	public Producto(int cantidad, double precioUnitario) {
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
	}

	public int cantidadDelProducto() {
		return this.cantidad;
	}

	public double montoTotalDeProducto() {
		
		return this.cantidad * this.precioUnitario;

	}
}
