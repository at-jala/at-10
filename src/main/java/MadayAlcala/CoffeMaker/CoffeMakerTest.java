package main.java.MadayAlcala.CoffeMaker;

import static org.junit.Assert.*;

import org.junit.Test;

class CoffeMakerTest {

	@Test
	public void boilerStatus_verifyboilerStatus_result() {
		WaterSensor waterSensor = new WaterSensor();
		assertEquals(false, waterSensor.boilerEmpty());
	}

}
