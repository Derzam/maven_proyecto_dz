package ejercicios.clase.string;

public class MainEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cedulaABuscar = "12486858";

		Estudiante fila[] = new Estudiante[5];

		Estudiante jordan = new Estudiante();
		jordan.setNombre("Jordan");
		jordan.setCedula("123456777");
		System.out.println("Valor del atributo estatico " + Estudiante.pais);
		System.out.println("Valor del atributo estatico " + Estudiante.provincia);
		System.out.println("Valor del atributo de instancia " + jordan.getNombre());

		Estudiante maria = new Estudiante();
		maria.setNombre("Maria");
		maria.setCedula("12346547");
		System.out.println("Valor del atributo estatico " + Estudiante.pais);
		System.out.println("Valor del atributo estatico " + Estudiante.provincia);
		System.out.println("Valor del atributo de instancia " + maria.getNombre());

		Estudiante marlon = new Estudiante();
		marlon.setNombre("Marlon");
		marlon.setCedula("134555467");
		System.out.println("Valor del atributo estatico " + Estudiante.pais);
		System.out.println("Valor del atributo estatico " + Estudiante.provincia);
		System.out.println("Valor del atributo de instancia " + marlon.getNombre());

		Estudiante marcos = new Estudiante();
		marcos.setNombre("Marcos");
		marcos.setCedula("176923467");
		System.out.println("Valor del atributo estatico " + Estudiante.pais);
		System.out.println("Valor del atributo estatico " + Estudiante.provincia);
		System.out.println("Valor del atributo de instancia " + marcos.getNombre());

		Estudiante ana = new Estudiante();
		ana.setNombre(" Ana");
		ana.setCedula("17695667");
		System.out.println("Valor del atributo estatico " + Estudiante.pais);
		System.out.println("Valor del atributo estatico " + Estudiante.provincia);
		System.out.println("Valor del atributo de instancia " + ana.getNombre());

	}

}
