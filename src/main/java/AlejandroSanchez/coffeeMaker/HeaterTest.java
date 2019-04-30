package main.java.AlejandroSanchez.coffeeMaker;

import static org.junit.Assert.*;

import org.junit.Test;

public class HeaterTest {

	@Test
	public void getStatus_HeaterStatus_result() {
		Heater heater = new Heater();
		assertEquals(false, heater.getStatus());
	}

	@Test
	public void getSensor_HeaterSensor_resultSensor() {
		Sensor plateSensor = new PlateSensor();
		Heater heater = new Heater();
		heater.setSensor(plateSensor);
		assertEquals(plateSensor, heater.getSensor());
	}

	@Test
	public void on_HeaterOn_resultTrue() {
		Heater heater = new Heater();
		heater.on();
		assertEquals(true, heater.getStatus());
	}

	@Test
	public void off_HeaterOff_resultFalse() {
		Heater heater = new Heater();
		heater.off();
		assertEquals(false, heater.getStatus());
	}
}
