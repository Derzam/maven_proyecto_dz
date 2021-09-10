package ordenamiento.vectores;

public class Consultorio implements Comparable<Consultorio> {
	

	private String nombre;
	private String apellido;
	private String sintoma;
	private int edad;
	private String datosPaciente;
	
	

	public String getDatosPaciente() {
		return datosPaciente;
	}

	public void setDatosPaciente(String datosPaciente) {
		this.datosPaciente = datosPaciente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getSintoma() {
		return sintoma;
	}

	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int compareTo(Consultorio o) {
		// TODO Auto-generated method stub
		if (this.edad < o.getEdad()) {
			return 1;

		} else if (this.edad == o.getEdad()) {
			return 0;
		} else {
			return -1;
		}

	}

	@Override
	public String toString() {
		return "Consultorio [nombre=" + nombre + ", apellido=" + apellido + ", sintoma=" + sintoma + ", edad=" + edad
				+ "]";
	}

}
