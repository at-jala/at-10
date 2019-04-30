package main.java.AlejandroSanchez.coffeeMaker;

public class CoffeeMaker {
	final boolean OFF = false;
	final boolean ON = true;
	boolean status;
	StartButton button;
	LightIndicator light;
	Plate plate;
	Boiler boiler;

	// TO-DO: ***** More than four parameters is not advised!!! ***** //
	// Need to fix this!!!!!
	// Maybe by using some sort of list.
	public CoffeeMaker(StartButton button, LightIndicator light, Heater plateHeater, Sensor heaterSensor, Heater boilerHeater, Sensor boilerSensor, PressureValve valve) {
		status = OFF; 
		this.button = button;
		this.light = light;
		plate = new Plate(plateHeater, heaterSensor); 
		boiler = new Boiler(boilerHeater, boilerSensor, valve);
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	void off() {
		status = OFF;
	}
	
	void on() {
		status = ON;
	}
}
