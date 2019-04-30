package main.java.MelisaRoman.CoffeeMaker;

public class HeatingElement implements OnOffDevice{
	private boolean status;
	
	public void turnOn() {
		System.out.println("Heater turned on");
	}
	
	public void turnOff() {
		System.out.println("Heater turned off");
	}
	
	public boolean inOn() {
		return status;
	}
}
