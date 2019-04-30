package main.java.AlejandroSanchez.coffeeMaker;

public class Plate {
	Heater heater;
	Sensor sensor;
	
	Plate (Heater heater, Sensor sensor) {
		this.heater = heater;
		this.sensor = sensor;
	}

	public Heater getHeater() {
		return heater;
	}

	public void setHeater(Heater heater) {
		this.heater = heater;
	}

	public Sensor getSensor() {
		return sensor;
	}

	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}
}
