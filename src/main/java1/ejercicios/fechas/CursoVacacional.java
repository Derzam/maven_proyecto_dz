package ejercicios.fechas;

import java.time.LocalDate;

public class CursoVacacional {
	private String diaHoy;
	private String diaFin;
	private String nombre;
	private String apellido;
	private LocalDate fechaInicio;
	private LocalDate fechaFin;
	public String getDiaHoy() {
		return diaHoy;
	}
	public void setDiaHoy(String diaHoy) {
		this.diaHoy = diaHoy;
	}
	public String getDiaFin() {
		return diaFin;
	}
	public void setDiaFin(String diaFin) {
		this.diaFin = diaFin;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(LocalDate diaHoy2) {
		this.fechaInicio = diaHoy2;
	}
	public LocalDate getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(LocalDate fechaFin) {
		this.fechaFin = fechaFin;
	}
	

}
