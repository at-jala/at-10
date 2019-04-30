package main.java.AndresBurgos.coffeeMaker;

public interface Heater {
	public final int TURN_ON=1;
	public final int TURN_OFF=0;
	
	public void turnOn();

	public void turnOff();
}
