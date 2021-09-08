package ejercicios.string;

import java.util.Scanner;

public class MainEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);

		int opcion ;
		String cedula = null;
		
		Estudiante cedula1 = new Estudiante();
		cedula1.setGuardadoCedula(cedula);
		
		Estudiante cedula2 = new Estudiante();
		cedula2.setGuardadoCedula(cedula);
		
		Estudiante cedula3 = new Estudiante();
		cedula3.setGuardadoCedula(cedula);
		
		Estudiante cedula4 = new Estudiante();
		cedula4.setGuardadoCedula(cedula);
		
		Estudiante cedula5 = new Estudiante();
		cedula5.setGuardadoCedula(cedula);
		

		Estudiante cedulaEstudiante[] = new Estudiante[5];

		cedulaEstudiante[0]= cedula1;
		cedulaEstudiante[1]=cedula2;
		cedulaEstudiante[2]=cedula3;
		cedulaEstudiante[3]=cedula4;
		cedulaEstudiante[4]=cedula5;

		do {
			System.out.println("*****************************************");
			System.out.println("1- Ingresar Estudiante");
			System.out.println("2-Buscar Estudiante");
			System.out.println("3- SALIR ");
			System.out.println("****************************************");
			opcion = lector.nextInt();
			cedula = lector.nextLine(); 

			if (opcion == 1) {
				int i =0;
				i++;
				System.out.println("Ingrese el numero de cedula");
				cedula= lector.nextLine();
				Estudiante cedulaEstudiante1 = new Estudiante();
				cedulaEstudiante1.setGuardadoCedula(cedula);
				cedulaEstudiante[i]=cedulaEstudiante1;
				
			} else if (opcion == 2) {
	
				System.out.println("Ingrese el numero de cedula");
				for(int i=0; i<5;i++) {
				
				String cadena1 =cedula;
				String cadena2 = lector.nextLine();
				boolean resultado = cadena1.equals(cadena2);
				System.out.println("Contiene la cedula " +resultado);
				}
			}
				
			

		} while (opcion != 3);

	}

}

