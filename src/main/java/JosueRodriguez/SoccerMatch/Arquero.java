package main.java.JosueRodriguez.SoccerMatch;

public class Arquero extends Jugador{
	final String POSICION = "arquero";
	public Arquero(String nombre, String apellido, String lugarNacimiento, int edad) {
		super(nombre, apellido, lugarNacimiento, edad);
		// TODO Auto-generated constructor stub
	}
	public void evitarGol() {
		System.out.println("El "+POSICION+" evito el Gol!!");
	}
}
