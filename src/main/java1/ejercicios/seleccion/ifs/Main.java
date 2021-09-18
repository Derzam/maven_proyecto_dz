package ejercicios.seleccion.ifs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		String opcion;
		
		do {
		System.out.println("Escoja una opcion");
		System.out.println("1-Realizar transferencia");
		System.out.println("2-Consultar pagos");
		System.out.println("3-SALIR");
		opcion = lector.nextLine();
		
		if (opcion.equals("1")) {
			System.out.println("Ingrese numero de cuenta");
		} else if (opcion.equals("2")) {
			System.out.println("No existen pagos");
		}
		
		}while(!opcion.equals("1"));

	}

}
