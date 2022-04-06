package entidades;

import java.time.LocalTime;

public class Responsable {

	private long id;
	private String telefonoProf;
	private LocalTime horarioIni;
	private LocalTime horarioFin;

	public Responsable(long id, String telefonoProf, LocalTime horarioIni, LocalTime horarioFin) {
		this.id = id;
		this.telefonoProf = telefonoProf;
		this.horarioIni = horarioIni;
		this.horarioFin = horarioFin;

	}

	public Responsable() {

	}

	@Override
	public String toString() {
		String ret = "";
		return ret += id + telefonoProf + horarioIni + horarioFin;

	}

	public long getId() {
		return id;
	}

	public void setIdResponsable(long id) {
		this.id = id;
	}

	public String getTelefonoProf() {
		return telefonoProf;
	}

	public void setTelefonoProf(String telefonoProf) {
		this.telefonoProf = telefonoProf;
	}

	public LocalTime getHorarioIni() {
		return horarioIni;
	}

	public void setHorarioIni(LocalTime horarioIni) {
		this.horarioIni = horarioIni;
	}

	public LocalTime getHorarioFin() {
		return horarioFin;
	}

	public void setHorarioFin(LocalTime horarioFin) {
		this.horarioFin = horarioFin;
	}

}
