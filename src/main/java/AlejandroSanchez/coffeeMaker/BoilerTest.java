package main.java.AlejandroSanchez.coffeeMaker;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BoilerTest {

	@Test
	public void getPressure_boilerPressure_result0() {
		Heater heater = new Heater();
		Sensor boilerSensor = new BoilerSensor();
		PressureValve valve = new PressureValve();
		Boiler boiler = new Boiler(heater, boilerSensor, valve);
		assertEquals(0.0, boiler.getPressure(), 0.0);
	}

	@Test
	public void setPressure_boilerPressure115_result115() {
		Heater heater = new Heater();
		Sensor boilerSensor = new BoilerSensor();
		PressureValve valve = new PressureValve();
		Boiler boiler = new Boiler(heater, boilerSensor, valve);
		boiler.setPressure(115);
		assertEquals(115, boiler.getPressure(), 0.0);
	}
}
