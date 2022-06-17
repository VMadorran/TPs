package ar.unrn.tp8.modelo;

import java.time.LocalDate;

public class FormatoCorto implements FormatoDeFecha {

	@Override
	public String fechaConFormato(LocalDate fecha) {
		// TODO Auto-generated method stub
		// Corta: 3-06-1986

		String fechaString = String.format("%1$td-%1$tm-%1$tY", fecha);
		return fechaString;
	}

}
