package main.java.MelisaRoman.CoffeeMaker;

public class LightIndicator implements OnOffDevice{
	private boolean status;
	
	public void turnOn() {
		System.out.println("Light turned on");
	}
	
	public void turnOff() {
		System.out.println("Light turned off");
	}
	
	public boolean inOn() {
		return status;
	}
}
