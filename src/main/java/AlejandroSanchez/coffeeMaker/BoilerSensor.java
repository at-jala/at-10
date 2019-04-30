package main.java.AlejandroSanchez.coffeeMaker;

public class BoilerSensor extends Sensor {
	final int BOILER_EMPTY = 0;
	final int BOILER_NOT_EMPTY = 1;
	
	BoilerSensor() {
		status = BOILER_EMPTY;
	}
}
