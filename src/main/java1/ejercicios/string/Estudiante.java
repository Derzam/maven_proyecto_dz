package ejercicios.string;

import java.util.Scanner;

public class Estudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		int opcion = 0;
		Scanner lector = new Scanner(System.in);

		String cedulaEstudiante[] = new String[5];

		cedulaEstudiante[0] = "1346789102";
		cedulaEstudiante[1] = "1351617301";
		cedulaEstudiante[2] = "1345678922";
		cedulaEstudiante[3] = "1351673456";
		cedulaEstudiante[4] = "1716272734";

		do {
			System.out.println("*****************************************");
			System.out.println("1- Ingresar Estudiante");
			System.out.println("2-Buscar Estudiante");
			System.out.println("3- SALIR ");
			System.out.println("****************************************");
			opcion = lector.nextInt();

			if (opcion == 1) {
				int i = 0;
				Scanner teclado = new Scanner(System.in);
				System.out.println("Ingrese el numero de cedula");
				String cedula1 = teclado.nextLine();
				
			} else if (opcion == 2) {
				int i = 0;

	
				System.out.println("Ingrese el numero de cedula");
				String cedula1 = entrada.nextLine();
				boolean resultado = cedula1.contains(cedulaEstudiante[0]);
				boolean resultado1 = cedula1.contains(cedulaEstudiante[1]);
				boolean resultado2 = cedula1.contains(cedulaEstudiante[2]);
				boolean resultado3 = cedula1.contains(cedulaEstudiante[3]);
				boolean resultado4 = cedula1.contains(cedulaEstudiante[4]);
				
				System.out.println("Contiene al estudiante " +resultado);
				System.out.println("Contiene al estudiante " +resultado1);
				System.out.println("Contiene al estudiante " +resultado2);
				System.out.println("Contiene al estudiante " +resultado3);
				System.out.println("Contiene al estudiante " +resultado4);
				
				
				
			}

		} while (opcion != 3);

	}

}
