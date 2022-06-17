package ar.unrn.tp8.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import ar.unrn.tp8.modelo.Carrito;
import ar.unrn.tp8.modelo.Cliente;
import ar.unrn.tp8.modelo.Colectivo;
import ar.unrn.tp8.modelo.Correo;
import ar.unrn.tp8.modelo.Producto;
import ar.unrn.tp8.modelo.Sistema;

public class MetodoDeEnvioTest {

	@Test
	public void envioPorCorreo() {

		Sistema sistema = new Sistema("Sistema", new Correo());
		var auriculares = new Producto(4, 700);
		var microfono = new Producto(2, 2500);
		var pantalla = new Producto(5, 50000);

		var carrito = new Carrito(auriculares, microfono, pantalla);

		var cliente = new Cliente(carrito);

		double montoEsperado = 262255;

		assertEquals(montoEsperado, sistema.calcularMontoYEnvioTotal(cliente));
	}

	@Test
	public void envioPorColectivo() {

		Sistema sistema = new Sistema("Sistema", new Colectivo());
		var auriculares = new Producto(4, 700);
		var microfono = new Producto(2, 2500);
		var pantalla = new Producto(5, 50000);

		var carrito = new Carrito(auriculares, microfono, pantalla);

		var cliente = new Cliente(carrito);

		double montoEsperado = 259725;

		assertEquals(montoEsperado, sistema.calcularMontoYEnvioTotal(cliente));

	}

}
