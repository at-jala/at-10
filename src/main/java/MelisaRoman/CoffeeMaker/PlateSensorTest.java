package main.java.MelisaRoman.CoffeeMaker;
import static org.junit.Assert.*;

import org.junit.Test;

public class PlateSensorTest {

	@Test
	public void isWarmerEmpty_potOutSideThePlate_correctResult() {
		PlateSensor plateSensor = new PlateSensor();
		assertEquals(true, plateSensor.isWarmerEmpty());
	}

	@Test
	public void isWarmerEmpty_potInPlateButEmpty_correctResult() {
		PlateSensor plateSensor = new PlateSensor();
		assertEquals(false, (plateSensor.isPotEmpty())&&plateSensor.isWarmerEmpty());
	}
	
	@Test
	public void isWarmerEmpty_potInPlateNotEmpty_correctResult() {
		PlateSensor plateSensor = new PlateSensor();
		assertEquals(true, plateSensor.isPotEmpty()&&plateSensor.isWarmerEmpty());
	}

}
