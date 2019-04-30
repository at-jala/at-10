package main.java.MadayAlcala.CoffeMaker;

public class WaterSensor extends Sensor{
	private boolean boilerEmptyStatus;
	
	public WaterSensor() {
		this.boilerEmptyStatus = false;
	}
	
	public boolean boilerEmpty() {
		return boilerEmptyStatus;
	}	
	
}
