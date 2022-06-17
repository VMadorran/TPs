package ar.unrn.tp8.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.Test;

import ar.unrn.tp8.modelo.FormatoCorto;
import ar.unrn.tp8.modelo.FormatoLargo;
import ar.unrn.tp8.modelo.Persona;

public class FormatoFechaTest {

	@Test
	public void formatoCorto() {

		Persona persona = new Persona(LocalDate.of(2022, 1, 3), new FormatoCorto());
		String resultado = "03-01-2022";

		assertEquals(resultado, persona.fechaNacimiento());
	}

	@Test
	public void formatoLargo() {

		Persona persona = new Persona(LocalDate.of(2022, 1, 3), new FormatoLargo());
		String resultado = "3 de Enero de 2022";

		assertEquals(resultado, persona.fechaNacimiento());
	}
}
