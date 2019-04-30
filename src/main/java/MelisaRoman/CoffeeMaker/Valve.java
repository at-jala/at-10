package main.java.MelisaRoman.CoffeeMaker;

public class Valve implements OnOffDevice {
	private boolean status;
	
	public void turnOn() {
		System.out.println("Valve opened");
	}
	
	public void turnOff() {
		System.out.println("Valve closed");
	}
	
	public boolean inOn() {
		return status;
	}
}
