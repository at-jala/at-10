package main.java.AlejandroSanchez.coffeeMaker;

public class PlateSensor extends Sensor {
	final int WARMER_EMPTY = -1;
	final int POT_EMPTY = 0;
	final int POT_NOT_EMPTY = 1;
	
	PlateSensor() {
		status = WARMER_EMPTY;
	}
}
