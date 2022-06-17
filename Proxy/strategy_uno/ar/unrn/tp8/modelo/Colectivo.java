package ar.unrn.tp8.modelo;

public class Colectivo implements MetodoDeEnvio {

	public static final double PORCENTAJE_ADICIONAL = 0.15;

	@Override
	public double calcularCostoDeEnvio(int cantidad) {
		// TODO Auto-generated method stub
		return cantidad * PORCENTAJE_ADICIONAL;
	}

}
