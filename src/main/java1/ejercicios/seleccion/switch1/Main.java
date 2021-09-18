package ejercicios.seleccion.switch1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner lector = new Scanner(System.in);
		String opcion;
		String cuenta;

		do {
			System.out.println("Escoja una opcion");
			System.out.println("1-Realizar transferencia");
			System.out.println("2-Consultar pagos");
			System.out.println("3-SALIR");
			opcion = lector.nextLine();

			switch (opcion) {
			case "1":
				System.out.println("Ingrese numero de cuenta");
				cuenta = lector.nextLine();
				break;

			case "2":
				System.out.println("No existen pagos");
				break;
			case "3":
				System.out.println("Cerrando el sistema");
			default:
				System.out.println("No ha elegido ninguna opcion");
				break;
			}

		} while (!opcion.equals("3"));
		System.out.println("Gracias por preferirnos");

	}
}
