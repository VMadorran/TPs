package ar.unrn.tp8.modelo;

import java.time.LocalDate;

public class Persona {
	private LocalDate fecha;
	private FormatoDeFecha formato;

	public Persona(LocalDate fechaDeNacimiento, FormatoDeFecha formato) {
		this.fecha = fechaDeNacimiento;
		this.formato = formato;
	}

	public String fechaNacimiento() {
		return this.formato.fechaConFormato(fecha);
	}
}
