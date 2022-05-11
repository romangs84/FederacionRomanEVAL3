package entidades;

import java.util.Scanner;

public class Patrocinador {

	private long idPatrocinador;
	private String nombre;
	private String web;
	private double dotacion;
	private Responsable id;

	public Patrocinador(long idPatrocinador, String nombre, String web, double dotacion) {
		this.idPatrocinador = idPatrocinador;
		this.nombre = nombre;
		this.web = web;
		this.dotacion = dotacion;

	}

	public Patrocinador(long idPatrocinador, String nombre, String web, double dotacion, Responsable id) {
		this.idPatrocinador = idPatrocinador;
		this.nombre = nombre;
		this.web = web;
		this.dotacion = dotacion;
		this.id = id;
	}

	public Patrocinador() {

	}

	public static Patrocinador nuevoPatrocinador() {
		Patrocinador ret = null;
		long idPatrocinador = -1;
		String nombre = "";
		String web = "";
		double dotacion = 0.0;
		boolean valido = false;
		do {
			System.out.println("Introduzca el id para el nuevo Patrocinador");
			Scanner in = new Scanner(System.in);
			idPatrocinador = in.nextInt();
			if (idPatrocinador > 0)
				valido = true;
			else
				System.out.println("Valor incorrecto para el identificador.");
		} while (!valido);

		do {
			Scanner in = new Scanner(System.in);
			System.out.println("Introduzca un nombre del Patrocinador");
		

		} while (!valido);

		return ret;
	}

	public long getIdPatrocinador() {
		return idPatrocinador;
	}

	public void setIdPatrocinador(long idPatrocinador) {
		this.idPatrocinador = idPatrocinador;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getWeb() {
		return web;
	}

	public void setWeb(String web) {
		this.web = web;
	}

	public double getDotacion() {
		return dotacion;
	}

	public void setDotacion(double dotacion) {
		this.dotacion = dotacion;
	}

	public Responsable getId() {
		return id;
	}

	public void setId(Responsable id) {
		this.id = id;
	}

}
