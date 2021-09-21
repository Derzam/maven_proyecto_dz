package ejercicios.fechas;

import java.time.LocalDate;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		
		LocalDate diaHoy = LocalDate.now();
		LocalDate diaFin = diaHoy.plusDays(15);
		
		CursoVacacional curso1 = new CursoVacacional();
		curso1.setNombre("Volley Principiantes");
		curso1.setFechaInicio(diaHoy);
		curso1.setFechaFin(diaFin);
		
		System.out.println("Nombre: " +curso1.getNombre());
		System.out.println("F I: " + curso1.getFechaInicio());
		System.out.println("F F: " + curso1.getFechaFin());
		
		LocalDate diaHoy2 = LocalDate.now();
		LocalDate diaQueInicio = diaHoy2.minusDays(2);
		LocalDate diaQueFinaliza = diaQueInicio.plusDays(20);
		
		CursoVacacional curso2 = new CursoVacacional();
		curso2.setNombre("Volley Principiantes");
		curso2.setFechaInicio(diaHoy);
		curso2.setFechaFin(diaFin);
		
		System.out.println("Nombre: " +curso2.getNombre());
		System.out.println("F I: " + curso2.getFechaInicio());
		System.out.println("F F: " + curso2.getFechaFin());
		
		
	}

}
