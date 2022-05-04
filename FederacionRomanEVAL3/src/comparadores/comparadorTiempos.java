package comparadores;

import java.util.Comparator;

import entidades.Tiempo;

public class comparadorTiempos implements Comparator <Tiempo> {

	@Override
	public int compare(Tiempo h1, Tiempo h2) {
		
		if(h1 == h2)
		return compare(h1,h2);
		return 0;
		 
		
		}
	}