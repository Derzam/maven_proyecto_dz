package ejercicios.nonacces.final2;

public final class Doctora extends Hospital {
	
	
	public final String NumPacientes="32";
	public String ciudadNacimiento="Quito";
	
	public Doctora() {
		// No se puede reasignar un valor a un atributo final
		NumPacientes="32";
		// ciudadNacimiento no esta declarada como una variable final
		ciudadNacimiento="Riobamba";
		
		
		

}
}
