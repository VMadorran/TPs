package ar.unrn.tp8.modelo;

import java.time.LocalDate;

public class FormatoLargo implements FormatoDeFecha {

	@Override
	public String fechaConFormato(LocalDate fecha) {
		// TODO Auto-generated method stub
		// 3 de Junio de 1986
		String[] meses = new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto",
				"Septiembre", "Octubre", "Noviembre", "Diciembre" };

		String fechaString = +fecha.getDayOfMonth() + " " + "de" + " " + meses[(fecha.getMonthValue()) - 1] + " " + "de"
				+ " " + fecha.getYear();
		return fechaString;
	}

}
