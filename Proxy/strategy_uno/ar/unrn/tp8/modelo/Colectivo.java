package ar.unrn.tp8.modelo;

public class Colectivo implements MetodoDeEnvio {

	public static final double ADICIONAL_PRODUCTO = 175;

	@Override
	public double calcularCostoDeEnvio(int cantidad) {
		// TODO Auto-generated method stub
		return cantidad * ADICIONAL_PRODUCTO;
	}

}
