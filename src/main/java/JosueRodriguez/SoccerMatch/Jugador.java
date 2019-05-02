package main.java.JosueRodriguez.SoccerMatch;

public abstract class Jugador extends Persona implements IJugador{

	public Jugador(String nombre, String apellido, String lugarNacimiento, int edad) {
		super(nombre, apellido, lugarNacimiento, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pase() {
		System.out.println("Jugardor hace un pase!!");
		
	}

	@Override
	public void tiro() {
		System.out.println("Jugardor hace un tiro!!");
		
	}

	@Override
	public void recepcion() {
		System.out.println("Jugardor recibe el balon!!");
		
	}
	

}
