package ejercicios.clase.string;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//
		
		//modulo
		//módulo
		// contents
		int i = 0;
		String frase = "Programacion de algoritmos modulo II";

		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el nombre del libro");
		String palabra = teclado.nextLine();
		
		boolean resultado = frase.contains(palabra);
		System.out.println("Contiene la palabra " +resultado);
		
		
		// 2 equals
		
		System.out.println("*****************************");
		String cadena1 = "527";
		System.out.println("Ingrese la segunda cadena a comparar");
		String cadena2 = teclado.nextLine();
		boolean resultado2 = cadena1.equals(cadena2);
		System.out.println("Las cadenas son iguales: "+resultado2);
		
		// 3 y 4
		
		System.out.println("*****************************");
		String nombre = "juanito";
		String nombreEnMayuscula = nombre.toUpperCase();
		System.out.println("Nombre en mayuscula: "+ nombreEnMayuscula);
		
		System.out.println("*****************************");
		String nombre1 = "MARIA";
		String nombreEnMinuscula1 = nombre.toLowerCase();
		System.out.println("Nombre en minuscula: "+ nombreEnMinuscula1);
		
	}
	
	

}
