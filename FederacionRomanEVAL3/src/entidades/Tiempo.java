package entidades;

import java.time.LocalTime;
import java.util.Scanner;

public class Tiempo {

	private int Hora;
	private int min;
	private int seg;
	private int cent;

	public Tiempo() {
	}

	public void Tiempos(int Hora, int min, int seg, int cent) {
		this.Hora = Hora;
		this.min = min;
		this.seg = seg;
		this.cent = cent;
	}

	public String toString() {
		return "" + "<Hora> :" + "<min> : " + "seg ," + cent;

	}

	@SuppressWarnings("resource")
	public static java.time.LocalTime nuevoTiempo() {
		LocalTime ret = null;
		int hora, min, seg, cent;
		boolean correcto = false;
		Scanner in;
		do {
			System.out.println("Introduzca un valor para la hora del día (0...23)");
			in = new Scanner(System.in, "ISO-8859-1");
			hora = in.nextInt();
			System.out.println("Introduzca un valor para los minutos (0...59)");
			in = new Scanner(System.in, "ISO-8859-1");
			min = in.nextInt();
			System.out.println("Introduzca un valor para los segundos (0...59)");
			in = new Scanner(System.in, "ISO-8859-1");
			seg = in.nextInt();
			System.out.println("Introduzca un valor para las centesimas (0...100)");
			in = new Scanner(System.in, "ISO-8859-1");
			cent = in.nextInt();
			try {
				ret = LocalTime.of(hora, min, seg, cent);
				correcto = true;
			} catch (Exception e) {
				System.out.println("Tiempo introducido no valido.");
				correcto = false;
			}
		} while (!correcto);
		return ret;

	}

	public int getHora() {
		return Hora;
	}

	public void setHora(int hora) {
		Hora = hora;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSeg() {
		return seg;
	}

	public void setSeg(int seg) {
		this.seg = seg;
	}

	public int getCent() {
		return cent;
	}

	public void setCent(int cent) {
		this.cent = cent;
	}

}
