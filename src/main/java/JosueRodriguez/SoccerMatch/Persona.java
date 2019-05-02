package main.java.JosueRodriguez.SoccerMatch;

public abstract class Persona {
	String nombre;
	String apellido;
	String lugarNacimiento;
	int edad;

	public Persona(String nombre, String apellido, String lugarNacimiento, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.lugarNacimiento = lugarNacimiento;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getLugarNacimiento() {
		return lugarNacimiento;
	}

	public int getEdad() {
		return edad;
	}

}
