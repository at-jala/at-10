package main.java.AlejandroSanchez.coffeeMaker;

import static org.junit.Assert.*;

import org.junit.Test;

public class PlateTest {

	@Test
	public void getHeater_plate_resultHeater() {
		Heater heater = new Heater();
		Sensor sensor = new PlateSensor();
		Plate plate = new Plate(heater, sensor);
		assertEquals(heater, plate.getHeater());
	}

	@Test
	public void getSensor_plate_resultSensor() {
		Heater heater = new Heater();
		Sensor sensor = new PlateSensor();
		Plate plate = new Plate(heater, sensor);
		assertEquals(sensor, plate.getSensor());
	}

}
