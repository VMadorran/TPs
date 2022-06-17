package ar.unrn.tp8.modelo;

public class Sistema {
	public String nombre;
	private MetodoDeEnvio metodo;

	public Sistema(String nombre, MetodoDeEnvio metodo) {
		this.nombre = nombre;
		this.metodo = metodo;
	}

	public double calcularMontoYEnvioTotal(Cliente cliente) {
		double montoTotal = 0;
		montoTotal = (metodo.calcularCostoDeEnvio(cliente.cantidadDeElementosEnCarro())) + (cliente.montoDeProductos());

		return montoTotal;
	}

}
