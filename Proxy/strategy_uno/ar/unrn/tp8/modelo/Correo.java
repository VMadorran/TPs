package ar.unrn.tp8.modelo;

public class Correo implements MetodoDeEnvio {

	public static final double PORCENTAJE_ADICIONAL = 0.35;
	public static final double ADICIONAL_PRODUCTO = 300;

	@Override
	public double calcularCostoDeEnvio(int cantidad) {
		// TODO Auto-generated method stub

		double montoAdicional = cantidad * ADICIONAL_PRODUCTO;
		double montoPorcentaje = montoAdicional * PORCENTAJE_ADICIONAL;
		return montoAdicional + montoPorcentaje;
	}

}
