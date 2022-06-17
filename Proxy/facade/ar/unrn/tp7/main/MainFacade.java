package ar.unrn.tp7.main;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import ar.unrn.tp7.modelo.ConsultasDB;

public class MainFacade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var consultas = new ConsultasDB();

		consultas.open();

	
		List<Map<String, String>> listaPersonas = consultas.queryResultAsAsociation("select * from personas");
		for (Map<String, String> map : listaPersonas) {
			for (Entry<String, String> entry : map.entrySet())
				System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		
		List<String[]> listaDePersonas = consultas.queryResultAsArray("select * from personas");
		for (String[] array : listaDePersonas) {

			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}

	
		List<Map<String, String>> listaTelefonos = consultas.queryResultAsAsociation("select * from telefonos");
		for (Map<String, String> map : listaTelefonos) {
			for (Entry<String, String> entry : map.entrySet())
				System.out.println(entry.getKey() + " - " + entry.getValue());
		}


		List<String[]> listaDeArrays = consultas.queryResultAsArray("select * from telefonos");
		for (String[] array : listaDeArrays) {

			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}

		consultas.close();

	}

}
