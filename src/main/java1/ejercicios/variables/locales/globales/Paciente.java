package ejercicios.variables.locales.globales;

public class Paciente {
	
	// 
	

	private String analizarPaciente;
	private int diaCita;
	private int turnoPaciente;

	public String getAnalizarPaciente() {
		return analizarPaciente;
	}

	public void setAnalizarPaciente(String analizarPaciente) {
		this.analizarPaciente = analizarPaciente;
	}

	public int getDiaCita() {
		return diaCita;
	}

	public void setDiaCita(int diaCita) {
		this.diaCita = diaCita;
		 int diaCita1 = 21;
		 System.out.println("El dia de cita es:"+ diaCita1);
	}

	


	public int getTurnoPaciente() {
		return turnoPaciente;
		 
	}

	public void setTurnoPaciente(int turnoPaciente) {
		this.turnoPaciente = turnoPaciente;
		int turnoPaciente1 = 2;
		System.out.println("El dia para sacar el turno es: " +turnoPaciente1);
	}

}
