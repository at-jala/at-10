package main.java.AlejandroSanchez.coffeeMaker;

public class MainClass {

	StartButton startButton = new StartButton();
	LightIndicator lightIndicator = new LightIndicator();
	
	Sensor plateSensor = new PlateSensor();
	Sensor boilerSensor = new BoilerSensor();
	
	Heater plateHeater = new Heater();
	Heater boilerHeater = new Heater();
	
	PressureValve valve = new PressureValve();
	
	CoffeeMaker coffeeMaker = new CoffeeMaker(startButton, lightIndicator, plateHeater, plateSensor, boilerHeater, boilerSensor, valve);
	
	public static void main(String[] args) {
		
	}
	
	
}
