package comparadores;

import java.util.Comparator;

import entidades.DatosPersona;

public class ComparadorAlfabetico implements Comparator<DatosPersona> {

	@Override
	public int compare(DatosPersona o1, DatosPersona o2) {

		return o1.getNombre().compareToIgnoreCase(o2.getNombre());
	}

}
