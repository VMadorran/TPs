package ar.unrn.tp8.modelo;

public class Producto {

	private int cantidad;
	private String descripcion;
	private double precioUnitario;

	public Producto(int cantidad, String descripcion, double precioUnotario) {
		this.cantidad = cantidad;
		this.descripcion = descripcion;
		this.precioUnitario = precioUnitario;
	}

	public int cantidadDelProducto() {
		return this.cantidad;
	}

	public double montoTotalDeProducto() {
		return this.cantidad * this.precioUnitario;
	}
}
