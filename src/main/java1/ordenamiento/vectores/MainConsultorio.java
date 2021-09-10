package ordenamiento.vectores;

import java.util.Arrays;
import java.util.Scanner;

public class MainConsultorio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);

		String paciente = null;
		int opcion;
		int b = 0;

		Consultorio paciente1 = new Consultorio();
		paciente1.setDatosPaciente(paciente);

		Consultorio paciente2 = new Consultorio();
		paciente2.setDatosPaciente(paciente);

		Consultorio paciente3 = new Consultorio();
		paciente3.setDatosPaciente(paciente);

		Consultorio paciente4 = new Consultorio();
		paciente4.setDatosPaciente(paciente);

		Consultorio paciente5 = new Consultorio();
		paciente5.setDatosPaciente(paciente);

		Consultorio datosPaciente[] = new Consultorio[5];
		datosPaciente[0] = paciente1;
		datosPaciente[1] = paciente2;
		datosPaciente[2] = paciente3;
		datosPaciente[3] = paciente4;
		datosPaciente[4] = paciente5;

		do {
			System.out.println("----------------------------------------");
			System.out.println("1- Registrar Paciente");
			System.out.println("2-Imprimir Reporte");
			System.out.println("3- SALIR ");
			System.out.println("----------------------------------------");
			opcion = lector.nextInt();

			if (opcion == 1) {
				if(b == 5) {
					b--;
					System.out.println("-------Paciente"+b + "--------");
					System.out.println("Nombre");
					paciente1.setNombre(lector.nextLine());
					System.out.println("Apellido");
					paciente1.setApellido(lector.nextLine());
					System.out.println("Edad");
					paciente1.setEdad(lector.nextInt());
					System.out.println("Sintoma");
					paciente1.setSintoma(lector.nextLine());
					
					System.out.println("Nombre");
					paciente2.setNombre(lector.nextLine());
					System.out.println("Apellido");
					paciente2.setApellido(lector.nextLine());
					System.out.println("Edad");
					paciente2.setEdad(lector.nextInt());
					System.out.println("Sintoma");
					paciente2.setSintoma(lector.nextLine());
					
					System.out.println("Nombre");
					paciente3.setNombre(lector.nextLine());
					System.out.println("Apellido");
					paciente3.setApellido(lector.nextLine());
					System.out.println("Edad");
					paciente3.setEdad(lector.nextInt());
					System.out.println("Sintoma");
					paciente3.setSintoma(lector.nextLine());
					
					System.out.println("Nombre");
					paciente4.setNombre(lector.nextLine());
					System.out.println("Apellido");
					paciente4.setApellido(lector.nextLine());
					System.out.println("Edad");
					paciente4.setEdad(lector.nextInt());
					System.out.println("Sintoma");
					paciente4.setSintoma(lector.nextLine());
					
					System.out.println("Nombre");
					paciente5.setNombre(lector.nextLine());
					System.out.println("Apellido");
					paciente5.setApellido(lector.nextLine());
					System.out.println("Edad");
					paciente5.setEdad(lector.nextInt());
					System.out.println("Sintoma");
					paciente5.setSintoma(lector.nextLine());
					
					
				}
				
				

			} else if (opcion == 2) {
				System.out.println("Reporte de pacientes");
				Arrays.sort(datosPaciente);
				System.out.println("Datos de los Pacientes");
				System.out.println(Arrays.toString(datosPaciente));

			}

		} while (opcion != 3);

	}

}
